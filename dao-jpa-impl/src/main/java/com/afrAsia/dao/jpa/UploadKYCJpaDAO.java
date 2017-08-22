package com.afrAsia.dao.jpa;

import com.afrAsia.entities.transactions.MobApplicantKycDocuments;

/**
 * @author mds012
 *
 */
public interface UploadKYCJpaDAO {

	/**
	 * @param kycDocs
	 */
	void saveKYCDocLocation(MobApplicantKycDocuments kycDocs); 

}
