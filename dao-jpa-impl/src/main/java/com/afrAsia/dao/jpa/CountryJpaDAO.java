package com.afrAsia.dao.jpa;

import java.util.Collection;

import com.afrAsia.dao.CountryDao;
import com.afrAsia.entities.masters.Country;

public interface CountryJpaDAO extends CountryDao {

	public Collection<Country> getCountry();

}
