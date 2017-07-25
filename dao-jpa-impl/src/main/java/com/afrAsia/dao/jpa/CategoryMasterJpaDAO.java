package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.CategoryMasterDao;
import com.afrAsia.entities.masters.CategoryMaster;

public interface CategoryMasterJpaDAO extends CategoryMasterDao {

	public List<CategoryMaster> getCategoryList();
}
