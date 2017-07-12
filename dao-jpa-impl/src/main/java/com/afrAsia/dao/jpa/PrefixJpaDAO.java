package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.PrefixDao;
import com.afrAsia.entities.masters.Prefix;

public interface PrefixJpaDAO extends PrefixDao {

	public List<Prefix> getPrefix();

}
