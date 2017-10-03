package com.afrAsia.service;

import org.springframework.security.oauth2.common.OAuth2AccessToken;

import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.response.AccountCreateResponse;

public interface AccountCreationService {
	public AccountCreateResponse createAccount(AccountCreationRequest accountCreationRequest);
	public AccountCreateResponse updateAccount(AccountCreationRequest accountUpdateRequest);
	public RMDetails getRMDetails(String RMId);
	public OAuth2AccessToken checkSession(String rmId, String grantType, String refreshTokenValue);
}
