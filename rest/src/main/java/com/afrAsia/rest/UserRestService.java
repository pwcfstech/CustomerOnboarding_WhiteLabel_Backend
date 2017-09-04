package com.afrAsia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.service.UserService;

/**
 * REST WebService endpoints for a user
 * @author nyalfernandes
 *
 */

@Component
@Path("{version}")
public class UserRestService
{
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
    private UserService userService;
    
    public UserService getUserService()
    {
        return userService;
    }
    
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
    
    @GET
    @Path("/users/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser(@Context UriInfo uriInfo, @Context HttpHeaders httpHeader)
    {
    	infoLog.info(" uriInfo in addUser(),UserRestService is : "+uriInfo);
        String name = uriInfo.getPathParameters().getFirst("name");
        userService.saveUser(name);
        infoLog.info(" User added");
        return "User added";
    }
}
