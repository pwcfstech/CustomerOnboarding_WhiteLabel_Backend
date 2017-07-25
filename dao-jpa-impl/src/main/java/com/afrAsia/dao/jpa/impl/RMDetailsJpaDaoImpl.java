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
}
