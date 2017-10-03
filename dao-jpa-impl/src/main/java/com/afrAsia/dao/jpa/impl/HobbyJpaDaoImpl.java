package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.HobbyJpaDAO;
import com.afrAsia.entities.masters.Bank;
import com.afrAsia.entities.masters.Hobby;

public class HobbyJpaDaoImpl extends BaseJpaDAOImpl<String, Bank>implements HobbyJpaDAO {

	public Collection<Hobby> getHobby() {
		// public List<Bank> getBankList() {
		String queryString = "from Hobby h order by h.hobbyCode ASC";
		Query query = getEntityManager().createQuery(queryString);
		return (List<Hobby>) query.getResultList();
		// }
	}
}
