package com.afrAsia.rest;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.Utils.AfrAsiaEmailUtility;
import com.afrAsia.Utils.AfrAsiaMailConfig;
import com.afrAsia.Utils.AfrAsiaSMSUtility;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.AccountCreationDetails;
import com.afrAsia.entities.request.ApplicationDetailsReq;
import com.afrAsia.entities.request.MobCreateCustomerSOAPRequest;
import com.afrAsia.entities.response.ApplicationDetailsResp;
import com.afrAsia.entities.response.ApplicationDetailsResp.Applicant;
import com.afrAsia.entities.response.ApplicationDetailsResp.ApplicantAccount;
import com.afrAsia.entities.response.ApplicationDetailsResp.Data;
import com.afrAsia.entities.transactions.MobAccountAdditionalDetail;
import com.afrAsia.entities.transactions.MobApplicantCommDetail;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobRmAppRefId;
import com.afrAsia.service.AccountCreationSOAPService;
import com.ofss.fcubs.gw.ws.CreateCustomerSOAPConstants;


@Component

@Path("{version}")
public class AccountCreateSoapWebService implements CreateCustomerSOAPConstants{
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	private AccountCreationSOAPService accountCreationSOAPService;
	private AfrAsiaMailConfig afrAsiaMailConfig;

	public AfrAsiaMailConfig getAfrAsiaMailConfig() {
		return afrAsiaMailConfig;
	}
	public void setAfrAsiaMailConfig(AfrAsiaMailConfig afrAsiaMailConfig) {
		this.afrAsiaMailConfig = afrAsiaMailConfig;
	}
	public AccountCreationSOAPService getAccountCreationSOAPService() {
		return accountCreationSOAPService;
	}
	public void setAccountCreationSOAPService(AccountCreationSOAPService accountCreationSOAPService) {
		this.accountCreationSOAPService = accountCreationSOAPService;
	}

	@POST
	@Path("/createAccSoap")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAccountSOAPDetails(ApplicationDetailsReq applicationDetailsReq) {
	
		infoLog.info("here in SOAP service call for create account Service");
		ApplicationDetailsResp applicationDetailsResp = new ApplicationDetailsResp();
		MsgHeader msgHeader= new MsgHeader();
		try{
			if(validateRequest(applicationDetailsReq)){
				Long appId = applicationDetailsReq.getData().getRefNo();
				String userId = applicationDetailsReq.getData().getUserId();
				String recordId = applicationDetailsReq.getData().getRecordId();
				long lRecordId = 0;
				if(null != recordId && !recordId.isEmpty()){
					try{
						lRecordId = Long.parseLong(recordId);
					}
					catch(NumberFormatException nfe){
						errorLog.error("Found number format exception for recordId",nfe);
						lRecordId = 0;
					}
				}
			
				Map<String, Object> createAccount = accountCreationSOAPService.createAccount(appId, userId , lRecordId);
				
				applicationDetailsResp = getApplicationDetailsResp(createAccount, appId, recordId, userId);
				
				sendEmails(createAccount,applicationDetailsResp);
				sendSMSToCustomer(createAccount);
				if (applicationDetailsResp!=null) {
					return Response.ok(applicationDetailsResp, MediaType.APPLICATION_JSON).build();
				}
				else{
					com.afrAsia.entities.jpa.MsgHeader.Error error = new MsgHeader(). new Error();
					errorLog.error("No data for this application reference no.");
					error.setCd("404");
					error.setRsn("No data for this application reference no.");
					msgHeader.setError(error);
					applicationDetailsResp = new ApplicationDetailsResp();
					applicationDetailsResp.setMsgHeader(msgHeader);
					return Response.ok(applicationDetailsResp, MediaType.APPLICATION_JSON).build();
				}
				
			}
			else{
				errorLog.error("validateRequest() method returned false");
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn("validateRequest() method returned false");
				msgHeader.setError(error);
				applicationDetailsResp.setMsgHeader(msgHeader);
				errorLog.error("applicationDetailsResp in createAccountSOAPDetails(),AccountCreateSoapWebService.java : "+applicationDetailsResp);
				return Response.ok(applicationDetailsResp, MediaType.APPLICATION_JSON).build();
			}
			
		}catch(Exception e){
			errorLog.error("There was an error: ",e);
			com.afrAsia.entities.jpa.MsgHeader.Error error = new MsgHeader().new Error();
			error.setCd("404");
			error.setRsn(e.getMessage());
			msgHeader.setError(error);
			applicationDetailsResp.setMsgHeader(msgHeader);
			return Response.ok(applicationDetailsResp, MediaType.APPLICATION_JSON).build();
		}
		//return null;
	}
	
