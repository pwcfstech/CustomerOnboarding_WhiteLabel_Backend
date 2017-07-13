package com.afrAsia.dao.jpa.impl;



import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.CategoryMasterJpaDAO;
import com.afrAsia.entities.masters.CategoryMaster;



public class CategoryMasterJpaDaoImpl extends BaseJpaDAOImpl<String, CategoryMaster>implements CategoryMasterJpaDAO {

	public List<CategoryMaster> getCategoryList() {
		String queryString = " from CategoryMaster";
		Query query = getEntityManager().createQuery(queryString);
		return (List<CategoryMaster>) query.getResultList();

	}
}
