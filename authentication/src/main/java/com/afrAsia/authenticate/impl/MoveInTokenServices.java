package com.afrAsia.authenticate.impl;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;

public class MoveInTokenServices extends DefaultTokenServices
{
    @Override
    @Transactional
    public OAuth2AccessToken createAccessToken(OAuth2Authentication authentication) throws AuthenticationException
    {
        try
        {
            return super.createAccessToken(authentication);
        }
        catch (AuthenticationException ae)
        {
            throw ae;
        }
        catch (OAuth2Exception o2e)
        {
            throw o2e;
        }
        catch (Exception e)
        {
            throw new MoveInOAuth2Exception("Error creating auth token!");
        }
    }
    
    @Override
    public OAuth2Authentication loadAuthentication(String accessTokenValue) throws AuthenticationException, InvalidTokenException
    {
        try
        {
            return super.loadAuthentication(accessTokenValue);
        }
        catch (AuthenticationException ae)
        {
            throw ae;
        }
        catch (OAuth2Exception o2e)
        {
            throw o2e;
        }
        catch (Exception e)
        {
            throw new MoveInOAuth2Exception("Error in authentication!");
        }
    }
    
    @Override
    public OAuth2AccessToken getAccessToken(OAuth2Authentication authentication)
    {
        try
        {
            return super.getAccessToken(authentication);
        }
        catch (OAuth2Exception o2e)
        {
            throw o2e;
        }
        catch (Exception e)
        {
            throw new MoveInOAuth2Exception("Error fetching access token!");
        }
    }
    
    @Override
    public String getClientId(String tokenValue)
    {
        
        try
        {
            return super.getClientId(tokenValue);
        }
        catch (OAuth2Exception o2e)
        {
            throw o2e;
        }
        catch (Exception e)
        {
            throw new MoveInOAuth2Exception("Error fetching client info!");
        }
    }
    
    @Override
    public boolean revokeToken(String tokenValue)
    {
        try
        {
            return super.revokeToken(tokenValue);
        }
        catch (OAuth2Exception o2e)
        {
            throw o2e;
        }
        catch (Exception e)
        {
            throw new MoveInOAuth2Exception("Error revoking token!");
        }
    }
    
    @Override
    public OAuth2AccessToken readAccessToken(String accessToken)
    {
        try
        {
            return super.readAccessToken(accessToken);
        }
        catch (OAuth2Exception o2e)
        {
            throw o2e;
        }
        catch (Exception e)
        {
            throw new MoveInOAuth2Exception("Error reading auth token!");
        }

    }
    
    
}
