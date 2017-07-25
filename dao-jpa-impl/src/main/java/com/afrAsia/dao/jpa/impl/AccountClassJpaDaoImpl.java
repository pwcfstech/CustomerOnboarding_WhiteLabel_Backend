package com.afrAsia.dao.jpa.impl;


import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AccountClassJpaDAO;

import com.afrAsia.entities.masters.AccountClass;



public class AccountClassJpaDaoImpl extends BaseJpaDAOImpl<String, AccountClass> implements AccountClassJpaDAO{



	public List<AccountClass> getAccountClass() {
		String queryString = " from AccountClass";
		Query query = getEntityManager().createQuery(queryString);
		return (List<AccountClass>) query.getResultList();
	}

}
