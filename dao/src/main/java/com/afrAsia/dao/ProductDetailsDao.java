package com.afrAsia.dao;

import com.afrAsia.entities.jpa.ProductDetails;

public interface ProductDetailsDao {
			
	//for get Product Details id 
	public ProductDetails getProductById(Long productID);
}

