package com.afrAsia.dao;

import java.util.Collection;

import com.afrAsia.entities.jpa.Category;
import com.afrAsia.entities.jpa.Product;

public interface ProductDao {
	// for get Product List
	public Collection<Product> getProducts();
	
	//public Collection<Category> getCategories();
		
}

