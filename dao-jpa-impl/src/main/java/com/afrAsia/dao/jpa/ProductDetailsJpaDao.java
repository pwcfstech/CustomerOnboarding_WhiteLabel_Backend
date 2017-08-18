package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.ProductDetailsDao;
import com.afrAsia.entities.jpa.ProductDetails;

public interface ProductDetailsJpaDao extends ProductDetailsDao, BaseJpaDAO<Long, ProductDetails>{
			
	//for get Product Details id 
	public List<Object> getProductById(Long productID);

	public List<Long> getId(Long productID); 
}

