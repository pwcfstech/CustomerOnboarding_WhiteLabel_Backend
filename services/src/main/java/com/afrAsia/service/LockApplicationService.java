package com.afrAsia.service;

import com.afrAsia.entities.request.LockApplicationRequest;
import com.afrAsia.entities.response.LockApplicationResponse;

public interface LockApplicationService {
	public LockApplicationResponse lockAccount(LockApplicationRequest lockApplicationRequest);
}
