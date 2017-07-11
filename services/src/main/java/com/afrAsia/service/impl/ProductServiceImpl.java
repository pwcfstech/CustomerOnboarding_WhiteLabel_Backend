package com.afrAsia.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.afrAsia.dao.jpa.CategoryJpaDAO;
import com.afrAsia.dao.jpa.ProductJpaDao;
import com.afrAsia.entities.jpa.Category;
import com.afrAsia.entities.jpa.Product;
import com.afrAsia.entities.response.CategoryResponse;
import com.afrAsia.entities.response.Data;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.ProductDetailsResponse;
import com.afrAsia.entities.response.ProductResponse;
import com.afrAsia.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	private ProductJpaDao productDao;
	private CategoryJpaDAO categoryDao;

	public ProductJpaDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductJpaDao productDao) {
		this.productDao = productDao;
	}

	public CategoryJpaDAO getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(CategoryJpaDAO categoryDao) {
		this.categoryDao = categoryDao;
	}

	public GenericResponse getProducts() {

		GenericResponse response = new GenericResponse();
		Data data = new Data();

		// fetch from DB
		List<Product> listOfProducts = (List<Product>) productDao.getProducts();
		List<Category> categoryList = categoryDao.getCategory();
		Map<String, Set<ProductResponse>> categoryVsProductsMap = new HashMap<String, Set<ProductResponse>>();

		for (Product product : listOfProducts) {

			String categoryID = product.getCategoryID();
			ProductResponse productResponse = new ProductResponse();
			productResponse.setProductName(product.getProductName());
			logger.debug("ProductName-----" + product.getProductName());
			productResponse.setProductDescription(product.getProductDescription());
			logger.debug("ProductDescription-----" + product.getProductDescription());
			productResponse.setProductImageURL(product.getProductImageURL());
			logger.debug("ProductImageURL-----" + product.getProductImageURL());

			if (categoryVsProductsMap.containsKey(categoryID)) {
				Set<ProductResponse> list = categoryVsProductsMap.get(categoryID);
				list.add(productResponse);

				categoryVsProductsMap.put(categoryID, list);
			} else {
				Set<ProductResponse> list = new HashSet<ProductResponse>();
				list.add(productResponse);
				categoryVsProductsMap.put(categoryID, list);
			}
		}

		// populate data from DB

		for (Category category : categoryList) {
			CategoryResponse categoryResponse = new CategoryResponse();
			categoryResponse.setCategoryName(category.getCategoryName());
			categoryResponse.setCategoryDescription(category.getCustCatDesc());

			categoryResponse.setProducts(categoryVsProductsMap.get(category.getId() + ""));
			data.addCategory(categoryResponse);

		}

		response.setData(data);
		return response;

	}

	public GenericResponse getProductById(Long productID) {

		/*GenericRequest genericRequest = new GenericRequest();

		Long productIDRequest = productID;
		com.afrAsia.entities.request.Data dataRequest = new com.afrAsia.entities.request.Data();
		dataRequest.setProductID(String.valueOf(productIDRequest));
		genericRequest.setData(dataRequest);*/

		GenericResponse response = new GenericResponse();
		Data dataResponse = new Data();
		ProductDetailsResponse productDetails = new ProductDetailsResponse();
		Product product = productDao.getProductById(productID);
		productDetails.setImageURL(product.getProductImageURL());
		productDetails.setInfoLink(product.getInfoLink());
		productDetails.setLongDescription(product.getLongDescription());
		productDetails.setShortDescription(product.getShortDescription());

		dataResponse.setProductdetails(productDetails);
		response.setData(dataResponse);
		return response;
	}

}
