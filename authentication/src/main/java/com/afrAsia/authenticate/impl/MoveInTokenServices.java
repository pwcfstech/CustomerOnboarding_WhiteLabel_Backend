package com.afrAsia.authenticate.impl;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;

public class MoveInTokenServices extends DefaultTokenServices
{
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
    @Override
    @Transactional
    public OAuth2AccessToken createAccessToken(OAuth2Authentication authentication) throws AuthenticationException
    {
        try
        {
        	debugLog.debug("super.createAccessToken(authentication)"+super.createAccessToken(authentication));
            return super.createAccessToken(authentication);
        }
        catch (AuthenticationException ae)
        {
        	errorLog.error("AuthenticationException ",ae);
            throw ae;
        }
        catch (OAuth2Exception o2e)
        {
        	errorLog.error("OAuth2Exception ",o2e);
            throw o2e;
        }
        catch (Exception e)
        {
        	errorLog.error("Error creating auth token!");
            throw new MoveInOAuth2Exception("Error creating auth token!");
        }
    }
    
    @Override
    public OAuth2Authentication loadAuthentication(String accessTokenValue) throws AuthenticationException, InvalidTokenException
    {
        try
        {
        	debugLog.debug("super.loadAuthentication(accessTokenValue)"+super.loadAuthentication(accessTokenValue));
            return super.loadAuthentication(accessTokenValue);
        }
        catch (AuthenticationException ae)
        {
        	errorLog.error("AuthenticationException ",ae);
            throw ae;
        }
        catch (OAuth2Exception o2e)
        {
        	errorLog.error("OAuth2Exception ",o2e);
            throw o2e;
        }
        catch (Exception e)
        {
        	errorLog.error("Error in authentication!",e);
            throw new MoveInOAuth2Exception("Error in authentication!");
        }
    }
    
    @Override
    public OAuth2AccessToken getAccessToken(OAuth2Authentication authentication)
    {
        try
        {
        	debugLog.debug("super.getAccessToken(authentication)"+super.getAccessToken(authentication));
            return super.getAccessToken(authentication);
        }
        catch (OAuth2Exception o2e)
        {
        	errorLog.error("OAuth2Exception ",o2e);
            throw o2e;
        }
        catch (Exception e)
        {
        	errorLog.error("Error fetching access token!",e);
            throw new MoveInOAuth2Exception("Error fetching access token!");
        }
    }
    
    @Override
    public String getClientId(String tokenValue)
    {
        
        try
        {
        	debugLog.debug("super.getClientId(tokenValue)"+super.getClientId(tokenValue));
            return super.getClientId(tokenValue);
        }
        catch (OAuth2Exception o2e)
        {
        	errorLog.error("OAuth2Exception ",o2e);
            throw o2e;
        }
        catch (Exception e)
        {
        	errorLog.error("Error fetching client info!",e);
            throw new MoveInOAuth2Exception("Error fetching client info!");
        }
    }
    
    @Override
    public boolean revokeToken(String tokenValue)
    {
        try
        {
        	debugLog.debug("super.revokeToken(tokenValue)"+super.revokeToken(tokenValue));
            return super.revokeToken(tokenValue);
        }
        catch (OAuth2Exception o2e)
        {
        	errorLog.error("OAuth2Exception ",o2e);
            throw o2e;
        }
        catch (Exception e)
        {
        	errorLog.error("Error revoking token!",e);
            throw new MoveInOAuth2Exception("Error revoking token!");
        }
    }
    
    @Override
    public OAuth2AccessToken readAccessToken(String accessToken)
    {
        try
        {
        	debugLog.debug("super.readAccessToken(accessToken)"+super.readAccessToken(accessToken));
            return super.readAccessToken(accessToken);
        }
        catch (OAuth2Exception o2e)
        {
        	errorLog.error("OAuth2Exception ",o2e);
            throw o2e;
        }
        catch (Exception e)
        {
        	errorLog.error("Error reading auth token!",e);
            throw new MoveInOAuth2Exception("Error reading auth token!");
        }
    }
    
    @Override
    public void setSupportRefreshToken(boolean supportRefreshToken) 
    {
    	// TODO Auto-generated method stub
    	super.setSupportRefreshToken(supportRefreshToken);
    }
    
    
}
