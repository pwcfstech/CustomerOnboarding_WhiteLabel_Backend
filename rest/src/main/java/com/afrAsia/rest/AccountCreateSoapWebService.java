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
				
				sendEmails(createAccount);
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
	
	public void sendEmails(Map<String, Object> createAccount){
		
		String host = afrAsiaMailConfig.getMailhost();
		String port = afrAsiaMailConfig.getMailport();
		String mailFrom = afrAsiaMailConfig.getMailFrom();
		String password = afrAsiaMailConfig.getMailPassword();
		String smtpAuthRequired=afrAsiaMailConfig.getSmtpAuthRequired();
		String smtpAuthstarttls=afrAsiaMailConfig.getSmtpAuthstarttls();
		
		infoLog.info("Mail Port" + port);
		infoLog.info("Host is:"+host);
		
		Map<String,AccountCreationDetails> applicantDetailsMap = (Map<String, AccountCreationDetails>) createAccount.get(CRT_CUST);
		AccountCreationDetails accountCreationDetails = applicantDetailsMap.get(INDV_APPLICANT);
		MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest = accountCreationDetails.getMobCreateCustomerSOAPRequest();
		
		MobApplicantPersonalDetail mobApplicantPersonalDetail = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail();
		
		MobAccountAdditionalDetail mobAccountAdditionalDetail = mobCreateCustomerSOAPRequest.getMobAccountAdditionalDetail();
		
		MobRmAppRefId mobRmAppRefId = mobCreateCustomerSOAPRequest.getMobRmAppRefId();
		
		String primApplicantName = mobApplicantPersonalDetail.getFirstName();
		String primApplEmail = mobApplicantPersonalDetail.getEmail();
		String subjectClient="Account opened with AfrAsia Bank";
		String cif = mobApplicantPersonalDetail.getCustCif();
		String accountNumber = mobRmAppRefId.getAccountNumber();
		String rmName = mobRmAppRefId.getRmName();
		String messageToClient="Dear "+primApplicantName+"," + "\n" + "\n" +
				"We are very pleased to inform that your account with AfrAsia Bank is now opened. "+ "\n" +
				"Your Customer Identification (CIF) is "+cif+" and your account number "+accountNumber+". Thank you for the trust you have placed in us."+ "\n" +"\n" +
				"Kind regards," + "\n" + 

				"AfrAsia Bank Team";
		if(primApplEmail!=null && !"".equals(primApplEmail))
		{
			try {
				AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, primApplEmail, subjectClient, messageToClient, smtpAuthRequired, smtpAuthstarttls);
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
		RMDetails rmDetails = accountCreationSOAPService.getRMDetails(mobRmAppRefId.getRmUsedId());
		if(rmDetails!=null)
		{
			toAddrRM=rmDetails.getRmEmailId();
		}
		
		String messageToRM="Dear "+rmName+"," + "\n" + "\n" +
				"We are pleased to inform you that account for your customer "+"\b"+primApplicantName+"\b"+" is now opened."+ "\n" + "\n" +
				"Account details are:"+ "\n" +
				"Account Number: "+accountNumber+ "\n" +
				"CIF Number: "+cif+  "\n" + "\n" +
				"Kind regards," + "\n" + 
				"AfrAsia Bank";
		String subjectToRM="Account opened for customer - "+primApplicantName;
		
		try {
			AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, toAddrRM, subjectToRM, messageToRM, smtpAuthRequired, smtpAuthstarttls);
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
		
		String checkBookMail = "Chequebooks@afrasiabank.com";
		String primApplFullName = mobApplicantPersonalDetail.getFirstName() + mobApplicantPersonalDetail.getLastName();
		String ibanNo = "";//to be done
		String subCheque = "Ordering Cheque book for customer - "+primApplFullName;
		String msgForCheque = "Please provide cheque book according to the following details"+"\n"+
						"a.      Name of client: "+primApplFullName+"\n"+
						"b.      IBAN Number: "+ibanNo+"\n"+
						"c.      Account Number: "+accountNumber+"\n"+
						"d.      Number of leaves required for the cheque book - 25"+"\n"+"\n"+
						"Kind regards," + "\n" + 
						"AfrAsia Bank";
		
		
		try {
			AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, checkBookMail, subCheque, msgForCheque, smtpAuthRequired, smtpAuthstarttls);
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
		
		if(mobAccountAdditionalDetail.getInternetBanking())
		{
			String mailAddr = "Internet.Banking@afrasiabank.com";
			String ibUn = mobAccountAdditionalDetail.getIbUsername();
			String mobNo = mobCreateCustomerSOAPRequest.getMobApplicantCommDetail().getMobNo().toString();
			String otpEmail = mobAccountAdditionalDetail.getOtpEmail().toString();
			String otpSMS = mobAccountAdditionalDetail.getOtpSms().toString();
			String subIB = "Internet Banking details";
			String msgForIB ="Internet Banking Application Form details - "+"\n"+ 
							"1. Customer Name: "+primApplFullName+"\n"+ 
							"2. Username: "+ibUn+"\n"+ 
							"3. Acc No: "+accountNumber +"\n"+ 
							"4. Email: "+primApplEmail+"\n"+ 
							"5. Mobile No: "+mobNo+"\n"+ 
							"6. OTP via SMS: "+otpSMS+"\n"+ 
							"7. OTP via Email: "+otpEmail+"\n"+ 
							"8. CIF of custome: "+cif+"\n"+"\n"+
							"Kind regards," + "\n" + 
							"AfrAsia Bank";
							
			
			try {
				AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, mailAddr, subIB, msgForIB, smtpAuthRequired, smtpAuthstarttls);
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
			String subEstmt = "E-Statement Form details";
			String msgForEstmt ="E-Statement Form details - "+"\n"+ 
							"1. Name of client: "+primApplFullName+"\n"+ 
							"2. Account Number: "+accountNumber +"\n"+ 
							"3. Email Address: "+primApplEmail+"\n"+ "\n"+
							"Kind regards," + "\n" + 
							"AfrAsia Bank";
							
			try {
				AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, mailAddr, subEstmt, msgForEstmt, smtpAuthRequired, smtpAuthstarttls);
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
		
		debugLog.debug("host :: "+host+","+" port :: "+port+","+" mailFrom :: "+mailFrom+","+" password :: "+password+","
				+" smtpAuthRequired :: "+smtpAuthRequired+","+" smtpAuthstarttls :: "+smtpAuthstarttls+","
				+" MobCreateCustomerSOAPRequest :: "+mobCreateCustomerSOAPRequest);
	}
	
}
