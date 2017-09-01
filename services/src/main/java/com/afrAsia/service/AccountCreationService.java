package com.afrAsia.service;

import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.response.AccountCreateResponse;

public interface AccountCreationService {
	public AccountCreateResponse createAccount(AccountCreationRequest accountCreationRequest);
	public AccountCreateResponse updateAccount(AccountCreationRequest accountUpdateRequest);
	public RMDetails getRMDetails(String RMId);
}
