package com.afrAsia.service;

import java.util.Map;

import com.afrAsia.entities.masters.RMDetails;

public interface AccountCreationSOAPService {
	public Map<String, Object> createAccount(long appId, String userId, long lRecordId)  throws Exception;
	
	public void createCustomerSOAPRequest(long appId, String userId);
	
	public RMDetails getRMDetails(String RMId);
	
}