	private boolean validateRequest(ApplicationDetailsReq applicationDetailsReq) {
		if (applicationDetailsReq != null && applicationDetailsReq.getData() != null){
			return true;
		} else {
			errorLog.error("Invalid Request from Get Application Details ");
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	private ApplicationDetailsResp getApplicationDetailsResp(Map<String, Object> createAccount, Long appId, String recordId,String userId ){
		
		Map<String, AccountCreationDetails> createCustDtlsMap =	(Map<String, AccountCreationDetails>) createAccount.get(CRT_CUST);
		ApplicationDetailsResp applicationDetailsResp = new ApplicationDetailsResp();
		Data data = new Data();
		data.setRefNo(appId);
		data.setRecordId(recordId);
		data.setUserId(userId);
		applicationDetailsResp.setData(data);
		List<Applicant> applicants = applicationDetailsResp.getApplicants();
		
		for(String key: createCustDtlsMap.keySet()){
			debugLog.debug("key:"+key);
			Applicant applicant = new Applicant();
			AccountCreationDetails accountCreationDetails = createCustDtlsMap.get(key);
			if( null != accountCreationDetails){
				applicant.setCif(accountCreationDetails.getCif());
				applicant.setCifExist(accountCreationDetails.isCifExist());
				applicant.setApplicantRefNo(accountCreationDetails.getRefNo());
				applicant.setApplicantType(accountCreationDetails.getRefNoOwner());
				applicant.setSoapErrorMsg((List<com.ofss.fcubs.service.fcubscustomerservice.ERRORType>)accountCreationDetails.getSoapResError());
				applicant.setOtherErrorMsg(accountCreationDetails.getOtherErrorMsg());
				
				applicants.add(applicant);
			}
		}
		
		Map<String, Object> createAfrAsiaAccount = (Map<String, Object>) createAccount.get(CRT_ACC);
		ApplicantAccount applicantAccount = new ApplicantAccount();
		if( null != createAfrAsiaAccount){
			String msgstat = createAfrAsiaAccount.get(MSGSTAT).toString();
			if( null != msgstat && !msgstat.isEmpty()){
				if(msgstat.equalsIgnoreCase(SUCCESS)){
					applicantAccount.setAccountCreated(true);
				}
				else{
					applicantAccount.setAccountCreated(false);
				}
			}
			applicantAccount.setAccNo(createAfrAsiaAccount.get(ACCNO).toString());
			if(null!=createAfrAsiaAccount.get(IBANNO))
			{
				applicantAccount.setIbanNo(createAfrAsiaAccount.get(IBANNO).toString());
			}
			if(null != createAfrAsiaAccount.get(ERROR)){
				List<com.ofss.fcubs.service.fcubsaccservice.ERRORType> soapErrorMsg = (List<com.ofss.fcubs.service.fcubsaccservice.ERRORType>)createAfrAsiaAccount.get(ERROR);
				applicantAccount.setSoapErrorMsg(soapErrorMsg);
			}
			applicantAccount.setOtherErrorMsg(null);
			}
		applicationDetailsResp.setApplicantAccount(applicantAccount);
		//==============================================================================
	 return applicationDetailsResp;
	}
	
	public void sendEmails(Map<String, Object> createAccount,ApplicationDetailsResp applicationDetailsResp){
		
		String host = afrAsiaMailConfig.getMailhost();
		String port = afrAsiaMailConfig.getMailport();
		String mailFrom = afrAsiaMailConfig.getMailFrom();
		String username = "afrasiabank\\" +afrAsiaMailConfig.getUsername();
		String password = afrAsiaMailConfig.getMailPassword();
		String smtpAuthRequired=afrAsiaMailConfig.getSmtpAuthRequired();
		String smtpAuthstarttls=afrAsiaMailConfig.getSmtpAuthstarttls();
		
		infoLog.info("Mail Port" + port);
		infoLog.info("Host is:"+host);
		
		Map<String,AccountCreationDetails> applicantDetailsMap = (Map<String, AccountCreationDetails>) createAccount.get(CRT_CUST);
		AccountCreationDetails accountCreationDetails = applicantDetailsMap.get(INDV_APPLICANT);
		AccountCreationDetails gdnAccCreationDetails = applicantDetailsMap.get(INDV_GUARDIAN);
		MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest = accountCreationDetails.getMobCreateCustomerSOAPRequest();
		
		MobCreateCustomerSOAPRequest gdnCreateCustomerSOAPRequest = null;
		
		if(gdnAccCreationDetails!=null)
		{
			gdnCreateCustomerSOAPRequest=gdnAccCreationDetails.getMobCreateCustomerSOAPRequest();
		}
		MobApplicantPersonalDetail mobApplicantPersonalDetail = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail();
		
		MobAccountAdditionalDetail mobAccountAdditionalDetail = mobCreateCustomerSOAPRequest.getMobAccountAdditionalDetail();
		
		MobRmAppRefId mobRmAppRefId = mobCreateCustomerSOAPRequest.getMobRmAppRefId();
		
		String primApplicantName = mobApplicantPersonalDetail.getFirstName();
		String primApplFullName = mobApplicantPersonalDetail.getFirstName() +" "+ mobApplicantPersonalDetail.getLastName();
		String title = mobApplicantPersonalDetail.getTitle();
		String primApplEmail = "";
		
		
		if(gdnCreateCustomerSOAPRequest!=null && gdnCreateCustomerSOAPRequest.getMobApplicantPersonalDetail()!=null)
		{
			primApplEmail = gdnCreateCustomerSOAPRequest.getMobApplicantPersonalDetail().getEmail();
		}
		else
		{
			primApplEmail = mobApplicantPersonalDetail.getEmail();
		}
		String subjectClient="Account opened with AfrAsia Bank";
		String cif = mobApplicantPersonalDetail.getCustCif();
		String accountNumber = mobRmAppRefId.getAccountNumber();
		
		if(accountNumber!=null && !"".equals(accountNumber))
		{
			String messageToClient="Dear "+title+" "+primApplFullName+"," + "<br>" + "<br>" +
					"We are very pleased to inform that your account with AfrAsia Bank is now opened. "+ "<br>" +
					"Your Customer Identification (CIF) is "+cif+" and your account number "+accountNumber+". Thank you for the trust you have placed in us."+ "<br>" +"<br>" +
					"Kind regards," + "<br>" + 
	
					"AfrAsia Bank Team";
			if(primApplEmail!=null && !"".equals(primApplEmail))
			{
				try {
					AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, username, password, primApplEmail, subjectClient, messageToClient, smtpAuthRequired, smtpAuthstarttls);
					infoLog.info("Customer EMail sent success");
				} catch (MessagingException e) {
					errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (IOException e) {
					errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (NamingException e) {
					errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (Exception e) {
					errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
				}
			}
			
			String toAddrRM = "";
			String rmName = "";
			RMDetails rmDetails = accountCreationSOAPService.getRMDetails(mobRmAppRefId.getRmUsedId());
			if(rmDetails!=null)
			{
				toAddrRM=rmDetails.getRmEmailId();
				rmName = rmDetails.getRmName();
			}
			
			String messageToRM="Dear "+rmName+"," + "<br>" + "<br>" +
					"We are pleased to inform you that account for your customer "+"\b"+primApplFullName+"\b"+" is now opened."+ "<br>" + "<br>" +
					"Account details are:"+ "<br>" +
					"Account Number: "+accountNumber+ "<br>" +
					"CIF Number: "+cif+  "<br>" + "<br>" +
					"Kind regards," + "<br>" + 
					"AfrAsia Bank";
			String subjectToRM="Account opened for customer - "+primApplFullName;
			
			try {
				AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, username, password, toAddrRM, subjectToRM, messageToRM, smtpAuthRequired, smtpAuthstarttls);
				infoLog.info("RM EMail sent success");
			} catch (MessagingException e) {
				errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
			} catch (IOException e) {
				errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
			} catch (NamingException e) {
				errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
			} catch (Exception e) {
				errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
			}
			
			if(ACCOUNT_CLASS_CURRENT_CHQ_BOOK.equals(mobCreateCustomerSOAPRequest.getMobAccountDetail().getAccountType()))
			{
				String checkBookMail = "Chequebooks@afrasiabank.com";
				//String checkBookMail = "Cherilyne.Jugmohun@afrasiabank.com";
				String ibanNo = applicationDetailsResp.getApplicantAccount().getIbanNo();
				String subCheque = "Ordering Cheque book for customer - "+primApplFullName;
				String msgForCheque = "Please provide cheque book according to the following details"+"<br>"+
								"a.      Name of client: "+primApplFullName+"<br>"+
								"b.      IBAN Number: "+(null!=ibanNo?ibanNo:BLANK)+"<br>"+
								"c.      Account Number: "+accountNumber+"<br>"+
								"d.      Number of leaves required for the cheque book - 25"+"<br>"+"<br>"+
								"Kind regards," + "<br>" + 
								"AfrAsia Bank";
				
				
				try {
					AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, username, password, checkBookMail, subCheque, msgForCheque, smtpAuthRequired, smtpAuthstarttls);
					infoLog.info("Checkbook EMail sent success");
				} catch (MessagingException e) {
					errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (IOException e) {
					errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (NamingException e) {
					errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (Exception e) {
					errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
				}
			}
			
			if(mobAccountAdditionalDetail.getInternetBanking())
			{
				String mailAddr = "Internet.Banking@afrasiabank.com";
				//String mailAddr = "Cherilyne.Jugmohun@afrasiabank.com";
				String ibUn = mobAccountAdditionalDetail.getIbUsername();
				String mobNo = "";
				if(mobCreateCustomerSOAPRequest.getMobApplicantCommDetail().getMobNo()!=null)
					mobNo = mobCreateCustomerSOAPRequest.getMobApplicantCommDetail().getMobNo().toString();
				String otpEmail = "";
				if(mobAccountAdditionalDetail.getOtpEmail()!=null)
					otpEmail = mobAccountAdditionalDetail.getOtpEmail().toString();
				String otpSMS = "";
				if(mobAccountAdditionalDetail.getOtpSms()!=null)
					otpSMS = mobAccountAdditionalDetail.getOtpSms().toString();
				String subIB = "Internet Banking details";
				String msgForIB ="Internet Banking Application Form details - "+"<br>"+ 
								"1. Customer Name: "+primApplFullName+"<br>"+ 
								"2. Username: "+(ibUn==null?"":ibUn)+"<br>"+ 
								"3. Acc No: "+accountNumber +"<br>"+ 
								"4. Email: "+(primApplEmail==null?"":primApplEmail)+"<br>"+ 
								"5. Mobile No: "+mobNo+"<br>"+ 
								"6. OTP via SMS: "+("true".equalsIgnoreCase(otpSMS)?"YES":"NO")+"<br>"+ 
								"7. OTP via Email: "+("true".equalsIgnoreCase(otpEmail)?"YES":"NO")+"<br>"+ 
								"8. CIF of customer: "+cif+"<br>"+"<br>"+
								"Kind regards," + "<br>" + 
								"AfrAsia Bank";
				debugLog.debug("Message for IB: "+msgForIB);			
				
				try {
					AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, username, password, mailAddr, subIB, msgForIB, smtpAuthRequired, smtpAuthstarttls);
					infoLog.info("Internet Banking EMail sent success");
				} catch (MessagingException e) {
					errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (IOException e) {
					errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (NamingException e) {
					errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (Exception e) {
					errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
				}
			}
				
			if(mobAccountAdditionalDetail.getStmtDeliveryEstmt())
			{
				String mailAddr = "Account-CifOpening@afrasiabank.com";
				//String mailAddr = "Cherilyne.Jugmohun@afrasiabank.com";
				String subEstmt = "E-Statement Form details";
				String msgForEstmt ="E-Statement Form details - "+"<br>"+ 
								"1. Name of client: "+primApplFullName+"<br>"+ 
								"2. Account Number: "+accountNumber +"<br>"+ 
								"3. Email Address: "+(primApplEmail==null?"":primApplEmail)+"<br>"+ "<br>"+
								"Kind regards," + "<br>" + 
								"AfrAsia Bank";
								
				try {
					AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, username, password, mailAddr, subEstmt, msgForEstmt, smtpAuthRequired, smtpAuthstarttls);
					infoLog.info("Internet Banking EMail sent success");
				} catch (MessagingException e) {
					errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (IOException e) {
					errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (NamingException e) {
					errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
				} catch (Exception e) {
					errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
				}
			}
		}
		debugLog.debug("host :: "+host+","+" port :: "+port+","+" mailFrom :: "+mailFrom+","+" password :: "+password+","
				+" smtpAuthRequired :: "+smtpAuthRequired+","+" smtpAuthstarttls :: "+smtpAuthstarttls+","
				+" MobCreateCustomerSOAPRequest :: "+mobCreateCustomerSOAPRequest);
	}
	public void sendSMSToCustomer(Map<String, Object> createAccount){
		Map<String,AccountCreationDetails> applicantDetailsMap = (Map<String, AccountCreationDetails>) createAccount.get(CRT_CUST);
		AccountCreationDetails accountCreationDetails = applicantDetailsMap.get(INDV_APPLICANT);
		AccountCreationDetails gdnAccCreationDetails = applicantDetailsMap.get(INDV_GUARDIAN);
		MobCreateCustomerSOAPRequest gdnCreateCustomerSOAPRequest = null;
		
		if(gdnAccCreationDetails!=null)
		{
			gdnCreateCustomerSOAPRequest=gdnAccCreationDetails.getMobCreateCustomerSOAPRequest();
		}
		MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest = accountCreationDetails.getMobCreateCustomerSOAPRequest();
		
		MobApplicantPersonalDetail mobApplicantPersonalDetail = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail();
		
		MobApplicantCommDetail mobApplicantCommDetail = mobCreateCustomerSOAPRequest.getMobApplicantCommDetail();
		
		MobRmAppRefId mobRmAppRefId = mobCreateCustomerSOAPRequest.getMobRmAppRefId();
		String primApplicantName = mobApplicantPersonalDetail.getFirstName()+" "+mobApplicantPersonalDetail.getLastName();
		String title = mobApplicantPersonalDetail.getTitle();
		String cif = mobApplicantPersonalDetail.getCustCif();
		String accountNumber = mobRmAppRefId.getAccountNumber();
		String smsContent = "Dear "+title+" "+primApplicantName+", we are very pleased to inform that your account with AfrAsia Bank is now opened. "
				+ "Your Customer Identification (CIF) is "+cif+" and your account number "+accountNumber+
				". Thank you for the trust you have placed in us. Regards, AfrAsia Bank Team ";
		Long cc= 0L;
		Long mobNo = 0L;
		if(gdnCreateCustomerSOAPRequest!=null && gdnCreateCustomerSOAPRequest.getMobApplicantCommDetail()!=null)
		{
			cc = gdnCreateCustomerSOAPRequest.getMobApplicantCommDetail().getMobNoCc();
			mobNo = gdnCreateCustomerSOAPRequest.getMobApplicantCommDetail().getMobNo();
		}
		else
		{
			cc = mobApplicantCommDetail.getMobNoCc();
			mobNo = mobApplicantCommDetail.getMobNo();
		}
		
		if(cc!=null && cc!=0L && mobNo!=null && mobNo!=0L && cif!=null && !"".equals(cif) && accountNumber!=null && !"".equals(accountNumber))
		{
			String mobNoString = cc.toString()+mobNo.toString();
		
			String url = "http://41.212.214.205:81/cgi-bin/BMP_SendTextMsg?"
					+ "UserName=afrasia1&PassWord=4fr4s14&UserData="
					+ smsContent
					+ "&Concatenated=0&SenderId=23052581818&Deferred=false&Number="
					+ mobNoString
					+ "&Dsr=false";
			
			debugLog.debug("primApplicantName  :: "+primApplicantName+"smsContent  :: "+smsContent+
					"mobNo  :: "+mobNoString+"url  :: "+url);
			try {
				AfrAsiaSMSUtility.sendSMS(url);
				infoLog.info("SMS sent success");
			}  catch (IOException e) {
				errorLog.error("IOException found .java : ",e);
			}	catch (Exception e) {
				errorLog.error("Exception found .java : ",e);
			}
		}
	}	
}
