package com.afrAsia.service.impl;

import java.security.SecureRandom;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* LDAP */

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

import org.apache.log4j.Logger;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.client.ClientCredentialsTokenGranter;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.authenticate.CustomClientDetailsService;
import com.afrAsia.dao.OAuthAuthorizationDAO;
import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.dao.jpa.RMSessionDetailJpaDAO;
import com.afrAsia.entities.jpa.MobRmSessionDetail;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.LoginDataRequest;
import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutDataRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.LoginDataResponse;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutDataResponse;
import com.afrAsia.entities.response.LogoutResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.service.AuthenticationService;
import com.afrAsia.service.RMDetailsService;

/**
 * 
 * @author nyalf769
 *
 */
public class AuthenticationServiceImpl implements AuthenticationService
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private OAuthAuthorizationDAO oAuthAuthorizationDAO;
	
	private CustomClientDetailsService customClientDetailsService;
	
	private RMDetailsService rmDetailsService;
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11, new SecureRandom());
	
	private DefaultTokenServices tokenServices;
	
	private DefaultOAuth2RequestFactory oAuth2RequestFactory;
	
	private RMSessionDetailJpaDAO rmSessionDetailJpaDAO;
	
	private RMDetailsDao rmDetailsDAO;
	
	/* LDAP */
	private String authenticationType;
	
	private String url;
	
	private String contextFactory;
	
	
	public RMDetailsDao getRmDetailsDAO() {
		return rmDetailsDAO;
	}

	public void setRmDetailsDAO(RMDetailsDao rmDetailsDAO) {
		this.rmDetailsDAO = rmDetailsDAO;
	}
	
	public RMSessionDetailJpaDAO getRmSessionDetailJpaDAO() {
		return rmSessionDetailJpaDAO;
	}

	public void setRmSessionDetailJpaDAO(RMSessionDetailJpaDAO rmSessionDetailJpaDAO) {
		this.rmSessionDetailJpaDAO = rmSessionDetailJpaDAO;
	}
	public String getContextFactory() {
		return contextFactory;
	}
	
	public void setContextFactory(String contextFactory) {
		this.contextFactory = contextFactory;
	}
	
	public String getAuthenticationType() {
		return authenticationType;
	}
	
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setTokenServices(DefaultTokenServices tokenServices) {
		this.tokenServices = tokenServices;
	}
	
	public void setoAuth2RequestFactory(DefaultOAuth2RequestFactory oAuth2RequestFactory) {
		this.oAuth2RequestFactory = oAuth2RequestFactory;
	}
	
	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
	
	public DefaultOAuth2RequestFactory getoAuth2RequestFactory() {
		return oAuth2RequestFactory;
	}
	
	public DefaultTokenServices getTokenServices() {
		return tokenServices;
	}
	
	public RMDetailsService getRmDetailsService() {
		return rmDetailsService;
	}
	
	public void setRmDetailsService(RMDetailsService rmDetailsService) {
		this.rmDetailsService = rmDetailsService;
	}
	
	public CustomClientDetailsService getCustomClientDetailsService() {
		return customClientDetailsService;
	}
	
	public void setCustomClientDetailsService(CustomClientDetailsService customClientDetailsService) {
		this.customClientDetailsService = customClientDetailsService;
	}
	
	public OAuthAuthorizationDAO getoAuthAuthorizationDAO() 
	{
		return oAuthAuthorizationDAO;
	}
	
	public void setoAuthAuthorizationDAO(OAuthAuthorizationDAO oAuthAuthorizationDAO) 
	{
		this.oAuthAuthorizationDAO = oAuthAuthorizationDAO;
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public LoginResponse login(LoginRequest loginRequest) throws Exception
	{
		LoginResponse response = new LoginResponse();
		LoginDataResponse responseData = new LoginDataResponse();
		
		LoginDataRequest loginDataRequest = loginRequest.getData();
		String userId = loginDataRequest.getUserId();
		String clientSecret = passwordEncoder.encode(loginDataRequest.getPassword());
		String userType = loginDataRequest.getUserType();
		
		if(tryLdapConnection(loginDataRequest.getUserId(),loginDataRequest.getPassword())){
			ClientDetails clientDetails = customClientDetailsService.loadClientByClientId(userId); 
			OAuth2AccessToken token = getTokenDetails(userId, clientSecret, "client_credentials");
			infoLog.info("clientDetails in login(),AuthenticationServiceImpl is : "+clientDetails);

			RMDetails rmDetails;
			
			if (clientDetails == null)
			{
				rmDetails = customClientDetailsService.saveClientDetail(userId, userType,"rest_api", clientSecret, 
						"standard_client", "client_credentials", null, "ROLE_USER", 
						1800, 1800, null, null);	
			}
			else{
				LogoutRequest logOutRequest = new LogoutRequest();
				LogoutDataRequest logoutDataRequest = new LogoutDataRequest();
				logoutDataRequest.setDeviceId(loginDataRequest.getDeviceId());
				logoutDataRequest.setUserId(loginDataRequest.getUserId());
				logout(logOutRequest, token.getValue());
				rmDetails = customClientDetailsService.getRMDetails(userId, userType);
				infoLog.info("rmDetails in AuthenticationServiceImpl"+rmDetails);
			}
			
			MobRmSessionDetail mobRmSessionDetail = new MobRmSessionDetail();
			mobRmSessionDetail.setDeviceId(loginDataRequest.getDeviceId());
			mobRmSessionDetail.setRmId(loginDataRequest.getUserId());		
			mobRmSessionDetail.setCreatedDate(new Date());
			mobRmSessionDetail.setCreatedBy(loginDataRequest.getUserId());
			MobRmSessionDetail mobRmPreviousSession = rmSessionDetailJpaDAO.setLoginTime(mobRmSessionDetail);
		 		
	 		token = getTokenDetails(userId, clientSecret, "client_credentials");
	 		
			if(mobRmPreviousSession != null){
				long millis = 0l;
				if(mobRmPreviousSession.getCreatedDate()!=null)
					millis=mobRmPreviousSession.getCreatedDate().getTime();
				responseData.setLastLoginTime(millis);
				if(mobRmPreviousSession.getCreatedDate()!=null)
					responseData.setLastLoginTime(mobRmPreviousSession.getCreatedDate().getTime());
				infoLog.info("Previous Session Details::" + mobRmPreviousSession.toString());
			}
			
			responseData.setoAuthToken(token.getValue());
			responseData.setRmName(rmDetails.getRmName());
			responseData.setSuccess("true");
			response.setData(responseData);
			infoLog.info("response in login(),AuthenticationServiceImpl : "+response);	
			return response;
		}
		else{
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("403");
			error.setCustomCode("ERR401");
			error.setRsn("Login failed.");
			msgHeader.setError(error);
			response.setMsgHeader(msgHeader);
			response.setData(null);
			return response;
		}
	}

	public LogoutResponse logout(LogoutRequest logoutRequest, String oauthToken) 
	{
		oauthToken = oauthToken.replace("bearer ", "");
		LogoutResponse response = new LogoutResponse();
		Boolean check = tokenServices.revokeToken(oauthToken);
		LogoutDataResponse data = new LogoutDataResponse();
		data.setSuccess(check + "");
		
		response.setData(data);
		infoLog.info("response in logout(),AuthenticationServiceImpl : "+response);
		return response;
	}

	public GenericResponse checkSession() 
	{
//		Map<String, String> requestParameters = new HashMap<String, String>();
//		requestParameters.put("client_id", rmId);
//		requestParameters.put("grant_type", grantType);
//		requestParameters.put("client_secret", password);
//		
//		ClientCredentialsTokenGranter tokenGranter = new ClientCredentialsTokenGranter(tokenServices, customClientDetailsService, oAuth2RequestFactory);
//		ClientDetails clientDetails = customClientDetailsService.loadClientByClientId(rmId);
//		TokenRequest request  = oAuth2RequestFactory.createTokenRequest(requestParameters, clientDetails);
//		
//		tokenServices.refreshAccessToken(refreshTokenValue, request);\
		
		return null;
	}
	
	private OAuth2AccessToken getTokenDetails(String rmId, String password, String grantType)
	{
		Map<String, String> requestParameters = new HashMap<String, String>();
		requestParameters.put("client_id", rmId);
		requestParameters.put("grant_type", grantType);
		requestParameters.put("client_secret", password);
		
		ClientCredentialsTokenGranter tokenGranter = new ClientCredentialsTokenGranter(tokenServices, customClientDetailsService, oAuth2RequestFactory);
		ClientDetails clientDetails = customClientDetailsService.loadClientByClientId(rmId);
		infoLog.info("clientDetails in getTokenDetails(),AuthenticationServiceImpl is : "+clientDetails);
		TokenRequest request  = oAuth2RequestFactory.createTokenRequest(requestParameters, clientDetails);
		OAuth2AccessToken token = tokenGranter.grant(grantType, request);
		infoLog.info("token in getTokenDetails(),AuthenticationServiceImpl : "+token);
		return token;
	}
	
	private boolean tryLdapConnection(String username, String password) throws Exception {
		try {
			Hashtable<String, String> env = new Hashtable<String, String>();

			env.put(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
	        env.put(Context.PROVIDER_URL, url);
	        env.put(Context.SECURITY_AUTHENTICATION, authenticationType);
	        env.put(Context.SECURITY_PRINCIPAL, username);
	        env.put(Context.SECURITY_CREDENTIALS, password);

			LdapContext ctx = new InitialLdapContext(env, null);
			ctx.setRequestControls(null);

			NamingEnumeration<?> namingEnum = ctx.search("ou=AfrasiaBank Users,dc=afrasiabank,DC=local", "(memberOf=CN=G-RMMobile,OU=Groups,OU=AfrasiaBank Users,DC=afrasiabank,DC=local)", getSearchControls());	
			
			while (namingEnum != null && namingEnum.hasMoreElements())
			{
				SearchResult result = (SearchResult) namingEnum.next ();    
	            Attributes attrs = result.getAttributes();
	            String name = attrs.get("cn").toString();
	            String mail = attrs.get("mail").toString();
	 
	            
	            if(name.contains(username)){
	            	System.out.println("Name matched" + name + "Mail" + mail);
	            	name = name.substring(4);
		            mail = mail.substring(6);
	            	
	            	/*Start: Code Added by Avisha to add RM's email ID, Mob No and flex ID on 05/09*/        	
	    			RMDetails rmDetails = new RMDetails();
	    			rmDetails.setId(username);
	    			rmDetails.setRmName(name);
	    			rmDetails.setRmEmailId(mail);
	    			List<RMDetails> rmDetailsLst = rmDetailsDAO.getRMDetailListByRMId(username);
	    			infoLog.info("RMDetailsList siz: "+rmDetailsLst.size());
	    			if(rmDetailsLst!=null && rmDetailsLst.size()!=0)
	    			{
	    				rmDetails.setModifiedBy(username);
	    				rmDetails.setModifiedDate(new Date(System.currentTimeMillis()));
	    				rmDetailsDAO.updateRmDetails(rmDetails);
	    			}
	    			else
	    			{
	    				rmDetails.setCreatedBy(username);
	    				rmDetails.setCreatedDate(new Date(System.currentTimeMillis()));
	    				rmDetailsDAO.saveRmDetails(rmDetails);
	    			}
	    			/*End: Code Added by Avisha to add RM's email ID, Mob No and flex ID on 05/09*/

	            	return true;
	            	
	            }       
			}
		} catch (Exception e) {
			System.out.println("LDAP EXCEPTION" + e.getMessage());
			e.printStackTrace();
			throw new Exception();
		}
		throw new Exception();
	}

	private SearchControls getSearchControls() 
	{
		SearchControls searchControls = new SearchControls();
		searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		searchControls.setTimeLimit(30000);
		return searchControls;
	}
	
	private boolean tryLdapConnection1(String username, String password)
	{
		try
		{
			Hashtable<String, String> env = new Hashtable<String, String>();
	
	        env.put(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
	        env.put(Context.PROVIDER_URL, url);
	        env.put(Context.SECURITY_AUTHENTICATION, authenticationType);
	        env.put(Context.SECURITY_PRINCIPAL, username);
	        env.put(Context.SECURITY_CREDENTIALS, password);
	        DirContext ctx = new InitialDirContext(env);
	        ctx.lookup("CN=Schema,CN=Configuration,DC=afrasiabank,DC=local");

		}
		catch (Exception e)
		{
			errorLog.error("LDAP EXCEPTION" + e.getMessage());
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
