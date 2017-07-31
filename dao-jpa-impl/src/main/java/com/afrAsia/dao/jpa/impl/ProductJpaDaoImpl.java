package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ProductJpaDao;
import com.afrAsia.entities.jpa.Product;

public class ProductJpaDaoImpl extends BaseJpaDAOImpl<Long, Product> implements ProductJpaDao {

	public Collection<Product> getProducts() 
	{
		//return findAll();
		
		String queryString ="FROM Product pd "
				+ "WHERE pd.categoryID IN (SELECT pd.id FROM Category pd )";
				//+ "WHERE ad.indvApplicantRefNo IN (SELECT ar.id FROM ApplicationReference ar WHERE ar.appStatus = :as )) ";
				
		Query query1 = getEntityManager().createQuery(queryString);

		//query1.setParameter("as", "Require Attention");
		
		List<Product> listOfNames = query1.getResultList();
		
		System.out.println("####### list of Products ::: " + listOfNames);

		return listOfNames;
	}
	
}
