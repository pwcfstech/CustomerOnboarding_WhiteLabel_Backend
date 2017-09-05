package com.afrAsia.dao.jpa.impl;


import java.util.List;


import javax.persistence.Query;

import com.afrAsia.dao.jpa.RMSessionDetailJpaDAO;
import com.afrAsia.entities.jpa.MobRmSessionDetail;
import java.util.Date;
	


public class RMSessionDetailJpaDaoImpl extends BaseJpaDAOImpl<Long, MobRmSessionDetail> implements RMSessionDetailJpaDAO {

	
	public MobRmSessionDetail setLoginTime(MobRmSessionDetail mobRmSessionDetail){
		MobRmSessionDetail mobSessionData = getLastLoginTime(mobRmSessionDetail.getRmId());
		
		if (mobRmSessionDetail != null)
		{
			getEntityManager().persist(mobRmSessionDetail);
			getEntityManager().flush();
		}
		return mobSessionData;
	}
	public void setLogoutTime(String rmId){
		MobRmSessionDetail mobSessionData = getLastLoginTime(rmId);
		String hql = "UPDATE MobRmSessionDetail set modifiedDate = :modifiedDate" + 
				"WHERE rmId = :rmId AND createdDate = :createdDate;";
		Query query = getEntityManager().createQuery(hql);
		query.setParameter("modifiedDate", new Date());
		query.setParameter("createdDate", mobSessionData.getCreatedDate());
		query.setParameter("rmId", rmId);
		int result = query.executeUpdate();
	}
	
	public MobRmSessionDetail getLastLoginTime(String rmId){
		
		String queryString = "FROM MobRmSessionDetail rm where rm.rmId = :rmId order by rm.createdDate desc";
		
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("rmId", rmId);
		
		List<MobRmSessionDetail> sessionDetail = query.getResultList();
		
		if(sessionDetail.size() == 0){
			return null;
		}
		else {
			return sessionDetail.get(0);
		}
	}
}

