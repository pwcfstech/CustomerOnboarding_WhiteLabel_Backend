package com.afrAsia.rest;

import java.io.IOException;
import java.util.List;

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

import com.afrAsia.CommonUtils;
import com.afrAsia.Utils.AfrAsiaEmailUtility;
import com.afrAsia.Utils.AfrAsiaMailConfig;
import com.afrAsia.dao.UpdateApplCheckStatusDAO;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.ApplCheckStatusReq;
import com.afrAsia.entities.request.ApplCheckStatusReq.Data;
import com.afrAsia.entities.response.AccountCreateResponse;
import com.afrAsia.entities.response.ApplCheckStatusResponse;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.service.UpdateApplCheckStatusService;


@Component

@Path("{version}")
public class UpdateApplCheckStatusRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private UpdateApplCheckStatusService updateApplCheckStatusService;

	private UpdateApplCheckStatusDAO updateApplCheckStatusDAO; 
	
	private AfrAsiaMailConfig afrAsiaMailConfig;
	
	public AfrAsiaMailConfig getAfrAsiaMailConfig() {
		return afrAsiaMailConfig;
	}

	public void setAfrAsiaMailConfig(AfrAsiaMailConfig afrAsiaMailConfig) {
		this.afrAsiaMailConfig = afrAsiaMailConfig;
	}

	
	public UpdateApplCheckStatusService getUpdateApplCheckStatusService() {
		return updateApplCheckStatusService;
	}

	public void setUpdateApplCheckStatusService(UpdateApplCheckStatusService updateApplCheckStatusService) {
		this.updateApplCheckStatusService = updateApplCheckStatusService;
	}

	public UpdateApplCheckStatusDAO getUpdateApplCheckStatusDAO() {
		return updateApplCheckStatusDAO;
	}

	public void setUpdateApplCheckStatusDAO(UpdateApplCheckStatusDAO updateApplCheckStatusDAO) {
		this.updateApplCheckStatusDAO = updateApplCheckStatusDAO;
	}
	
	@POST
	@Path("/updateApplicationCheckStatus")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateApplicationCheckStatus(ApplCheckStatusReq applCheckStatusReq) {
		infoLog.info("Entered UpdateApplCheckStatusRestService Service... Inside updateApplicationCheckStatus method.");
		debugLog.debug("ApplCheckStatusReq: "+applCheckStatusReq);
		ApplCheckStatusResponse applCheckStatusResponse = new ApplCheckStatusResponse();
		MsgHeader msgHeader= new MsgHeader();
		try{
			String checkStatusRequest = validateRequest(applCheckStatusReq);
			if (checkStatusRequest.equals("Success")) {
				applCheckStatusResponse = updateApplCheckStatusService.updateApplCheckStatus(applCheckStatusReq);
				
				sendEmails(applCheckStatusReq,applCheckStatusResponse);
				
				if (applCheckStatusResponse!=null) {
					return Response.ok(applCheckStatusResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					errorLog.error(" No data for this application reference no ");
					Error error = new MsgHeader(). new Error();
					error.setCd("404");
					error.setRsn("No data for this application reference no.");
					msgHeader.setError(error);
					applCheckStatusResponse = new ApplCheckStatusResponse();
					applCheckStatusResponse.setMsgHeader(msgHeader);
					errorLog.error(" applicationDetailsResponse in updateApplicationCheckStatus(),UpdateApplCheckStatusRestService : "+applCheckStatusResponse);
					return Response.ok(applCheckStatusResponse, MediaType.APPLICATION_JSON).build();
				}
			}
			else{
				errorLog.error(" Invalid request in updateApplicationCheckStatus(),UpdateApplCheckStatusRestService");
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn("Invalid Request");
				msgHeader.setError(error);
				applCheckStatusResponse.setMsgHeader(msgHeader);
				return Response.ok(applCheckStatusResponse, MediaType.APPLICATION_JSON).build();	
			}
		}catch(Exception e){
			errorLog.error(" Sorry, there was an error while updating application check status details. Please try again later ");
			e.printStackTrace();
			Error error = new MsgHeader(). new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error while updating application check status details. Please try again later.");
			msgHeader.setError(error);
			applCheckStatusResponse.setMsgHeader(msgHeader);
			return Response.ok(applCheckStatusResponse, MediaType.APPLICATION_JSON).build();
		}
	}
	

	private String validateRequest(ApplCheckStatusReq applCheckStatusReq) {

		if (applCheckStatusReq != null && applCheckStatusReq.getData() != null) {

			Data applCheckStatusData = applCheckStatusReq.getData();
			debugLog.debug(" applCheckStatusData in validateRequest(),UpdateApplCheckStatusRestService.java : "+applCheckStatusData);

			/*String applCheckStatusDataValidated = validateApplCheckStatusDetails(applCheckStatusData);
			if (!applCheckStatusDataValidated.equalsIgnoreCase("Success")) {
				errorLog.error(" applCheckStatusDataValidated is not equal to success in validateRequest(),UpdateApplCheckStatusRestService.java");
				return applCheckStatusDataValidated;
			}*/
			
			List<Data.Checks> checks = applCheckStatusReq.getData().getChecks();
			debugLog.debug(" checks in validateRequest(),UpdateApplCheckStatusRestService.java : "+checks);
			if(checks!=null && checks.size()!=0)
			{
				String applChecksValidated = validateApplChecks(checks);
				if (!applChecksValidated.equalsIgnoreCase("Success")) {
					errorLog.error(" validateApplChecks is not equal to success in validateRequest(),UpdateApplCheckStatusRestService.java");
					return applChecksValidated;
				}
			}
			infoLog.info("validateRequest returned Success");
			return ("Success");
		} else {
			errorLog.error(" Invalid Request from Create Application in validateRequest(),UpdateApplCheckStatusRestService.java");
			return ("Invalid Request from Create Application");
		}
	}
	
	/*private String validateApplCheckStatusDetails(Data applCheckStatusData) {

		if (!CommonUtils.checkNullorBlank(applCheckStatusData.getAppStatus())) {
			errorLog.error(" Error in app Status  in validateapplCheckStatusDetails(),UpdateApplCheckStatusRestService.java ::"
					+ CommonUtils.checkNullorBlank(applCheckStatusData.getAppStatus()));
			return (" Error in app Status  in validateapplCheckStatusDetails(),UpdateApplCheckStatusRestService.java ::"
					+ CommonUtils.checkNullorBlank(applCheckStatusData.getAppStatus()));
		}
		if (!CommonUtils.checkNullorBlank(applCheckStatusData.getCompComment())) {
			errorLog.error(" Error in Comp Comment  in validateapplCheckStatusDetails(),UpdateApplCheckStatusRestService.java ::"
					+ CommonUtils.checkNullorBlank(applCheckStatusData.getCompComment()));
			return (" Error in Comp Comment  in validateapplCheckStatusDetails(),UpdateApplCheckStatusRestService.java ::"
					+ CommonUtils.checkNullorBlank(applCheckStatusData.getCompComment()));
		}
		if (!CommonUtils.checkNullorBlank(applCheckStatusData.getCompId())) {
			errorLog.error(" Error in Comp Id  in validateapplCheckStatusDetails(),UpdateApplCheckStatusRestService.java ::"
					+ CommonUtils.checkNullorBlank(applCheckStatusData.getCompId()));
			return (" Error in Comp Id  in validateapplCheckStatusDetails(),UpdateApplCheckStatusRestService.java ::"
					+ CommonUtils.checkNullorBlank(applCheckStatusData.getCompId()));
		}
		infoLog.info("validateApplCheckStatusDetails returned Success");
		return ("Success");
	}*/
	
	private String validateApplChecks(List<Data.Checks> applChecks) {
		for(Data.Checks check : applChecks)
		{
			if (!CommonUtils.checkNullorBlank(check.getCheckType())) {
				errorLog.error(" Error in Check Type  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getCheckType()));
				return (" Error in Check Type  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getCheckType()));
			}
			if (!CommonUtils.checkNullorBlank(check.getComment())) {
				errorLog.error(" Error in Comment  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getComment()));
				return (" Error in Comment in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getComment()));
			}
			/*if (check.getScreenshots()==null || check.getScreenshots().size()==0) {
				errorLog.error(" Error in Screenshots  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ check.getScreenshots());
				return (" Error in Check Screenshots  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ check.getScreenshots());
			}*/
			if (!CommonUtils.checkNullorBlank(check.getStatus())) {
				errorLog.error(" Error in Status  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getStatus()));
				return (" Error in Check Status  in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getStatus()));
			}
			if (!CommonUtils.checkNullorBlank(check.getUserId())) {
				errorLog.error(" Error in UserId in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getUserId()));
				return (" Error in Check UserId in validateApplChecks(),UpdateApplCheckStatusRestService.java ::"
						+ CommonUtils.checkNullorBlank(check.getUserId()));
			}
		}
		infoLog.info("validateApplChecks returned Success");
		return ("Success");

	}

public void sendEmails(ApplCheckStatusReq applCheckStatusReq, ApplCheckStatusResponse applCheckStatusResponse){
		
		String host = afrAsiaMailConfig.getMailhost();
		String port = afrAsiaMailConfig.getMailport();
		String mailFrom = afrAsiaMailConfig.getMailFrom();
		String password = afrAsiaMailConfig.getMailPassword();
		String smtpAuthRequired=afrAsiaMailConfig.getSmtpAuthRequired();
		String smtpAuthstarttls=afrAsiaMailConfig.getSmtpAuthRequired();
		String subject="Welcome to AfrAsia";
		
		infoLog.info("Mail Port" + port);
		infoLog.info("Host is:"+host);
		
		Data applCheckStatusData = applCheckStatusReq.getData();
		String primApplicantName = "";
		MobApplicantPersonalDetail mobApplicantPersonalDetail = null;
		if(updateApplCheckStatusService.getApplPersonalDetails(applCheckStatusData.getRefId())!=null)
		{
			mobApplicantPersonalDetail=updateApplCheckStatusService.getApplPersonalDetails(applCheckStatusData.getRefId());
			primApplicantName = mobApplicantPersonalDetail.getFirstName()+mobApplicantPersonalDetail.getLastName();
		}
		String rmName = "";
		String toAddrRM = "";
		

		RMDetails rmDetails = updateApplCheckStatusService.getRMDetails(applCheckStatusData.getRefId());
		if(rmDetails!=null)
		{
			rmName=rmDetails.getRmName();
			toAddrRM=rmDetails.getRmEmailId();
		}
		
		String messageToRM="";
		
		if("Require Attention".equals(applCheckStatusData.getAppStatus()))	
		{
			messageToRM="Dear "+rmName+"," + "\n" + "\n" +
				"The application for applicant "+primApplicantName+"["+applCheckStatusData.getRefId()+"]"+" has been sent back to you as it requires some modifications to be done."+ "\n" + "\n" +
				"Kind regards," + "\n" + 

				"AfrAsia Bank";
		}
		else if("Rejected Application".equals(applCheckStatusData.getAppStatus()))	
		{
			messageToRM="Dear "+rmName+"," + "\n" + "\n" +
				"The application for applicant "+primApplicantName+"["+applCheckStatusData.getRefId()+"]"+" has been rejected."+ "\n" + "\n" +
				"Kind regards," + "\n" + 

				"AfrAsia Bank";
		}
		
		try {
			AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, toAddrRM, subject, messageToRM, smtpAuthRequired, smtpAuthstarttls);
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
		
	}
}
