package com.afrAsia.dao.jpa;

import com.afrAsia.entities.jpa.OauthAuthorization;

public interface OAuthAuthorizationJpaDAO extends BaseJpaDAO<String, OauthAuthorization>
{
    public OauthAuthorization getOauthAuthorizationByClientId(String clientId);
}
