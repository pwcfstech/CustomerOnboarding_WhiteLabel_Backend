package com.afrAsia.service;

import java.util.Map;

public interface AccountCreationSOAPService {
	public Map<String, Object> createAccount(long appId, String userId, long lRecordId);
	
	public void createCustomerSOAPRequest(long appId, String userId);
	
}