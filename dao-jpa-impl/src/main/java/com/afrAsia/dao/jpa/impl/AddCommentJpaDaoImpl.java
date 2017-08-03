package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AddCommentJpaDao;
import com.afrAsia.entities.transactions.MobComments;

public class AddCommentJpaDaoImpl extends BaseJpaDAOImpl<Long, MobComments> implements AddCommentJpaDao{

	public MobComments addComments(MobComments mobComments) {
		getEntityManager().persist(mobComments);
		getEntityManager().flush();
		return mobComments;
	}
	
	public List<String> getRmUserId(String userId){
		Query query = getEntityManager().createQuery("select ar.rmUserId from ApplicationReference ar "
				+ "where ar.rmUserId=:rmid");
		query.setParameter("rmid", userId);
		
		List<String> detailsByefault = query.getResultList();
		return detailsByefault; 
	}
	
	public List<Long> getAppId(Long appId){
		Query query = getEntityManager().createQuery("select ar.id from ApplicationReference ar "
				+ "where ar.id=:appid");
		query.setParameter("appid", appId);
		
		List<Long> detailsByefault = query.getResultList();
		return detailsByefault; 
	}
}
