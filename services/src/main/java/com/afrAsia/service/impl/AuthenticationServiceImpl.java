package com.afrAsia.service.impl;

import com.afrAsia.dao.OAuthAuthorizationDAO;
import com.afrAsia.entities.request.LoginDataRequest;
import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.LoginDataResponse;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutResponse;
import com.afrAsia.service.AuthenticationService;
import com.afrAsia.service.RMDetailsService;

/**
 * 
 * @author nyalf769
 *
 */
public class AuthenticationServiceImpl implements AuthenticationService
{
	private OAuthAuthorizationDAO oAuthAuthorizationDAO;
	
	//private CustomClientDetailsService customClientDetailsService;
	
	private RMDetailsService rmDetailsService;
	
	//private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11, new SecureRandom());
	
	//private DefaultTokenServices tokenServices;
	
	//private DefaultOAuth2RequestFactory oAuth2RequestFactory;
	
	/*public void setTokenServices(DefaultTokenServices tokenServices) {
		this.tokenServices = tokenServices;
	}*/
	
	/*public void setoAuth2RequestFactory(DefaultOAuth2RequestFactory oAuth2RequestFactory) {
		this.oAuth2RequestFactory = oAuth2RequestFactory;
	}*/
	
	/*public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}*/
	
	/*public DefaultOAuth2RequestFactory getoAuth2RequestFactory() {
		return oAuth2RequestFactory;
	}*/
	
	/*public DefaultTokenServices getTokenServices() {
		return tokenServices;
	}*/
	
	public RMDetailsService getRmDetailsService() {
		return rmDetailsService;
	}
	
	public void setRmDetailsService(RMDetailsService rmDetailsService) {
		this.rmDetailsService = rmDetailsService;
	}
	
	/*public CustomClientDetailsService getCustomClientDetailsService() {
		return customClientDetailsService;
	}*/
	
	/*public void setCustomClientDetailsService(CustomClientDetailsService customClientDetailsService) {
		this.customClientDetailsService = customClientDetailsService;
	}*/
	
	public OAuthAuthorizationDAO getoAuthAuthorizationDAO() 
	{
		return oAuthAuthorizationDAO;
	}
	
	public void setoAuthAuthorizationDAO(OAuthAuthorizationDAO oAuthAuthorizationDAO) 
	{
		this.oAuthAuthorizationDAO = oAuthAuthorizationDAO;
	}

	public LoginResponse login(LoginRequest loginRequest) 
	{
		LoginResponse response = new LoginResponse();
		LoginDataResponse responseData = new LoginDataResponse();
		
		LoginDataRequest loginDataRequest = loginRequest.getData();
		//Long id = loginDataRequest.getId();
		String userId = loginDataRequest.getUserId();
		System.out.println("required user id in service impl ================= "+userId);
		//String clientSecret = passwordEncoder.encode(loginDataRequest.getPassword());
		System.out.println("password ================ "+loginDataRequest.getPassword());
		//System.out.println("clientSecret =========== "+clientSecret);
		
		rmDetailsService.saveRMDetails("ID" + userId, userId);
		
		/*customClientDetailsService.saveClientDetail(userId, "rest_api", clientSecret, 
				"standard_client", "client_credentials", null, "ROLE_USER",
				2147483600, 2147483600, null, null); */
		
		//OAuth2AccessToken token = getTokenDetails(userId, clientSecret, "client_credentials");
		
		//responseData.setoAuthToken(token.getValue());
		responseData.setRmName(userId);
		responseData.setSuccess("true");
		response.setData(responseData);
		
		return response;
	}

	public LogoutResponse logout(LogoutRequest logoutRequest) 
	{
		
		LogoutResponse response = new LogoutResponse();
		
		String userId = logoutRequest.getData().getUserId();
		return response;
	}

	public GenericResponse checkSession() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/*private OAuth2AccessToken getTokenDetails(String rmId, String password, String grantType)
	{
		Map<String, String> requestParameters = new HashMap<String, String>();
		requestParameters.put("client_id", rmId);
		requestParameters.put("grant_type", grantType);
		requestParameters.put("client_secret", password);
		
		ClientCredentialsTokenGranter tokenGranter = new ClientCredentialsTokenGranter(tokenServices, customClientDetailsService, oAuth2RequestFactory);
		ClientDetails clientDetails = customClientDetailsService.loadClientByClientId(rmId);
		TokenRequest request  = oAuth2RequestFactory.createTokenRequest(requestParameters, clientDetails);
		OAuth2AccessToken token = tokenGranter.grant(grantType, request);
		
		return token;
		
		
	}*/

}
