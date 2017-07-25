package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author sameerd025
 *
 */
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<CategoryResponse> categories;

	private Set<ProductResponse> product;

	private List<ProductDetailsResponse> productDetails;

	public Set<CategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryResponse> categories) {
		this.categories = categories;
	}

	public Set<ProductResponse> getProduct() {
		return product;
	}

	public void setProduct(Set<ProductResponse> product) {
		this.product = product;
	}

	public List<ProductDetailsResponse> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetailsResponse> productDetails) {
		this.productDetails = productDetails;
	}

	@Override
	public String toString() {
		return "Data [categories=" + categories + ", product=" + product + ", productDetails=" + productDetails + "]";
	}

	public void addCategory(CategoryResponse categoryResponse) {
		categories = new HashSet<CategoryResponse>();
		categories.add(categoryResponse);
	}

}