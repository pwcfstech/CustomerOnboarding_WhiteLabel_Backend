package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AccountTypeJpaDAO;
import com.afrAsia.entities.masters.AccountType;

public class AccountTypeJpaDaoImpl extends BaseJpaDAOImpl<String, AccountType> implements AccountTypeJpaDAO {

	public List<AccountType> getAccountType() {
		String queryString = "from AccountType ";
		Query query = getEntityManager().createQuery(queryString);
		List<AccountType> listOfAccountType = query.getResultList();
		return listOfAccountType;
	}

}
