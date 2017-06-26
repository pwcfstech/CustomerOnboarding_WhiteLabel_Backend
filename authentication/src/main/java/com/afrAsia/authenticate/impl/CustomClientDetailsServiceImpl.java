package com.afrAsia.authenticate.impl;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

import com.afrAsia.authenticate.CustomClientDetailsService;

/**
 * The Class <Code> CustomClientDetailsServiceImpl </Code> service is custom
 * implementation that provides of the details about an OAuth2 client.
 *
 * @author shweta.sankhe
 *
 */
public class CustomClientDetailsServiceImpl implements CustomClientDetailsService
{

    /** The o auth authorization dao. */
    private OAuthAuthorizationDAO oAuthAuthorizationDAO;

    /** The client dao. */
    private UserDao clientDAO;

    /**
     * Gets the o auth authorization dao.
     *
     * @return the o auth authorization dao
     */
    public OAuthAuthorizationDAO getoAuthAuthorizationDAO()
    {
        return oAuthAuthorizationDAO;
    }

    /**
     * Sets the o auth authorization dao.
     *
     * @param oAuthAuthorizationDAO
     *            the new o auth authorization dao
     */
    public void setoAuthAuthorizationDAO(OAuthAuthorizationDAO oAuthAuthorizationDAO)
    {
        this.oAuthAuthorizationDAO = oAuthAuthorizationDAO;
    }

    public void setClientDAO(ClientDAO clientDAO)
    {
        this.clientDAO = clientDAO;
    }

    public ClientDAO getClientDAO()
    {
        return clientDAO;
    }

    @Transactional
    public void saveClientDetail(String clientId, String resourceId, String clientSecret, String scope, String authorizedGrantTypes, String webServerRedirectUri, String authorities,
            int accessTokenValidity, int refreshTokenValidity, String additionalInformation, String autoApprove)
    {
        Client client = clientDAO.fetchClientById(clientId);
        OauthAuthorization oauthAuthorization = new OauthAuthorization();
        oauthAuthorization.setResourceIds(resourceId);
        oauthAuthorization.setAuthorizedGrantTypes(authorizedGrantTypes);
        oauthAuthorization.setAuthorities(authorities);
        oauthAuthorization.setScope(scope);
        oauthAuthorization.setClient(client);
        oauthAuthorization.setClientSecret(clientSecret);
        oauthAuthorization.setAccessTokenValidity(accessTokenValidity);
        // API-126
        oauthAuthorization.setCreatedBy(client.getAccount().getId());
        oAuthAuthorizationDAO.saveClientDetail(oauthAuthorization);
    }

    public boolean isClientValid(String clientId)
    {
        clientDAO.getClass();
        OauthAuthorization acdobj = oAuthAuthorizationDAO.getClient(clientId);
        return acdobj != null;
    }

    @Transactional(rollbackOn = { Exception.class })
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException
    {
        OauthAuthorization oauthAuthorization = oAuthAuthorizationDAO.loadClientByClientId(clientId);
        CustomOauthAuthorization customOauthAuthorization = null;
        if (oauthAuthorization != null)
        {
            customOauthAuthorization = new CustomOauthAuthorization(oauthAuthorization.getClient().getIdAsString(), oauthAuthorization.getResourceIds(), oauthAuthorization.getClientSecret(),
                    oauthAuthorization.getScope(), oauthAuthorization.getAuthorizedGrantTypes(), oauthAuthorization.getAuthorities(), oauthAuthorization.getAccessTokenValidity());
        }
        return customOauthAuthorization;
    }

}
