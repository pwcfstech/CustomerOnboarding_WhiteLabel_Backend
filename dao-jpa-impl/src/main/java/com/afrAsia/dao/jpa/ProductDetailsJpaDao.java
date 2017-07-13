package com.afrAsia.dao.jpa;

import com.afrAsia.dao.ProductDetailsDao;
import com.afrAsia.entities.jpa.ProductDetails;

public interface ProductDetailsJpaDao extends ProductDetailsDao, BaseJpaDAO<Long, ProductDetails>{
			
	//for get Product Details id 
	public ProductDetails getProductById(Long productID); 
}

