package com.afrAsia.entities.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;
import com.afrAsia.entities.masters.RMDetails;


/**
 * The persistent class for the oauth_authorization database table.
 * 
 */
@Entity
@EntityListeners(EntityListener.class)
@Table(name = "oauth_authorization")
@NamedQueries({ @NamedQuery(name = OauthAuthorization.QUERY_FIND_BY_CLIENT_ID, query = "SELECT oaa FROM OauthAuthorization oaa where oaa.client.id = :clientId") })
public class OauthAuthorization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    public static final String QUERY_FIND_BY_CLIENT_ID = "findOauthAuthorizationDetailsByClientId";

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private RMDetails client;

    @Column(name = "ACCESS_TOKEN_VALIDITY")
    private Integer accessTokenValidity;

    @Column(name = "ADDITIONAL_INFORMATION")
    private String additionalInformation;

    @Column(name = "AUTHORITIES")
    private String authorities;

    @Column(name = "AUTHORIZED_GRANT_TYPES")
    private String authorizedGrantTypes;

    @Column(name = "CLIENT_SECRET")
    private String clientSecret;

    @Column(name = "RESOURCE_IDS")
    private String resourceIds;

    @Column(name = "SCOPE")
    private String scope;

    public OauthAuthorization()
    {
    }

    public RMDetails getClient()
    {
        return client;
    }

    public void setClient(RMDetails client)
    {
        this.client = client;
    }

    public Integer getAccessTokenValidity()
    {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity)
    {
        this.accessTokenValidity = accessTokenValidity;
    }

    public String getAdditionalInformation()
    {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation)
    {
        this.additionalInformation = additionalInformation;
    }

    public String getAuthorities()
    {
        return authorities;
    }

    public void setAuthorities(String authorities)
    {
        this.authorities = authorities;
    }

    public String getAuthorizedGrantTypes()
    {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes)
    {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public String getClientSecret()
    {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret)
    {
        this.clientSecret = clientSecret;
    }

    public String getResourceIds()
    {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds)
    {
        this.resourceIds = resourceIds;
    }

    public String getScope()
    {
        return scope;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
    }

}