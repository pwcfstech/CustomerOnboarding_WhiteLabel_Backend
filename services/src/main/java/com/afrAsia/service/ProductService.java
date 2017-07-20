package com.afrAsia.service;

import com.afrAsia.entities.response.GenericResponse;

public interface ProductService {
	
		// to get Product List
		public GenericResponse getProducts();
			
		//to get Product Details id 
		public GenericResponse getProductById(Long productID);
		
}
