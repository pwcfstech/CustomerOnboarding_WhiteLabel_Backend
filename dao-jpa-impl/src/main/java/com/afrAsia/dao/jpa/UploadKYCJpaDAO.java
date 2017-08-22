package com.afrAsia.dao.jpa;

import com.afrAsia.entities.transactions.MobApplicantKycDocuments;

/**
 * @author mds012
 *
 */
public interface UploadKYCDao {

	/**
	 * @param kycDocs
	 */
	void saveKYCDocLocation(MobApplicantKycDocuments kycDocs); 

}
