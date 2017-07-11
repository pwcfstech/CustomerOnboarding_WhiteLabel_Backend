package com.afrAsia.dao;

import java.util.Collection;

import com.afrAsia.entities.jpa.Product;

public interface ProductDao {
	// for get Product List
	public Collection<Product> getProducts();
		
	//for get Product Details id 
	public Product getProductById(Long productID);
}

