package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.entities.masters.RMDetails;

public interface RMDetailsJpaDAO extends RMDetailsDao {

	public List<RMDetails> getRMDetails();
}
