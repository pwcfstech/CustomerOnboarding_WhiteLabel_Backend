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
import com.afrAsia.entities.request.UpdateCifOrShortnameRequest;
import com.afrAsia.entities.request.UpdateCifOrShortnameRequest.Data;
import com.afrAsia.entities.response.UpdateCifOrShortnameResponse;
import com.afrAsia.service.UpdateCifOrShortnameService;

@Component
@Path("{version}")
public class UpdateCifOrShortnameRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private UpdateCifOrShortnameService updateCifOrShortnameService;
	
	

	public UpdateCifOrShortnameService getUpdateCifOrShortnameService() {
		return updateCifOrShortnameService;
	}

	public void setUpdateCifOrShortnameService(UpdateCifOrShortnameService updateCifOrShortnameService) {
		this.updateCifOrShortnameService = updateCifOrShortnameService;
	}

	@Override
	public String toString() {
		return "UpdateCifOrShortnameRestService [updateCifOrShortnameService=" + updateCifOrShortnameService + "]";
	}

	@POST
	@Path("/updateCifOrShortname")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateCifOrShortname(UpdateCifOrShortnameRequest updateCifOrShortnameRequest) {
		
		infoLog.info("Entering in UpdateCifOrShortname Service");
		debugLog.debug("updateCifOrShortnameRequest :: "+updateCifOrShortnameRequest);
		
		UpdateCifOrShortnameResponse updateCifOrShortnameResponse = new UpdateCifOrShortnameResponse();
		
		MsgHeader msgHeader = new MsgHeader();

		try {
			String checkRequest = validateRequest(updateCifOrShortnameRequest);
			if (checkRequest.equals("Success")) {
				updateCifOrShortnameResponse=updateCifOrShortnameService.updateCifOrShortname(updateCifOrShortnameRequest);
				if (updateCifOrShortnameResponse!=null) {
					infoLog.info("Exit from updateCifOrShortname Service");
					debugLog.debug(" updateCifOrShortnameResponse  : "+updateCifOrShortnameResponse);
					return Response.ok(updateCifOrShortnameResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					errorLog.error(" Error in updating CIF or shortname ");
					Error error = new MsgHeader(). new Error();
					error.setCd("404");
					error.setRsn(" Error in updating CIF or shortname ");
					msgHeader.setError(error);
					updateCifOrShortnameResponse = new UpdateCifOrShortnameResponse();
					updateCifOrShortnameResponse.setMsgHeader(msgHeader);
					errorLog.error(" updateCifOrShortnameResponse in updateCifOrShortname(),UpdateCifOrShortnameRestService : "+updateCifOrShortnameResponse);
					infoLog.info("Exiting from UpdateCifOrShortname Service");
					debugLog.debug(" updateCifOrShortnameResponse  : "+updateCifOrShortnameResponse);
					return Response.ok(updateCifOrShortnameResponse, MediaType.APPLICATION_JSON).build();
				}
			}
			else{
				errorLog.error("checkRequest is : "+checkRequest);
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn(checkRequest);
				msgHeader.setError(error);
				updateCifOrShortnameResponse.setMsgHeader(msgHeader);
				errorLog.error("updateCifOrShortnameResponse  : "+updateCifOrShortnameResponse);
				infoLog.info("Exiting from UpdateCifOrShortname Service");
				debugLog.debug(" updateCifOrShortnameResponse  : "+updateCifOrShortnameResponse);
				return Response.ok(updateCifOrShortnameResponse, MediaType.APPLICATION_JSON).build();
			}
		} catch (Exception e) {
			errorLog.error(" Sorry, there was an error in updating CIF or Shotname. Please try again later ",e);
			e.printStackTrace();
			Error error = new MsgHeader().new Error();
			error.setCd("404");
			error.setRsn(" Sorry, there was an error in updating CIF or Shotname. Please try again later ");
			msgHeader.setError(error);
			updateCifOrShortnameResponse.setMsgHeader(msgHeader);
			errorLog.error(" updateCifOrShortnameResponse  : "+updateCifOrShortnameResponse);
			infoLog.info("Exiting from UpdateCifOrShortname Service");
			debugLog.debug(" updateCifOrShortnameResponse  : "+updateCifOrShortnameResponse);
			return Response.ok(updateCifOrShortnameResponse, MediaType.APPLICATION_JSON).build();
		}

	}

	private String validateRequest(UpdateCifOrShortnameRequest updateCifOrShortnameRequest) {

		if (updateCifOrShortnameRequest != null && updateCifOrShortnameRequest.getData() != null) {

			Data updateCifOrShortnameData = updateCifOrShortnameRequest.getData();
			
			if(updateCifOrShortnameData.getApplicantId()==null || updateCifOrShortnameData.getApplicantId()==0L)
			{
				errorLog.error("RecordID not available");
				return "RecordID not available";
			}
			
			if(updateCifOrShortnameData.getRefId()==null || updateCifOrShortnameData.getRefId()==0L)
			{
				errorLog.error("RefId not available");
				return "RefId not available";
			}
			
			if(updateCifOrShortnameData.getCif()==null || "".equals(updateCifOrShortnameData.getCif()))
			{
				if(updateCifOrShortnameData.getShortname()==null || "".equals(updateCifOrShortnameData.getShortname()))
				{
					errorLog.error("Either CIF or Shortname should be available");
					return "Either CIF or Shortname should be available";
				}
			}
			return "Success";
		}
		else{
			errorLog.error("Invalid updateCifOrShortnameRequest");
			return "Invalid updateCifOrShortnameRequest";
		}
	}

	
}
