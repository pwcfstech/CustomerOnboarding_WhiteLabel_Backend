package com.afrAsia.dao.jpa.impl;

import com.afrAsia.dao.jpa.ProductDetailsJpaDao;
import com.afrAsia.entities.jpa.ProductDetails;

public class ProductDetailsJpaDaoImpl extends BaseJpaDAOImpl<Long, ProductDetails> implements ProductDetailsJpaDao{
			
	//for get Product Details id 
	public ProductDetails getProductById(Long productID) {
		return findById(productID);
	}
}

