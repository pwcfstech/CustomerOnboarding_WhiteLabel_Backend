package com.afrAsia.dao.jpa.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

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
	
	public Collection<Category> getCategories(){
		
		String queryString ="FROM Category ca "
				+ "WHERE ca.id IN (SELECT pd.id FROM Product pd )";
				
		Query query1 = getEntityManager().createQuery(queryString);

		List<Category> listOfNames = query1.getResultList();
		
		System.out.println("####### list of categories ::: " + listOfNames);

		return listOfNames;
	}

}
