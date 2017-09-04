package com.afrAsia.authenticate;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.LoginDataRequest;

/**
 *
 * The Interface <Code> CustomClientDetailsService </Code>  service that provides the details about an OAuth2 client.
 * 
 * @author shweta.sankhe
 *
 */
public interface  CustomClientDetailsService extends ClientDetailsService {

	/**
	 * Save client detail.
	 *
	 * @param clientId the client id
	 * @param resourceId the resource id
	 * @param clientSecret the client secret
	 * @param scope the scope
	 * @param authorizedGrantTypes the authorized grant types
	 * @param webServerRedirectUri the web server redirect uri
	 * @param authorities the authorities
	 * @param accessTokenValidity the access token validity
	 * @param refreshTokenValidity the refresh token validity
	 * @param additionalInformation the additional information
	 * @param autoApprove the auto approve
	 */
	public RMDetails saveClientDetail(String clientId, String clientType, String resourceId,
			String clientSecret, String scope, String authorizedGrantTypes,
			String webServerRedirectUri, String authorities,
			int accessTokenValidity, int refreshTokenValidity,
			String additionalInformation, String autoApprove);

	/**
	 * Checks if is client valid.
	 *
	 * @param clientId the client id
	 * @return true, if is client valid
	 */
	public boolean isClientValid(String clientId);
	public RMDetails getRMDetails(String clientId, String clientType);

	public ClientDetails loadClientByClientId(LoginDataRequest loginDataRequest);


}
