package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.CategoryDao;
import com.afrAsia.entities.jpa.Category;

public interface CategoryJpaDAO extends CategoryDao, BaseJpaDAO<String, Category> {

	public List<Category> getCategory();
}
