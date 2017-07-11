package com.afrAsia.dao.jpa.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.afrAsia.dao.jpa.CategoryJpaDAO;
import com.afrAsia.entities.jpa.Category;

public class CategoryJpaDaoImpl extends BaseJpaDAOImpl<String, Category>implements CategoryJpaDAO {

	public List<Category> getCategory() 
	{ 
		Collection<Category> categoryCollection = findAll();
		
		if (categoryCollection == null)
		{
			return new ArrayList<Category>();
		}
		else
		{
			return new ArrayList<Category>(categoryCollection);
		}
	}

}
