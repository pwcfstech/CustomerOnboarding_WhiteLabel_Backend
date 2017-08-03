package com.afrAsia.service;

import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutResponse;

/**
 * 
 * @author nyalf769
 *
 */
public interface AuthenticationService 
{
	public LoginResponse login(LoginRequest loginRequest);
	
	public LogoutResponse logout(LogoutRequest logoutRequest, String oauthToken);
	
	public GenericResponse checkSession();
}
