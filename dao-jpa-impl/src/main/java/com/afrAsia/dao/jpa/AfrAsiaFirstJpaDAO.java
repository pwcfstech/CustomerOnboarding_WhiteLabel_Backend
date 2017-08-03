package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.AfrAsiaFirstDao;
import com.afrAsia.entities.masters.AfrAsiaFirst;

public interface AfrAsiaFirstJpaDAO extends AfrAsiaFirstDao{

	public List<AfrAsiaFirst> getAfrAsiaFirst();

}
