package com.afrAsia.dao.jpa;

import java.util.Collection;

import com.afrAsia.dao.EmploymentDao;
import com.afrAsia.entities.masters.Employment;

public interface EmploymentJpaDAO extends EmploymentDao {

	public Collection<Employment> getEmployment();
}
