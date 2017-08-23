package com.afrAsia.service;


public interface KycDocDownloadService {
	public String getKycDocPath(Long appRefId, Long applicantId, String docId);
}
