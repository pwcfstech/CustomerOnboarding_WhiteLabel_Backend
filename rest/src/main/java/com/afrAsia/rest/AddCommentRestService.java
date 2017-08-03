package com.afrAsia.rest;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.GenericRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.service.AddCommentService;
import com.afrAsia.service.ProductService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class AddCommentRestService 
{

	private static final Logger logger = LoggerFactory.getLogger(AddCommentRestService.class);
	
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
	public Response getAppversion(String jsonInput) 
	{
		
		GenericRequest req = new GenericRequest();
		ObjectMapper mapper = new ObjectMapper();
		try {
			req = mapper.readValue(jsonInput, GenericRequest.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Long appId=req.getData().getAppId(); 
		System.out.println("appid is in rest ========== :: "+appId);
		String comments=req.getData().getComment();
		System.out.println("comments is in rest ========== :: "+comments);
		String userId=req.getData().getUserId();
		System.out.println("userId is in rest ========== :: "+userId);
		String userCat=req.getData().getUserCat();
		System.out.println("userCat is in rest ========== :: "+userCat);
		
		GenericResponse genericResponse=addCommentService.addComments(appId, comments, userId, userCat);
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();

	}
}
