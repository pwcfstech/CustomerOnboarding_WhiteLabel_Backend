package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.UIDTypeDao;
import com.afrAsia.entities.masters.UIDType;

public interface UIDTypeJpaDAO extends UIDTypeDao{

	public List<UIDType> getUIDType();

}
