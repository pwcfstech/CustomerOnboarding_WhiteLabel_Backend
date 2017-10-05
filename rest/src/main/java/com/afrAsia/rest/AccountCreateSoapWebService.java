package com.afrAsia.rest;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.request.AccountCreationDetails;
import com.afrAsia.entities.request.ApplicationDetailsReq;
import com.afrAsia.entities.response.ApplicationDetailsResp;
import com.afrAsia.entities.response.ApplicationDetailsResp.Applicant;
import com.afrAsia.entities.response.ApplicationDetailsResp.ApplicantAccount;
import com.afrAsia.entities.response.ApplicationDetailsResp.Data;
import com.afrAsia.service.AccountCreationSOAPService;
import com.ofss.fcubs.gw.ws.CreateCustomerSOAPConstants;


@Component

@Path("{version}")
public class AccountCreateSoapWebService implements CreateCustomerSOAPConstants{
	private AccountCreationSOAPService accountCreationSOAPService;
	

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
	
		System.out.println("here in SOAP service call for create account Service");
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
						System.out.println("Found number format exception for recordId"+nfe.getMessage());
						lRecordId = 0;
					}
				}
			
				Map<String, Object> createAccount = accountCreationSOAPService.createAccount(appId, userId , lRecordId);
				
				ApplicationDetailsResp applicationDetailsResp = getApplicationDetailsResp(createAccount, appId, recordId, userId);
				
				
				if (applicationDetailsResp!=null) {
					return Response.ok(applicationDetailsResp, MediaType.APPLICATION_JSON).build();
				}
				else{
					com.afrAsia.entities.jpa.MsgHeader.Error error = new MsgHeader(). new Error();
					error.setCd("404");
					error.setRsn("No data for this application reference no.");
					msgHeader.setError(error);
					applicationDetailsResp = new ApplicationDetailsResp();
					applicationDetailsResp.setMsgHeader(msgHeader);
					return Response.ok(applicationDetailsResp, MediaType.APPLICATION_JSON).build();
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
			com.afrAsia.entities.jpa.MsgHeader.Error error = new MsgHeader().new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error while getting details. Please try again later.");
		}
		return null;
	}
	
	private boolean validateRequest(ApplicationDetailsReq applicationDetailsReq) {
		if (applicationDetailsReq != null && applicationDetailsReq.getData() != null){
			return true;
		} else {
			System.out.println("Invalid Request from Get Application Details ");
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
		//	System.out.println("key:"+key);
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
	
}
