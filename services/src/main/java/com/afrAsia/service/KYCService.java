package com.afrAsia.service;

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
}