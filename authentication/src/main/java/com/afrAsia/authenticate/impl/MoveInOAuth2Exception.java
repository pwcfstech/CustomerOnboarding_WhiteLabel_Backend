package com.afrAsia.authenticate.impl;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class MoveInOAuth2Exception extends OAuth2Exception
{
    public MoveInOAuth2Exception(String msg)
    {
        super(msg);
    }
    
    @Override
    public int getHttpErrorCode()
    {
        return 503;
    }
    
    @Override
    public String getOAuth2ErrorCode()
    {
        return "authentication_unavailable";
    }

    private static final long serialVersionUID = 1L;
    
    
}
