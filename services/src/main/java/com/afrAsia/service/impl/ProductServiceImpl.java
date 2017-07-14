package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.afrAsia.dao.jpa.CategoryJpaDAO;
import com.afrAsia.dao.jpa.ProductDetailsJpaDao;
import com.afrAsia.dao.jpa.ProductJpaDao;
import com.afrAsia.entities.jpa.Category;
import com.afrAsia.entities.jpa.Product;
import com.afrAsia.entities.jpa.ProductDetails;
import com.afrAsia.entities.response.CategoryResponse;
import com.afrAsia.entities.response.Data;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.ProductDetailsResponse;
import com.afrAsia.entities.response.ProductResponse;
import com.afrAsia.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	private ProductJpaDao productDao;
	private ProductDetailsJpaDao productDetailsDao;
	private CategoryJpaDAO categoryDao;

	public ProductJpaDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductJpaDao productDao) {
		this.productDao = productDao;
	}

	public ProductDetailsJpaDao getProductDetailsDao() {
		return productDetailsDao;
	}

	public void setProductDetailsDao(ProductDetailsJpaDao productDetailsDao) {
		this.productDetailsDao = productDetailsDao;
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
			Long id = product.getId();

			productResponse.setProductId(id);
			productResponse.setProductName(product.getProductName());
			productResponse.setProductDescription(product.getProductDescription());
			productResponse.setProductImageURL(product.getProductImageURL());

			productResponse.setAddnField1(product.getAddnField1());
			productResponse.setAddnField2(product.getAddnField2());
			productResponse.setAddnField3(product.getAddnField3());

			productResponse.setProductBrochureLink(product.getProductBrochureLink());
			productResponse.setProductDetailImageURL(product.getProductDetailImageURL());
			productResponse.setProductLongDesc(product.getProductLongDesc());

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
			categoryResponse.setCategoryDescription(category.getCategoryDescription());

			categoryResponse.setProducts(categoryVsProductsMap.get(category.getId() + ""));

			data.addCategory(categoryResponse);
		}

		response.setData(data);
		return response;

	}

	public GenericResponse getProductById(Long productID) {

		/*
		 * GenericRequest genericRequest = new GenericRequest();
		 * 
		 * Long productIDRequest = productID; com.afrAsia.entities.request.Data
		 * dataRequest = new com.afrAsia.entities.request.Data();
		 * dataRequest.setProductID(String.valueOf(productIDRequest));
		 * genericRequest.setData(dataRequest);
		 */

		GenericResponse response = new GenericResponse();
		Data dataResponse = new Data();

		List<ProductDetailsResponse> listProductDetailsResponse = new ArrayList<ProductDetailsResponse>();
		//ProductDetailsResponse productDetailsResponse=new ProductDetailsResponse();
		List<ProductDetails> productDetails = productDetailsDao.getProductById(productID);
		
		for (ProductDetails productdetail : productDetails) {
			System.out.println("#####	inside service "+productdetail.toString());

			ProductDetailsResponse productdetailsResponse = new ProductDetailsResponse();

			productdetailsResponse.setFeature(productdetail.getFeature());
			productdetailsResponse.setImageURL(productdetail.getImageURL());
			productdetailsResponse.setInfoLink(productdetail.getInfoLink());
			productdetailsResponse.setLongDescription(productdetail.getLongDescription());
			System.out.println("ONLY RESPONSE : "+productdetailsResponse.toString());
			listProductDetailsResponse.add(productdetailsResponse);
			System.out.println("#####inside for "+listProductDetailsResponse);
		}
		
		System.out.println("#####final list :"+listProductDetailsResponse.toString());
		
		
		dataResponse.setProductdetails(listProductDetailsResponse);
		response.setData(dataResponse);
		return response;
	}

}
