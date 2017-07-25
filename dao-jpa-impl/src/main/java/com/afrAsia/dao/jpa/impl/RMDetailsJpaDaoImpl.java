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

	public RMDetails getRMDetailById(String rmId) 
	{
		if (rmId == null || rmId.trim().isEmpty())
		{
			return null;
		}
		return findById(rmId);
	}

	public void saveRmDetails(RMDetails obj) 
	{
		if (obj != null)
		{
			persist(obj);
		}
	}
}
