package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.MaritalStatusDao;
import com.afrAsia.entities.masters.MaritalStatus;

public interface MaritalStatusJpaDAO extends MaritalStatusDao {

	public List<MaritalStatus> getMaritalStatus();

}
