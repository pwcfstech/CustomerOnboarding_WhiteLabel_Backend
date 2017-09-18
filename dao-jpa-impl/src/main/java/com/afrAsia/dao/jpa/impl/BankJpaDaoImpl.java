package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.BankJpaDAO;
import com.afrAsia.entities.masters.Bank;

public class BankJpaDaoImpl extends BaseJpaDAOImpl<String, Bank>implements BankJpaDAO {

	public Collection<Bank> getBank() {
		// public List<Bank> getBankList() {
		String queryString = "from Bank b order by b.bankCode ASC";
		Query query = getEntityManager().createQuery(queryString);
		return (List<Bank>) query.getResultList();
		// }
	}
}
