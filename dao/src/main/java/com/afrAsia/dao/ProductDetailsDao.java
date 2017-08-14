package com.afrAsia.dao;

import java.util.List;

public interface ProductDetailsDao {
			
	public List<Long> getId(Long productID);
	
	//for get Product Details id 
	public List<Object> getProductById(Long productID);
}

