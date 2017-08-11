package com.afrAsia.dao;

import java.util.List;

import com.afrAsia.entities.jpa.ProductDetails;

public interface ProductDetailsDao {
			
	//for get Product Details id 
	public List<Object> getProductById(Long productID);
}

