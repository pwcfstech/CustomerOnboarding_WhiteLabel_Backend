package com.afrAsia.dao.jpa;

import java.util.Collection;

import com.afrAsia.dao.ProductDao;
import com.afrAsia.entities.jpa.Product;

public interface ProductJpaDao extends ProductDao, BaseJpaDAO<Long, Product> {

	public Collection<Product> getProducts();
	
}
