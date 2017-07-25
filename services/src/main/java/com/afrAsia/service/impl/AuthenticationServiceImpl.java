package com.afrAsia.service.impl;

import com.afrAsia.dao.OAuthAuthorizationDAO;
import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutResponse;
import com.afrAsia.service.AuthenticationService;

/**
 * 
 * @author nyalf769
 *
 */
public class AuthenticationServiceImpl implements AuthenticationService
{
	private OAuthAuthorizationDAO oAuthAuthorizationDAO;
	
	public OAuthAuthorizationDAO getoAuthAuthorizationDAO() 
	{
		return oAuthAuthorizationDAO;
	}
	
	public void setoAuthAuthorizationDAO(OAuthAuthorizationDAO oAuthAuthorizationDAO) 
	{
		this.oAuthAuthorizationDAO = oAuthAuthorizationDAO;
	}

	public LoginResponse login(LoginRequest loginRequest) 
	{
		return null;
	}

	public LogoutResponse logout(LogoutRequest logoutRequest) 
	{
		
		return null;
	}

	public GenericResponse checkSession() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
