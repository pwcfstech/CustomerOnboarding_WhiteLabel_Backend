package com.afrAsia.service.impl;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

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
import com.afrAsia.entities.request.LoginDataRequest;
import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.LoginDataResponse;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutDataResponse;
import com.afrAsia.entities.response.LogoutResponse;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.service.AuthenticationService;
import com.afrAsia.service.RMDetailsService;
import com.afrAsia.dao.RMDetailsDao;

import com.afrAsia.dao.jpa.RMSessionDetailJpaDAO;
import com.afrAsia.dao.jpa.impl.RMSessionDetailJpaDaoImpl;
import com.afrAsia.entities.jpa.MobRmSessionDetail;

/**
 * 
 * @author nyalf769
 *
 */
public class AuthenticationServiceImpl implements AuthenticationService
{
	private OAuthAuthorizationDAO oAuthAuthorizationDAO;
	
	private CustomClientDetailsService customClientDetailsService;
	
	private RMDetailsService rmDetailsService;
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11, new SecureRandom());
	
	private DefaultTokenServices tokenServices;
	
	private DefaultOAuth2RequestFactory oAuth2RequestFactory;
	
	private RMSessionDetailJpaDAO rmSessionDetailJpaDAO;
	
	
	
	public RMSessionDetailJpaDAO getRmSessionDetailJpaDAO() {
		return rmSessionDetailJpaDAO;
	}

	public void setRmSessionDetailJpaDAO(RMSessionDetailJpaDAO rmSessionDetailJpaDAO) {
		this.rmSessionDetailJpaDAO = rmSessionDetailJpaDAO;
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
	public LoginResponse login(LoginRequest loginRequest) 
	{
		System.out.println("in login ============ ");
		LoginResponse response = new LoginResponse();
		LoginDataResponse responseData = new LoginDataResponse();
		
		System.out.println("before loginDataRequest ============ ");
		LoginDataRequest loginDataRequest = loginRequest.getData();
		String userId = loginDataRequest.getUserId();
		System.out.println("user id ==== "+userId);
		System.out.println("password ==== "+loginDataRequest.getPassword());
		String clientSecret = passwordEncoder.encode(loginDataRequest.getPassword());
		System.out.println("clientSecret ==== "+clientSecret);
		String userType = loginDataRequest.getUserType();
		
		//rmDetailsService.saveRMDetails("ID" + userId, userId);
		
		ClientDetails clientDetails = customClientDetailsService.loadClientByClientId(userId); 
		System.out.println("clientDetails =========== "+clientDetails);
		
		RMDetails rmDetails;
		
		if (clientDetails == null)
		{
<<<<<<< HEAD
			rmDetails = customClientDetailsService.saveClientDetail(userId, userType,"rest_api", clientSecret, 
				"standard_client", "client_credentials", null, "ROLE_USER", 
				180, 180, null, null);
			
			
		}
		else{
			rmDetails = customClientDetailsService.getRMDetails(userId, userType);
		}
		
		MobRmSessionDetail mobRmSessionDetail = new MobRmSessionDetail();
		mobRmSessionDetail.setDeviceId(loginDataRequest.getDeviceId());
		mobRmSessionDetail.setRmId(loginDataRequest.getUserId());		
		mobRmSessionDetail.setCreatedDate(new Date());
		mobRmSessionDetail.setCreatedBy(loginDataRequest.getUserId());
		MobRmSessionDetail mobRmPreviousSession = rmSessionDetailJpaDAO.setLoginTime(mobRmSessionDetail);
		
		if(mobRmPreviousSession != null){
			responseData.setLastLoginTime(mobRmPreviousSession.getCreatedDate());
			System.out.println("Previous Session Details::" + mobRmPreviousSession.toString());
		}
		
		OAuth2AccessToken token = getTokenDetails(userId, clientSecret, "client_credentials");
		
		
		responseData.setoAuthToken(token.getValue());
		responseData.setRmName(rmDetails.getRmName());
		responseData.setSuccess("true");
		response.setData(responseData);
		
		return response;
	}

	public LogoutResponse logout(LogoutRequest logoutRequest, String oauthToken) 
	{
		oauthToken = oauthToken.replace("bearer ", "");
		LogoutResponse response = new LogoutResponse();
		Boolean check = tokenServices.revokeToken(oauthToken);
		LogoutDataResponse data = new LogoutDataResponse();
		data.setSuccess(check + "");
		
		response.setData(data);
		
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
		TokenRequest request  = oAuth2RequestFactory.createTokenRequest(requestParameters, clientDetails);
		OAuth2AccessToken token = tokenGranter.grant(grantType, request);
		
		return token;
		
		
	}

}