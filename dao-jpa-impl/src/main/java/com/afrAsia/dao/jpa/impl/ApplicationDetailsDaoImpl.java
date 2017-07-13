package com.afrAsia.dao.jpa.impl;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.entities.jpa.RmApplication;


public class ApplicationDetailsDaoImpl extends BaseJpaDAOImpl<Integer, RmApplication> implements ApplicationDetailsJpaDAO {

	public RmApplication getApplicationDetails(Integer appRefId){
		String queryString = "SELECT s FROM RmApplication s where s.applicationId = :appRefId";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("applicationId", appRefId);
		return (RmApplication) query.getSingleResult();
	}
}
