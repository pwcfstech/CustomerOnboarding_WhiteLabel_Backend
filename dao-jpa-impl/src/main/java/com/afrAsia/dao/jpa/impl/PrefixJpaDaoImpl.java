package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.PrefixJpaDAO;
import com.afrAsia.entities.masters.Prefix;


public class PrefixJpaDaoImpl extends BaseJpaDAOImpl<String, Prefix >implements PrefixJpaDAO {

	public List<Prefix> getPrefix() {

		String queryString = " from Prefix";
		Query query = getEntityManager().createQuery(queryString);
		return (List<Prefix>) query.getResultList();
	}


}
