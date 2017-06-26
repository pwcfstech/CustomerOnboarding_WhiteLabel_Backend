package com.afrAsia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

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
        String name = uriInfo.getPathParameters().getFirst("name");
        userService.saveUser(name);
        
        return "User added";
    }
}
