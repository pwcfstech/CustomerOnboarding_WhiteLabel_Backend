package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.request.ApplicationDetailsReq;
import com.afrAsia.entities.response.ApplicationDetailsResponse;
import com.afrAsia.service.ApplicationDetailsService;


@Component

@Path("{version}")
public class ApplicationDetailsRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private ApplicationDetailsService applicationDetailsService;

	public ApplicationDetailsService getApplicationDetailsService() {
		return applicationDetailsService;
	}

	public void setApplicationDetailsService(ApplicationDetailsService applicationDetailsService) {
		this.applicationDetailsService = applicationDetailsService;
	}

	@POST
	@Path("/getApplicationDetails")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getApplicationDetails(ApplicationDetailsReq applicationDetailsReq) {
		
		infoLog.info("We have entered in getApplicationDetails service");
		debugLog.debug(" applicationDetailsReq in getApplicationDetails service is : "+applicationDetailsReq);
		ApplicationDetailsResponse applicationDetailsResponse = new ApplicationDetailsResponse();
		MsgHeader msgHeader= new MsgHeader();
		try{
			if (validateRequest(applicationDetailsReq)) {
				applicationDetailsResponse = applicationDetailsService.getApplicationDetails(applicationDetailsReq);
				debugLog.debug("applicationDetailsResponse  :: "+applicationDetailsResponse);
				
				if (applicationDetailsResponse!=null) {
					infoLog.info("Exit from getApplicationDetails service");
					return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					errorLog.error(" No data for this application reference no ");
					Error error = new MsgHeader(). new Error();
					error.setCd("404");
					error.setRsn("No data for this application reference no.");
					msgHeader.setError(error);
					applicationDetailsResponse = new ApplicationDetailsResponse();
					applicationDetailsResponse.setMsgHeader(msgHeader);
					errorLog.error(" applicationDetailsResponse  : "+applicationDetailsResponse);
					return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
				}
			}
			else{
				errorLog.error(" Invalid request ");
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn("Invalid Request");
				msgHeader.setError(error);
				applicationDetailsResponse.setMsgHeader(msgHeader);
				return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();	
			}
		}catch(Exception e){
			errorLog.error(" Sorry, there was an error while getting application details. Please try again later "+e);
			e.printStackTrace();
			Error error = new MsgHeader(). new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error while getting application details. Please try again later.");
			msgHeader.setError(error);
			applicationDetailsResponse.setMsgHeader(msgHeader);
			return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
		}
	}
	

	private boolean validateRequest(ApplicationDetailsReq applicationDetailsReq) {
		if (applicationDetailsReq != null && applicationDetailsReq.getData() != null){
			infoLog.info(" validateRequest returned true");
			return true;
		} else {
			errorLog.error(" Invalid Request from Get Application Details ");
			return false;
		}
	}
}
