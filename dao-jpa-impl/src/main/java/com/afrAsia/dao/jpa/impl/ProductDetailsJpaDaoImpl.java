package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ProductDetailsJpaDao;
import com.afrAsia.entities.jpa.ProductDetails;
import com.afrAsia.entities.masters.UIDType;

public class ProductDetailsJpaDaoImpl extends BaseJpaDAOImpl<Long, ProductDetails> implements ProductDetailsJpaDao{
			
	//for get Product Details id 
	public List<ProductDetails> getProductById(Long productID) {
		/*String queryString = "select * from MOB_PROD_DETAILS where ID="+productID;
		SQLQuery query = (SQLQuery) getEntityManager().createQuery(queryString);

		List<ProductDetails> listOfEntries = query.addEntity(ProductDetails.class).list();*/
		String queryString = "FROM ProductDetails pd WHERE pd.id=:pid";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("pid", productID);
		List<ProductDetails> plist= query.getResultList();
		System.out.println("##### inside impl "+plist.toString());
		return plist;
	}
}

