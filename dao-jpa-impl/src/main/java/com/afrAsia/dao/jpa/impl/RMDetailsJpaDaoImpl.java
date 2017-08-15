package com.afrAsia.dao.jpa.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		String query = "FROM RMDetails rm WHERE rm.id = :rmId AND lower(rm.userGroup) = lower(:userGroup)";
		Query q = getEntityManager().createQuery(query);
		q.setParameter("rmId", rmId);
		q.setParameter("userGroup", userGroup);
		
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
}
