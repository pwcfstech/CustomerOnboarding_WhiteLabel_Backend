package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author sameerd025
 *
 */
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<CategoryResponse> categories;

	private ProductDetailsResponse productdetails;

	public Set<CategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryResponse> categories) {
		this.categories = categories;
	}

	public void addCategory(CategoryResponse categoryResponse) {
		if (categories == null)
		{
			categories = new HashSet<CategoryResponse>();
		}
		categories.add(categoryResponse);
	}

	public ProductDetailsResponse getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(ProductDetailsResponse productdetails) {
		this.productdetails = productdetails;
	}

	@Override
	public String toString() {
		return "Data [categories=" + categories + "]";
	}

}