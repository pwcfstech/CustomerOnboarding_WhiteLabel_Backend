package com.afrAsia.dao.jpa.impl;

import java.util.Collection;

import com.afrAsia.dao.jpa.ProductJpaDao;
import com.afrAsia.entities.jpa.Product;

public class ProductJpaDaoImpl extends BaseJpaDAOImpl<Long, Product> implements ProductJpaDao {

	public Collection<Product> getProducts() 
	{
		return findAll();
	}

}
