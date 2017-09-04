package com.afrAsia.authenticate.impl;

import java.util.Map;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

import com.afrAsia.authenticate.CustomClientDetailsService;
import com.afrAsia.authenticate.LdapGroup;
import com.afrAsia.authenticate.ldap.PersonRepoImpl;
import com.afrAsia.dao.OAuthAuthorizationDAO;
import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.dao.UserDAO;
import com.afrAsia.entities.jpa.OauthAuthorization;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.LoginDataRequest;

/**
 * The Class <Code> CustomClientDetailsServiceImpl </Code> service is custom
 * implementation that provides of the details about an OAuth2 client.
 *
 * @author shweta.sankhe
 *
 */
public class CustomClientDetailsServiceImpl implements CustomClientDetailsService
{

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
    /** The o auth authorization dao. */
    private OAuthAuthorizationDAO oAuthAuthorizationDAO; 
    
    private UserDAO userDAO;
    
    private RMDetailsDao rmDetailsDAO;
    
    private PersonRepoImpl personRepo;
    
    public PersonRepoImpl getPersonRepo() 
    {
		return personRepo;
	}
    
    public void setPersonRepo(PersonRepoImpl personRepo) 
    {
		this.personRepo = personRepo;
	}
    
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
    public RMDetails saveClientDetail(String clientId, String clientType, String resourceId, String clientSecret, String scope, String authorizedGrantTypes, String webServerRedirectUri, String authorities,
            int accessTokenValidity, int refreshTokenValidity, String additionalInformation, String autoApprove)
    {
    
    	RMDetails rmDetails = rmDetailsDAO.getRMDetailById(clientId, clientType);
    	//rmDetails.getRmName();
    	//rmDetails.setId("1");
//        User client = userDAO.findById(Integer.valueOf(clientId));
        OauthAuthorization oauthAuthorization = new OauthAuthorization();
        oauthAuthorization.setId(1L); 

//        User client = userDAO.findById(Integer.valueOf(clientId));
        oauthAuthorization.setId(System.currentTimeMillis());
        oauthAuthorization.setResourceIds(resourceId);
        oauthAuthorization.setAuthorizedGrantTypes(authorizedGrantTypes);
        oauthAuthorization.setAuthorities(authorities);
        oauthAuthorization.setScope(scope);
        oauthAuthorization.setClient(rmDetails);
        oauthAuthorization.setClientSecret(clientSecret);
        oauthAuthorization.setAccessTokenValidity(accessTokenValidity);
        oauthAuthorization.setCreatedBy(clientId);
        oAuthAuthorizationDAO.saveClientDetail(oauthAuthorization);
        return rmDetails;
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
        	infoLog.info("############### oauthAuthorization in loadClientByClientId(),CustomClientDetailsServiceImpl"+oauthAuthorization);
        	CustomOauthAuthorization customOauthAuthorization = null;
	        if (oauthAuthorization != null)
	        {
	            customOauthAuthorization = new CustomOauthAuthorization(oauthAuthorization.getClient().getId(), oauthAuthorization.getResourceIds(), oauthAuthorization.getClientSecret(),
	                    oauthAuthorization.getScope(), oauthAuthorization.getAuthorizedGrantTypes(), oauthAuthorization.getAuthorities(), oauthAuthorization.getAccessTokenValidity());
	        }
	        infoLog.info("customOauthAuthorization in loadClientByClientId(),CustomClientDetailsServiceImpl"+customOauthAuthorization);
	        return customOauthAuthorization;
        }
        catch (Exception e)
        {
        	errorLog.error("Exception while loading client by id."+ e.getMessage());
        	throw new ClientRegistrationException("Exception while loading client by id.", e);
        }
    }
    
    public RMDetails getRMDetails(String clientId, String clientType){
    	RMDetails rmDetails = rmDetailsDAO.getRMDetailById(clientId, clientType);
    	infoLog.info("rmDetails in getRMDetails(),CustomClientDetailsServiceImpl"+rmDetails);
    	return rmDetails;
    }

	public ClientDetails loadClientByClientId(LoginDataRequest loginDataRequest) 
	{
		try
        {
        	Map<String, String> personMap = personRepo.findPerson(loginDataRequest.getUserId(), loginDataRequest.getPassword());
        	if (personMap == null || personMap.isEmpty())
        	{
        		throw new ClientRegistrationException("No client with ID in LDAP.");
        	}
        	
        	String requestGroup = loginDataRequest.getUserType();
        	LdapGroup ldapGroup = LdapGroup.parseRequestGroup(requestGroup);
        	
        	String group = personMap.get(PersonRepoImpl.LDAP_MEMBER_OF_ATTRIBUTE);
        	if (ldapGroup == null || group == null || !group.contains(ldapGroup.getLdapGroup()))
        	{
        		throw new ClientRegistrationException("Client not part of the requested group " + ldapGroup);
        	}
        	
        	OauthAuthorization oauthAuthorization = oAuthAuthorizationDAO.loadClientByClientId(loginDataRequest.getUserId());
        
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
