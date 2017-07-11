package com.afrAsia.service;

import com.afrAsia.entities.response.GenericResponse;

public interface ProductService {
	
		// for get Product List
		public GenericResponse getProducts();
			
		//for get Product Details id 
		public GenericResponse getProductById(Long productID);

}
