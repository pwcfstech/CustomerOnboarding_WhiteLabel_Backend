package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import org.slf4j.Logger;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.request.LockApplicationRequest;
import com.afrAsia.entities.request.LockApplicationRequest.Data;
import com.afrAsia.entities.response.LockApplicationResponse;
import com.afrAsia.service.LockApplicationService;

@Component
@Path("{version}")
public class LockApplicationRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private LockApplicationService lockApplicationService;
	
	public LockApplicationService getLockApplicationService() {
		return lockApplicationService;
	}

	public void setLockApplicationService(LockApplicationService lockApplicationService) {
		this.lockApplicationService = lockApplicationService;
	}

	@Override
	public String toString() {
		return "LockApplicationRestService [lockApplicationService=" + lockApplicationService + "]";
	}

	@POST
	@Path("/lockApplication")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response lockApplication(LockApplicationRequest lockApplicationRequest) {
		
		infoLog.info("Enter in lockApplication Service");
		debugLog.debug("lockApplicationRequest :: "+lockApplicationRequest);
		
		LockApplicationResponse lockApplicationResponse = new LockApplicationResponse();
		
		MsgHeader msgHeader = new MsgHeader();

		try {
			String checkRequest = validateRequest(lockApplicationRequest);
			if (checkRequest.equals("Success")) {
				lockApplicationResponse = lockApplicationService.lockAccount(lockApplicationRequest);
				if (lockApplicationResponse!=null) {
					infoLog.info("Exit from lockApplication Service");
					debugLog.debug(" lockApplicationResponse  : "+lockApplicationResponse);
					return Response.ok(lockApplicationResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					errorLog.error(" Error in locking the application ");
					Error error = new MsgHeader(). new Error();
					error.setCd("404");
					error.setRsn(" Error in locking the application ");
					msgHeader.setError(error);
					lockApplicationResponse = new LockApplicationResponse();
					lockApplicationResponse.setMsgHeader(msgHeader);
					errorLog.error(" applicationDetailsResponse in lockApplication(),LockApplicationRestService : "+lockApplicationResponse);
					return Response.ok(lockApplicationResponse, MediaType.APPLICATION_JSON).build();
				}
			}
			else{
				errorLog.error("checkRequest is : "+checkRequest);
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn(checkRequest);
				msgHeader.setError(error);
				lockApplicationResponse.setMsgHeader(msgHeader);
				errorLog.error("lockApplicationResponse  : "+lockApplicationResponse);
				return Response.ok(lockApplicationResponse, MediaType.APPLICATION_JSON).build();
			}
		} catch (Exception e) {
			errorLog.error(" Sorry, there was an error locking the application. Please try again later ",e);
			e.printStackTrace();
			Error error = new MsgHeader().new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error locking the application. Please try again later.");
			msgHeader.setError(error);
			lockApplicationResponse.setMsgHeader(msgHeader);
			errorLog.error(" lockApplicationResponse  : "+lockApplicationResponse);
			return Response.ok(lockApplicationResponse, MediaType.APPLICATION_JSON).build();
		}
	}

	private String validateRequest(LockApplicationRequest lockApplicationRequest) {

		if (lockApplicationRequest != null && lockApplicationRequest.getData() != null) {

			Data lockApplicationData = lockApplicationRequest.getData();
			
			if(lockApplicationData.getRecordId()==null || lockApplicationData.getRecordId()==0L)
			{
				errorLog.error("RecordID not available");
				return "RecordID not available";
			}
			
			if(lockApplicationData.getRefId()==null || lockApplicationData.getRefId()==0L)
			{
				errorLog.error("RefId not available");
				return "RefId not available";
			}
			
			if(lockApplicationData.getUserId()==null || "".equals(lockApplicationData.getUserId()))
			{
				errorLog.error("UserId not available");
				return "UserId not available";
			}
			
			if(lockApplicationData.getLockApp()==null || "".equals(lockApplicationData.getLockApp()))
			{
				errorLog.error("LockApp not available");
				return "LockApp not available";
			}
			return "Success";
		}
		else{
			errorLog.error("Invalid lockApplicationRequest");
			return "Invalid lockApplicationRequest";
		}
	}

	
}
