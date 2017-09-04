package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ProductJpaDao;
import com.afrAsia.entities.jpa.Product;

public class ProductJpaDaoImpl extends BaseJpaDAOImpl<Long, Product> implements ProductJpaDao {

	public Collection<Product> getProducts() 
	{
		String queryString ="FROM Product pd "
				+ "WHERE pd.categoryID IN (SELECT pd.id FROM Category pd )";
				
		Query query1 = getEntityManager().createQuery(queryString);

		List<Product> listOfNames = query1.getResultList();
		
		return listOfNames;
	}
	
}
