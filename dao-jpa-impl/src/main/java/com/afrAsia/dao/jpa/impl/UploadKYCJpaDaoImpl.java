package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

<<<<<<< HEAD:dao-jpa-impl/src/main/java/com/afrAsia/dao/jpa/impl/UploadKYCJpaDaoImpl.java
import com.afrAsia.dao.jpa.UploadKYCJpaDAO;
=======
import com.afrAsia.dao.jpa.UploadKYCDao;
>>>>>>> 07d83f52b8eec632ff549e7755d419943530e2f7:dao-jpa-impl/src/main/java/com/afrAsia/dao/jpa/impl/UploadKYCDaoImpl.java
import com.afrAsia.entities.transactions.MobApplicantKycDocuments;

/**
 * @author mds012
 *
 */
<<<<<<< HEAD:dao-jpa-impl/src/main/java/com/afrAsia/dao/jpa/impl/UploadKYCJpaDaoImpl.java
public class UploadKYCJpaDaoImpl extends BaseJpaDAOImpl<Long, MobApplicantKycDocuments> implements UploadKYCJpaDAO {
=======
public class UploadKYCDaoImpl extends BaseJpaDAOImpl<Long, MobApplicantKycDocuments> implements UploadKYCDao {
>>>>>>> 07d83f52b8eec632ff549e7755d419943530e2f7:dao-jpa-impl/src/main/java/com/afrAsia/dao/jpa/impl/UploadKYCDaoImpl.java

	/* (non-Javadoc)
	 * @see com.afrAsia.dao.jpa.UploadKYCDao#saveKYCDocLocation(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	public void saveKYCDocLocation(MobApplicantKycDocuments kycDocs) {
<<<<<<< HEAD:dao-jpa-impl/src/main/java/com/afrAsia/dao/jpa/impl/UploadKYCJpaDaoImpl.java
		System.out.println("Enter : UploadKYCDao#saveKYCDocLocation() kycDocs : " + kycDocs);
=======
		System.out.println("Enter : UploadKYCDao#saveKYCDocLocation()");
>>>>>>> 07d83f52b8eec632ff549e7755d419943530e2f7:dao-jpa-impl/src/main/java/com/afrAsia/dao/jpa/impl/UploadKYCDaoImpl.java
		if (null != kycDocs && null != kycDocs.getId()) {
			Query query = getEntityManager().createQuery("SELECT t FROM MobApplicantKycDocuments t WHERE t.id.id = :id AND t.id.applicantId = :applicantId AND t.id.docId = :docId");
			query.setParameter("id", kycDocs.getId().getId());
			query.setParameter("applicantId", kycDocs.getId().getApplicantId());
			query.setParameter("docId", kycDocs.getId().getDocId());
			List result = query.getResultList();
			System.out.println("Result : " + result);
			
			if (result != null && !result.isEmpty()) {
				MobApplicantKycDocuments kycUpdateDocs = (MobApplicantKycDocuments) result.get(0);
				kycUpdateDocs.setRecordId(kycDocs.getRecordId());
				kycUpdateDocs.setDocUrl(kycDocs.getDocUrl());
				kycUpdateDocs.setModifiedBy(kycDocs.getModifiedBy());
				kycUpdateDocs.setModifiedDate(kycDocs.getModifiedDate());
				getEntityManager().merge(kycUpdateDocs);
				getEntityManager().flush();
			} else {
				getEntityManager().persist(kycDocs);
				getEntityManager().flush();
			}
		}

		System.out.println("Exit : UploadKYCDao#saveKYCDocLocation()");
	}

}
