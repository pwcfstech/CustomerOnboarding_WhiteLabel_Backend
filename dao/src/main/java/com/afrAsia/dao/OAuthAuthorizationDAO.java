package com.afrAsia.dao;

import com.afrAsia.entities.jpa.OauthAuthorization;

public interface OAuthAuthorizationDAO
{
    public void saveClientDetail(OauthAuthorization oauthAuthorization);
    
    public OauthAuthorization loadClientByClientId(String clientId)
			throws Exception;
    
    public OauthAuthorization getClient(String clientId);

}