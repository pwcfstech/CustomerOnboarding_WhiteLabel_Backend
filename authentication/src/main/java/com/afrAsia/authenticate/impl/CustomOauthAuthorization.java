package com.afrAsia.authenticate.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.util.StringUtils;

/**
 * Class <code>CustomOauthAuthorization</code> manages client details
 * from database.
 * 
 * This class is a custom class which implements ClientDetails interface.
 * 
 * @author shweta.sankhe
 * 
 */
public class CustomOauthAuthorization implements ClientDetails
{
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The client id. */
    private String clientId;

    /** The client resource id. */
    private String clientResourceId;

    /** The client secret. */
    private String clientSecret;

    /** The client scope. */
    private String clientScope;

    /** The client authorized grant type. */
    private String clientAuthorizedGrantType;

    /** The client granted authority. */
    private String clientGrantedAuthority;

    /** The client authorities. */
    private String clientAuthorities;

    /** The client access token validity second. */
    private Integer clientAccessTokenValiditySecond;

    /**
     * Instantiates a new custom oauth authorization.
     */
    CustomOauthAuthorization()
    {
    }

    /**
     * Instantiates a new custom oauth authorization.
     * 
     * @param clientId
     *            the client id
     * @param resourceIds
     *            the resource ids
     * @param clientSecret
     *            the client secret
     * @param scope
     *            the scope
     * @param authorizedGrantType
     *            the authorized grant type
     * @param grantedAuthority
     *            the granted authority
     * @param accessTokenValiditySec
     *            the access token validity sec
     */
    CustomOauthAuthorization(String clientId, String resourceIds, String clientSecret, String scope, String authorizedGrantType, String grantedAuthority, Integer accessTokenValiditySec)
    {
        this.clientResourceId = resourceIds;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientScope = scope;
        this.clientAuthorizedGrantType = authorizedGrantType;
        this.clientGrantedAuthority = grantedAuthority;
        this.clientAccessTokenValiditySecond = accessTokenValiditySec;

    }

    public String getClientId()
    {
        return clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getClientResourceId()
    {
        return clientResourceId;
    }

    public void setClientResourceId(String clientResourceId)
    {
        this.clientResourceId = clientResourceId;
    }

    public String getClientSecret()
    {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret)
    {
        this.clientSecret = clientSecret;
    }

    public String getClientScope()
    {
        return clientScope;
    }

    public void setClientScope(String clientScope)
    {
        this.clientScope = clientScope;
    }

    public String getClientAuthorizedGrantType()
    {
        return clientAuthorizedGrantType;
    }

    public void setClientAuthorizedGrantType(String clientAuthorizedGrantType)
    {
        this.clientAuthorizedGrantType = clientAuthorizedGrantType;
    }

    public String getClientGrantedAuthority()
    {
        return clientGrantedAuthority;
    }

    public void setClientGrantedAuthority(String clientGrantedAuthority)
    {
        this.clientGrantedAuthority = clientGrantedAuthority;
    }

    public Integer getClientAccessTokenValiditySecond()
    {
        return clientAccessTokenValiditySecond;
    }

    public void setClientAccessTokenValiditySecond(Integer clientAccessTokenValiditySecond)
    {
        this.clientAccessTokenValiditySecond = clientAccessTokenValiditySecond;
    }

    public String getClientAuthorities()
    {
        return clientAuthorities;
    }

    public void setClientAuthorities(String clientAuthorities)
    {
        this.clientAuthorities = clientAuthorities;
    }

    public Set<String> getResourceIds()
    {
        Set<String> resourceIds = new HashSet<String>();
        resourceIds.add(getClientResourceId());
        return resourceIds;
    }

    public boolean isSecretRequired()
    {
        return true;
    }

    public boolean isScoped()
    {
        return false;
    }

    public Set<String> getScope()
    {
        Set<String> scopeSet = new HashSet<String>();
        scopeSet.add(clientScope);
        return scopeSet;
    }

    public Set<String> getAuthorizedGrantTypes()
    {
        Set<String> authorizedGarntTypes = new HashSet<String>();
        authorizedGarntTypes = StringUtils.commaDelimitedListToSet(clientAuthorizedGrantType);
        //authorizedGarntTypes.add(clientAuthorizedGrantType);
        return authorizedGarntTypes;
    }

    public Set<String> getRegisteredRedirectUri()
    {
        return null;
    }

    public Collection<GrantedAuthority> getAuthorities()
    {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        
        for (String clientGrantedAuthority : StringUtils.commaDelimitedListToSet(clientGrantedAuthority))
        {
	        CustomGrantedAuthority grantedAuthority = new CustomGrantedAuthority();
	        grantedAuthority.setAuthority(clientGrantedAuthority);
	        authorities.add(grantedAuthority);
        }
        return authorities;
    }

    public Integer getAccessTokenValiditySeconds()
    {
        return clientAccessTokenValiditySecond;
    }

    public Integer getRefreshTokenValiditySeconds()
    {
        return null;
    }

    public boolean isAutoApprove(String scope)
    {
        return false;
    }

    public Map<String, Object> getAdditionalInformation()
    {
        return null;
    }

}
