package com.afrAsia.service;

import java.io.IOException;
import java.io.InputStream;

import com.afrAsia.entities.request.KYCDataRequest;
import com.afrAsia.entities.response.KYCResponse;

/**
 * @author mds012
 *
 */
public interface KYCService {
	/**
	 * This method upload the given image to pdf/image to
	 *  a shared location and store the shared path in database
	 * @param kycDataRequest 
	 * @param image 
	 * @return 
	 */
	KYCResponse uploadKYC(KYCDataRequest kycDataRequest, InputStream image);   
	void copyKYCFiles(Long appId, Long applicantId, Long cif, Long recordNo, String rmId, Boolean isMinor) throws IOException;
}