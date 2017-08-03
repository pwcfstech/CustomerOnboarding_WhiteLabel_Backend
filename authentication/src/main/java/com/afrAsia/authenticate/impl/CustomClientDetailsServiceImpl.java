package com.afrAsia.authenticate.impl;

import javax.transaction.Transactional;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

import com.afrAsia.authenticate.CustomClientDetailsService;
import com.afrAsia.dao.OAuthAuthorizationDAO;
import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.dao.UserDAO;
import com.afrAsia.entities.jpa.OauthAuthorization;
import com.afrAsia.entities.masters.RMDetails;

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
    
    private UserDAO userDAO;
    
    private RMDetailsDao rmDetailsDAO;
    
    public RMDetailsDao getRmDetailsDAO() 
    {
		return rmDetailsDAO;
	}
    
    public void setRmDetailsDAO(RMDetailsDao rmDetailsDAO) 
    {
		this.rmDetailsDAO = rmDetailsDAO;
	}
    
    public UserDAO getUserDAO() 
    {
		return userDAO;
	}
    
    public void setUserDAO(UserDAO userDAO) 
    {
		this.userDAO = userDAO;
	}

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

    @Transactional
    public void saveClientDetail(String clientId, String resourceId, String clientSecret, String scope, String authorizedGrantTypes, String webServerRedirectUri, String authorities,
            int accessTokenValidity, int refreshTokenValidity, String additionalInformation, String autoApprove)
    {
    	System.out.println("-------- clientId --------- "+clientId);
    	System.out.println("clientId in saveClientDetail impl ========== "+rmDetailsDAO.getRMDetailById(clientId));
    	RMDetails rmDetails = rmDetailsDAO.getRMDetailById(clientId);
    	//rmDetails.getRmName();
    	//rmDetails.setId("1");
//        User client = userDAO.findById(Integer.valueOf(clientId));
        OauthAuthorization oauthAuthorization = new OauthAuthorization();
        oauthAuthorization.setId(1L); 
        System.out.println("######## id in service impl ================ "+oauthAuthorization.getId());
    	
    	System.out.println("Client id : " + clientId);
    	RMDetails rmDetails1 = rmDetailsDAO.getRMDetailById(clientId);
    	System.out.println("rmDetails: " + rmDetails1);
//        User client = userDAO.findById(Integer.valueOf(clientId));
        oauthAuthorization.setId(System.currentTimeMillis());
        oauthAuthorization.setResourceIds(resourceId);
        System.out.println("oauthAuthorization.getResourceIds() ========================== "+oauthAuthorization.getResourceIds());
        oauthAuthorization.setAuthorizedGrantTypes(authorizedGrantTypes);
        System.out.println("oauthAuthorization.getAuthorizedGrantTypes() ========================== "+oauthAuthorization.getAuthorizedGrantTypes());
        oauthAuthorization.setAuthorities(authorities);
        System.out.println("oauthAuthorization.getAuthorities() ========================== "+oauthAuthorization.getAuthorities());
        oauthAuthorization.setScope(scope);
        System.out.println("oauthAuthorization.getScope() ========================== "+oauthAuthorization.getScope());
        oauthAuthorization.setClient(rmDetails);
        System.out.println("oauthAuthorization.getClient() ========================== "+oauthAuthorization.getClient());
        oauthAuthorization.setClientSecret(clientSecret);
        System.out.println("oauthAuthorization.getClientSecret() ========================== "+oauthAuthorization.getClientSecret());
        oauthAuthorization.setAccessTokenValidity(accessTokenValidity);
        System.out.println("oauthAuthorization.getAccessTokenValidity() ========================== "+oauthAuthorization.getAccessTokenValidity());
        oauthAuthorization.setCreatedBy(clientId);
        System.out.println("oauthAuthorization.getCreatedBy() ========================== "+oauthAuthorization.getCreatedBy());
        oAuthAuthorizationDAO.saveClientDetail(oauthAuthorization);
    }

    public boolean isClientValid(String clientId)
    {

        OauthAuthorization acdobj = oAuthAuthorizationDAO.getClient(clientId);
        return acdobj != null;
    }

    @Transactional(rollbackOn = { Exception.class })
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException
    {
        try
        {
        	OauthAuthorization oauthAuthorization = oAuthAuthorizationDAO.loadClientByClientId(clientId);
        
	        CustomOauthAuthorization customOauthAuthorization = null;
	        if (oauthAuthorization != null)
	        {
	            customOauthAuthorization = new CustomOauthAuthorization(oauthAuthorization.getClient().getId(), oauthAuthorization.getResourceIds(), oauthAuthorization.getClientSecret(),
	                    oauthAuthorization.getScope(), oauthAuthorization.getAuthorizedGrantTypes(), oauthAuthorization.getAuthorities(), oauthAuthorization.getAccessTokenValidity());
	        }
	        return customOauthAuthorization;
        }
        catch (Exception e)
        {
        	throw new ClientRegistrationException("Exception while loading client by id.", e);
        }
    }

}
