package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("{version}")
public class AuthenticationRestService 
{

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(String loginRequest) 
	{
		
		return Response.ok().build();
	}
	
	@POST
	@Path("/logout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logout(String logoutRequest) 
	{
		return Response.ok().build();
	}
	
	@GET
	@Path("/checkLogin")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkLogin() 
	{
		return Response.ok().build();
	}
}
