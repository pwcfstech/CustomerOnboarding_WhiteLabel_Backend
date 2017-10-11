package com.afrAsia.dao.jpa.impl;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.afrAsia.dao.jpa.LockApplicationJpaDao;
import com.afrAsia.entities.transactions.MobAppRefRecordId;
import com.afrAsia.entities.transactions.MobApplCheck;

public class LockApplicationJpaDaoImpl extends BaseJpaDAOImpl<String, MobAppRefRecordId>implements LockApplicationJpaDao {

	public void storeApplCheckStatus(MobApplCheck mobApplCheck) {
		getEntityManager().persist(mobApplCheck);
		getEntityManager().flush();
	}
	
	public MobApplCheck getApplCheckStatus(Long id, Long recordId) throws NoResultException{

		Query query = getEntityManager()
				.createQuery("FROM MobApplCheck mac WHERE mac.id=:id and mac.recordId=:recordId");
		query.setParameter("id", id);
		query.setParameter("recordId", recordId);
		return (MobApplCheck) query.getSingleResult();
	}
	
	public void updateApplCheckStatus(MobApplCheck mobApplCheck) {
		getEntityManager().merge(mobApplCheck);
		getEntityManager().flush();
	}
	
}
