package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.EmploymentJpaDAO;
import com.afrAsia.entities.masters.Employment;


public class EmploymentJpaDaoImpl extends BaseJpaDAOImpl<String, Employment>implements EmploymentJpaDAO {

	public List<Employment> getEmployment() {

		String queryString = " from Employment";
		Query query = getEntityManager().createQuery(queryString);
		return (List<Employment>) query.getResultList();
	}
}
