package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ProductDetailsJpaDao;
import com.afrAsia.entities.jpa.ProductDetails;

public class ProductDetailsJpaDaoImpl extends BaseJpaDAOImpl<Long, ProductDetails> implements ProductDetailsJpaDao{
	
	public List<Long> getId(Long id){
		Query query = getEntityManager().createQuery("select pd.id from ProductDetails pd "
				+ "where pd.id=:productId");
		query.setParameter("productId", id);
		
		List<Long> detailsByefault = query.getResultList();
		return detailsByefault; 
	}
	
	//for get Product Details id 
	public List<Object> getProductById(Long productID) {

		String queryString = "select pd.id,pd.feature,pd.infoLink,pd.imageURL FROM ProductDetails pd WHERE pd.id=:pid";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("pid", productID);
		List<Object> plist= query.getResultList();

		return plist;
	}
}

