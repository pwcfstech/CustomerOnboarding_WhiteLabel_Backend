package com.afrAsia.dao.jpa.impl;

import java.util.HashMap;
import java.util.Map;

import com.afrAsia.dao.jpa.OAuthAuthorizationJpaDAO;
import com.afrAsia.entities.jpa.OauthAuthorization;

public class OAuthAuthorizationJpaDAOImpl extends BaseJpaDAOImpl<String, OauthAuthorization>
		implements OAuthAuthorizationJpaDAO 
{

	public OauthAuthorization getOauthAuthorizationByClientId(String clientId) 
	{
		Map<String, Object> parameters = new HashMap<String, Object>();
		// Client client = clientJpaDAO.findById(clientId);
		// if(oauthAuthorization!=null){
		// oauthAuthorization.setClient(client);
		// }
		parameters.put("clientId", clientId);
		return findByNamedQuery(OauthAuthorization.QUERY_FIND_BY_CLIENT_ID, parameters);
	}

	public void saveClientDetail(OauthAuthorization oauthAuthorization) 
	{
		if (oauthAuthorization != null)
		{
			saveOrUpdate(oauthAuthorization);
		}

	}

	public OauthAuthorization loadClientByClientId(String clientId) throws Exception 
	{
		Map<String, Object> parameters = new HashMap<String, Object>();
		// Client client = clientJpaDAO.findById(clientId);
		// if(oauthAuthorization!=null){
		// oauthAuthorization.setClient(client);
		// }
		parameters.put("clientId", clientId);
		return findByNamedQuery(OauthAuthorization.QUERY_FIND_BY_CLIENT_ID, parameters);
	}

	public OauthAuthorization getClient(String clientId) 
	{
		Map<String, Object> parameters = new HashMap<String, Object>();
		// Client client = clientJpaDAO.findById(clientId);
		// if(oauthAuthorization!=null){
		// oauthAuthorization.setClient(client);
		// }
		parameters.put("clientId", clientId);
		return findByNamedQuery(OauthAuthorization.QUERY_FIND_BY_CLIENT_ID, parameters);
	}

}
