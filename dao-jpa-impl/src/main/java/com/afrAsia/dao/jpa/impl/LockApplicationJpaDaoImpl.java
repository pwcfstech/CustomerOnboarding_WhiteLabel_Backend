package com.afrAsia.dao.jpa.impl;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.afrAsia.dao.jpa.LockApplicationJpaDao;
import com.afrAsia.entities.transactions.MobAppRefRecordId;
import com.afrAsia.entities.transactions.MobApplCheck;

public class LockApplicationJpaDaoImpl extends BaseJpaDAOImpl<String, MobAppRefRecordId>implements LockApplicationJpaDao {

	public void storeApplCheckStatus(MobApplCheck mobApplCheck) {
		Query query = getEntityManager()
				.createQuery("update MobApplCheck ma set ma.isAppLocked =:isAppLocked " + "where ma.lockedBy =:lockedBy ");
		query.setParameter("isAppLocked", false);
		query.setParameter("lockedBy", mobApplCheck.getLockedBy());
		query.executeUpdate();
		
		getEntityManager().persist(mobApplCheck);
		getEntityManager().flush();
	}
	
	public MobApplCheck getApplCheckStatus(Long id) throws NoResultException{

		Query query = getEntityManager()
				.createQuery("FROM MobApplCheck mac WHERE mac.id=:id");
		query.setParameter("id", id);
		//query.setParameter("recordId", recordId);
		return (MobApplCheck) query.getSingleResult();
	}
	
	public void updateApplCheckStatus(MobApplCheck mobApplCheck) {
		Query query = getEntityManager()
				.createQuery("update MobApplCheck ma set ma.isAppLocked =:isAppLocked " + "where ma.lockedBy =:lockedBy ");
		query.setParameter("isAppLocked", false);
		query.setParameter("lockedBy", mobApplCheck.getLockedBy());
		query.executeUpdate();
		
		Query query1 = getEntityManager()
				.createQuery("update MobApplCheck ma set ma.isAppLocked =:isAppLocked,ma.lockedBy =:lockedBy,ma.modifiedBy =:modifiedBy,ma.modifiedDate =:modifiedDate " + "where ma.id =:id ");
		query1.setParameter("isAppLocked", mobApplCheck.getIsAppLocked());
		query1.setParameter("lockedBy", mobApplCheck.getLockedBy());
		query1.setParameter("modifiedBy", mobApplCheck.getModifiedBy());
		query1.setParameter("modifiedDate", mobApplCheck.getModifiedDate());
		query1.setParameter("id", mobApplCheck.getId());
		query1.executeUpdate();
	}
	
}
