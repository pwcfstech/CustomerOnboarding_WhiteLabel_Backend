package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afrAsia.CommonUtils;
import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.request.RequestError;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.service.AuthenticationService;

/**
 * Defines the skeleton for login, logout and session management service
 * 
 * @author Nyal Fernandes
 *
 */
@Component
@Path("{version}")
public class AuthenticationRestService 
{
	
	private AuthenticationService authenticationService;
	
	public AuthenticationService getAuthenticationService() 
	{
		return authenticationService;
	}
	
	public void setAuthenticationService(AuthenticationService authenticationService) 
	{
		this.authenticationService = authenticationService;
	}

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(String loginStringRequest)
	{
		LoginResponse response = null;
		try
		{
			LoginRequest loginRequest = CommonUtils.jsonStringToObject(loginStringRequest, LoginRequest.class);
			response = authenticationService.login(loginRequest);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("Login failed.");
			msgHeader.setError(error);
			
			response = new LoginResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		
		return Response.ok(response).build();
	}
	
	@POST
	@Path("/logout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logout(String logoutStringRequest)
	{
		LogoutResponse response = null;
		try
		{
			LogoutRequest logoutRequest = CommonUtils.jsonStringToObject(logoutStringRequest, LogoutRequest.class);
			response = authenticationService.logout(logoutRequest);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("Logout failed.");
			msgHeader.setError(error);
			
			response = new LogoutResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		
		return Response.ok(response).build();
	}
	
	@GET
	@Path("/checkSession")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkSession()
	{
		try
		{
			
		}
		catch (Exception e)
		{
			
		}
		
		return Response.ok().build();
	}
}
