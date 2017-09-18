package com.afrAsia.authenticate.impl;

import org.apache.log4j.Logger;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class MoveInOAuth2Exception extends OAuth2Exception
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
    public MoveInOAuth2Exception(String msg)
    {
        super(msg);
    }
    
    @Override
    public int getHttpErrorCode()
    {
    	infoLog.info("returning 503");
        return 503;
    }
    
    @Override
    public String getOAuth2ErrorCode()
    {
    	errorLog.error("authentication_unavailable");
        return "authentication_unavailable";
    }

    private static final long serialVersionUID = 1L;
}
