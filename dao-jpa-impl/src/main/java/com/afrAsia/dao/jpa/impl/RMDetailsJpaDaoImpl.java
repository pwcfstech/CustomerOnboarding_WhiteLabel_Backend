package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.RMDetailsJpaDAO;
import com.afrAsia.entities.masters.RMDetails;


public class RMDetailsJpaDaoImpl extends BaseJpaDAOImpl<String, RMDetails>implements RMDetailsJpaDAO {

	public List<RMDetails> getRMDetails() {

		String queryString = " from RMDetails";
		Query query = getEntityManager().createQuery(queryString);
		return (List<RMDetails>) query.getResultList();
	}

	public RMDetails getRMDetailById(String rmId, String userGroup) 
	{
		if (rmId == null || rmId.trim().isEmpty())
		{
			return null;
		}
		String query = "FROM RMDetails rm WHERE rm.id = :rmId";
		Query q = getEntityManager().createQuery(query);
		q.setParameter("rmId", rmId);
		
		return (RMDetails) q.getSingleResult();
		
	}
	
	public RMDetails getRMDetailByRMId(String rmId) 
	{
		if (rmId == null || rmId.trim().isEmpty())
		{
			return null;
		}
		String query = "FROM RMDetails rm WHERE rm.id = :rmId";
		Query q = getEntityManager().createQuery(query);
		q.setParameter("rmId", rmId);
		
		return (RMDetails) q.getSingleResult();
		
	}

	public void saveRmDetails(RMDetails obj) 
	{
		if (obj != null)
		{
			persist(obj);
			flush();
		}
	}
	
	public List<RMDetails> getRMDetailListByRMId(String rmId) 
	{
		if (rmId == null || rmId.trim().isEmpty())
		{
			return null;
		}
		String query = "FROM RMDetails rm WHERE rm.id = :rmId";
		Query q = getEntityManager().createQuery(query);
		q.setParameter("rmId", rmId);
		
		return q.getResultList();
		
	}
	
	public void updateRmDetails(RMDetails rmDetails) {
		//System.out.println("Value for RM Id table : " + mobRmAppRefId.toString());
		
		Query query = getEntityManager()
				.createQuery("update RMDetails rd set rd.rmName=:rmName,rd.rmEmailId=:rmEmailId,rd.rmMobNo=:rmMobNo,rd.flex_Id=:flex_Id " + "where rd.id =:id ");
		query.setParameter("rmName", rmDetails.getRmName());
		query.setParameter("rmEmailId", rmDetails.getRmEmailId());
		query.setParameter("rmMobNo", rmDetails.getRmMobNo());
		query.setParameter("flex_Id", rmDetails.getFlex_Id());
		query.setParameter("id", rmDetails.getId());
		query.executeUpdate();
	}
}
