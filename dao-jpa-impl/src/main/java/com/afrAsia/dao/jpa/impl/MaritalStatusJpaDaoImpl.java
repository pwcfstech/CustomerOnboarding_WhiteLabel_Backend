package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.MaritalStatusJpaDAO;
import com.afrAsia.entities.masters.MaritalStatus;


public class MaritalStatusJpaDaoImpl extends BaseJpaDAOImpl<String, MaritalStatus>implements MaritalStatusJpaDAO {

	public List<MaritalStatus> getMaritalStatus() {
		String queryString = " from MaritalStatus";
		Query query = getEntityManager().createQuery(queryString);
		return (List<MaritalStatus>) query.getResultList();
		
	}

}
