package com.afrAsia.service;

import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.response.AccountCreateResponse;

public interface AccountCreationService {
		AccountCreateResponse createAccount(AccountCreationRequest accountCreationRequest);
		AccountCreateResponse updateAccount(AccountCreationRequest accountCreationRequest);
}
