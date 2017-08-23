package com.afrAsia.dao.jpa;

import com.afrAsia.entities.transactions.MobApplicantKycDocuments;

public interface UploadKYCJpaDAO {

	/**
	 * @param kycDocs
	 */
	void saveKYCDocLocation(MobApplicantKycDocuments kycDocs); 

}
