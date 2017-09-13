package com.afrAsia.rest;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.GenericRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.service.AddCommentService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class AddCommentRestService 
{

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private AddCommentService addCommentService;

	public AddCommentService getAddCommentService() {
		return addCommentService;
	}

	public void setAddCommentService(AddCommentService addCommentService) {
		this.addCommentService = addCommentService;
	}

	@POST
	@Path("/addComments")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addComments(String jsonInput) 
	{
		infoLog.info("Enter in addComments service");
		debugLog.debug(" jsonInput for addComments service: "+jsonInput);
		GenericRequest req = new GenericRequest();
		ObjectMapper mapper = new ObjectMapper();
		try {
			req = mapper.readValue(jsonInput, GenericRequest.class);
		} catch (JsonParseException e) {
			errorLog.error(" JsonParseException  is : ",e);
		} catch (JsonMappingException e) {
			errorLog.error(" JsonMappingException  is : ",e);
		} catch (IOException e) {
			errorLog.error(" IOException  is : ",e);
		}
		
		Long appId=req.getData().getAppId(); 
		String comments=req.getData().getComment();
		String userId=req.getData().getUserId();
		String userCat=req.getData().getUserCat();
		
		GenericResponse genericResponse=addCommentService.addComments(appId, comments, userId, userCat);
		infoLog.info("Exit from addComments service");
		debugLog.debug(" genericResponse  is : "+genericResponse);
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();
	}
}
