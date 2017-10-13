package com.afrAsia.dao.jpa.impl;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.afrAsia.dao.jpa.UpdateApplCheckStatusJpaDao;
import com.afrAsia.entities.transactions.MobAppRefRecordId;
import com.afrAsia.entities.transactions.MobApplCheck;
import com.afrAsia.entities.transactions.MobApplCheckComments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public class UpdateApplCheckStatusJpaDaoImpl extends BaseJpaDAOImpl<String, MobAppRefRecordId> implements UpdateApplCheckStatusJpaDao {

	public MobApplCheck storeApplCheckStatus(MobApplCheck mobApplCheck) {
		getEntityManager().persist(mobApplCheck);
		getEntityManager().flush();
		return mobApplCheck;
	}


	public MobApplCheck getApplCheckStatus(Long recordId) throws NoResultException{

		Query query = getEntityManager()
				.createQuery("FROM MobApplCheck mac WHERE mac.recordId=:recordId");
		query.setParameter("recordId", recordId);
		return (MobApplCheck) query.getSingleResult();
	}
	
	public MobApplCheck saveOrUpdate(MobApplCheck entity)
    {
        entity = getEntityManager().merge(entity);
        flush();
        return entity;
    }
	
	public void updateApplCheckStatus(MobApplCheck mobApplCheck) {
		
		Query query = getEntityManager()
				.createQuery("UPDATE MobApplCheck mac set mac.kycStatus=:kycStatus,mac.kycDoneBy=:kycDoneBy, " +
							"mac.kycDone=:kycDone, mac.kycUrl=:kycUrl, mac.ccStatus=:ccStatus, mac.ccDone=:ccDone, mac.ccDoneBy=:ccDoneBy, mac.ccUrl=:ccUrl, "+
							"mac.wcStatus=:wcStatus, mac.wcDone=:wcDone, mac.wcDoneBy=:wcDoneBy, mac.wcUrl=:wcUrl, mac.icStatus=:icStatus, "+
							"mac.icDone=:icDone, mac.icDoneBy=:icDoneBy, mac.icUrl=:icUrl where mac.recordId =:recordId ");
		query.setParameter("recordId", mobApplCheck.getRecordId());
		query.setParameter("kycStatus", mobApplCheck.getKycStatus());
		query.setParameter("kycDoneBy", mobApplCheck.getKycDoneBy());
		query.setParameter("kycDone", mobApplCheck.getKycDone());
		query.setParameter("kycUrl", mobApplCheck.getKycUrl());
		query.setParameter("ccStatus", mobApplCheck.getCcStatus());		
		query.setParameter("ccDone", mobApplCheck.getCcDone());
		query.setParameter("ccDoneBy", mobApplCheck.getCcDoneBy());
		query.setParameter("ccUrl", mobApplCheck.getCcUrl());
		query.setParameter("wcStatus", mobApplCheck.getWcStatus());		
		query.setParameter("wcDone", mobApplCheck.getWcDone());
		query.setParameter("wcDoneBy", mobApplCheck.getWcDoneBy());
		query.setParameter("wcUrl", mobApplCheck.getWcUrl());
		query.setParameter("icStatus", mobApplCheck.getIcStatus());		
		query.setParameter("icDone", mobApplCheck.getIcDone());
		query.setParameter("icDoneBy", mobApplCheck.getIcDoneBy());
		query.setParameter("icUrl", mobApplCheck.getIcUrl());
		query.executeUpdate();
		
		
	}

	public void updateAppStatus(MobRmAppRefId mobRmAppRefId) {
		String queryString = "UPDATE MobRmAppRefId s SET s.appStatus=:appStatus where s.id =:appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("appStatus", mobRmAppRefId.getAppStatus());
		query.setParameter("appRefId", mobRmAppRefId.getId());
		query.executeUpdate();
	}
	
	public MobApplCheckComments storeApplCheckComm(MobApplCheckComments mobApplCheckComments) {
		getEntityManager().persist(mobApplCheckComments);
		getEntityManager().flush();
		return mobApplCheckComments;
	}


	public MobApplCheckComments getApplCheckComm(Long refId, Long recordId) {

		Query query = getEntityManager()
				.createQuery("FROM MobApplCheckComments mac WHERE mac.id =:id and mac.recordId=:recordId");
		query.setParameter("id", refId);
		query.setParameter("recordId", recordId);
		return (MobApplCheckComments) query.getSingleResult();
	}
	
	public void updateMobApplCheckComm(MobApplCheckComments mobApplCheckComments) {
		String queryString = "UPDATE MobApplCheckComments s SET s.compId=:compId, s.compComment=:compComment,"+
							" s.icComment=:icComment, s.kycComment=:kycComment, s.wcComment=:wcComment,"+
							" s.ccComment=:ccComment where s.id =:appRefId and s.recordId=:recordId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("compId", mobApplCheckComments.getCompId());
		query.setParameter("compComment", mobApplCheckComments.getCompComment());
		query.setParameter("icComment", mobApplCheckComments.getIcComment());
		query.setParameter("kycComment", mobApplCheckComments.getKycComment());
		query.setParameter("wcComment", mobApplCheckComments.getWcComment());
		query.setParameter("ccComment", mobApplCheckComments.getCcComment());
		query.setParameter("appRefId", mobApplCheckComments.getId());
		query.setParameter("recordId", mobApplCheckComments.getRecordId());
		query.executeUpdate();
	}
	
	public MobRmAppRefId getMobAppRefId(Long refId) {

		Query query = getEntityManager()
				.createQuery("FROM MobRmAppRefId mac WHERE mac.id=:refId");
		query.setParameter("refId", refId);
		return (MobRmAppRefId) query.getSingleResult();
	}
	
}
