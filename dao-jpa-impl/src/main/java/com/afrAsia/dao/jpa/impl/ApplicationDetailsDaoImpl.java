package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.entities.transactions.MobAccountAdditionalDetail;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobAppRefRecordId;
import com.afrAsia.entities.transactions.MobApplicantAdditionalDtl;
import com.afrAsia.entities.transactions.MobApplicantCommDetail;
import com.afrAsia.entities.transactions.MobApplicantEmploymentDtl;
import com.afrAsia.entities.transactions.MobApplicantKycDocuments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobApplicantRecordId;
import com.afrAsia.entities.transactions.MobComments;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public class ApplicationDetailsDaoImpl extends BaseJpaDAOImpl<Long, MobRmAppRefId>implements ApplicationDetailsJpaDAO {

	public MobRmAppRefId getApplicationDetails(Long appRefId) {
		String queryString = "SELECT s FROM MobRmAppRefId s where s.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (MobRmAppRefId) query.getSingleResult();
	}

	public MobAccountDetail getMobAccountDetails(Long appRefId) {
		String queryString = "SELECT s FROM MobAccountDetail s where s.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (MobAccountDetail) query.getSingleResult();
	}

	public MobAccountAdditionalDetail getMobAccountAdditionalDetails(Long appRefId) {
		String queryString = "SELECT s FROM MobAccountAdditionalDetail s where s.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (MobAccountAdditionalDetail) query.getSingleResult();
	}

	public List<MobApplicantRecordId> getMobApplicantRecordId(Long appRefId) {
		String queryString = "SELECT s FROM MobApplicantRecordId s where s.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (List<MobApplicantRecordId>) query.getResultList();
	}

	public MobApplicantPersonalDetail getMobApplicantPersonalDetails(Long appRefId, Long applicantId) {
		String queryString = "SELECT s FROM MobApplicantPersonalDetail s where s.id.id = :appRefId and s.id.applicantId = :applicantId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		query.setParameter("applicantId", applicantId);
		return (MobApplicantPersonalDetail) query.getSingleResult();
	}

	public MobApplicantCommDetail getMobApplicantCommDetails(Long appRefId, Long applicantId) {
		String queryString = "SELECT s FROM MobApplicantCommDetail s where s.id.id = :appRefId and s.id.applicantId = :applicantId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		query.setParameter("applicantId", applicantId);
		return (MobApplicantCommDetail) query.getSingleResult();
	}

	public MobApplicantEmploymentDtl getMobApplicantEmploymentDtl(Long appRefId, Long applicantId) {
		String queryString = "SELECT s FROM MobApplicantEmploymentDtl s where s.id.id = :appRefId and s.id.applicantId = :applicantId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		query.setParameter("applicantId", applicantId);
		return (MobApplicantEmploymentDtl) query.getSingleResult();
	}

	public MobApplicantAdditionalDtl getMobApplicantAdditionalDtl(Long appRefId, Long applicantId) {
		String queryString = "SELECT s FROM MobApplicantAdditionalDtl s where s.id.id = :appRefId and s.id.applicantId = :applicantId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		query.setParameter("applicantId", applicantId);
		return (MobApplicantAdditionalDtl) query.getSingleResult();
	}

	public List<MobComments> getComments(Long appRefId) {
		String queryString = "FROM MobComments s where s.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (List<MobComments>) query.getResultList();
	}

	public MobApplicantKycDocuments getMobApplicantKycSingleResult(Long appRefId, Long applicantId) {
		String queryString = "FROM MobApplicantKycDocuments s where s.id.id = :appRefId and s.id.applicantId = :applicantId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (MobApplicantKycDocuments) query.getSingleResult();
	}

	public MobApplicantKycDocuments getMobApplicantKycSingleResult(Long appRefId) {
		String queryString = "FROM MobApplicantKycDocuments s where s.id.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (MobApplicantKycDocuments) query.getSingleResult();
	}

	public List<MobApplicantKycDocuments> getMobApplicantKyc(Long appRefId) {
		String queryString = "FROM MobApplicantKycDocuments s where s.id.id = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		return (List<MobApplicantKycDocuments>) query.getResultList();
	}

	public List<MobApplicantKycDocuments> getMobApplicantKyc(Long appRefId, Long applicantId) {
		String queryString = "FROM MobApplicantKycDocuments s where s.id.id = :appRefId and s.id.applicantId = :applicantId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		query.setParameter("applicantId", applicantId);
		return (List<MobApplicantKycDocuments>) query.getResultList();
	}

	public MobApplicantKycDocuments getKycDocumentDetails(Long appRefId, Long applicantId, String docId) {
		String queryString = "FROM MobApplicantKycDocuments s where s.id.id = :appRefId and s.id.applicantId = :applicantId and s.id.docId = :docId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appRefId", appRefId);
		query.setParameter("applicantId", applicantId);
		query.setParameter("docId", docId);
		return (MobApplicantKycDocuments) query.getSingleResult();
	}

	public MobAppRefRecordId getRecordId(Long appRefId) {
		{
			/*
			 * Query query = getEntityManager() .createQuery(
			 * "select marri1.recordId from MobAppRefRecordId marri1 " +
			 * "where marri1.id=:appRefId " +
			 * "AND marri1.modifiedDate=(select max(marri2.modifiedDate) from MobAppRefRecordId marri2 "
			 * + "where marri2.id = :appRefId) ");
			 * 
			 * query.setParameter("appRefId", "appRefId"); Long recordId =
			 * (Long) query.getSingleResult(); System.out.println(
			 * "recordId in dao impl :: "+recordId); return recordId;
			 */
			String queryString = "SELECT s FROM MobAppRefRecordId s where s.id = :appRefId "
					+ "AND s.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = :appRefId)";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("appRefId", appRefId);
			return (MobAppRefRecordId) query.getSingleResult();
		}

	}
}
