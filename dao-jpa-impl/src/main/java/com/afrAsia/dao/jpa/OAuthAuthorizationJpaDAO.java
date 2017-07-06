package com.afrAsia.dao.jpa;

import com.afrAsia.dao.OAuthAuthorizationDAO;
import com.afrAsia.entities.jpa.OauthAuthorization;

public interface OAuthAuthorizationJpaDAO extends BaseJpaDAO<String, OauthAuthorization>, OAuthAuthorizationDAO
{
    public OauthAuthorization getOauthAuthorizationByClientId(String clientId);
}
