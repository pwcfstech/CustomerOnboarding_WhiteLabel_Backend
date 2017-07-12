package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.CountryJpaDAO;
import com.afrAsia.entities.masters.Country;

public class CountryJpaDaoImpl extends BaseJpaDAOImpl<String, Country>implements CountryJpaDAO {
	public Collection<Country> getCountry() {
		// public List<Country> getCountryList() {
		String queryString = " from Country";
		Query query = getEntityManager().createQuery(queryString);
		return (List<Country>) query.getResultList();
		// }
	}

}
