package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class CategoryResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryName;

	private String categoryDescription;

	private Set<ProductResponse> products = new HashSet<ProductResponse>();

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Set<ProductResponse> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductResponse> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryDescription=" + categoryDescription + ", products="
				+ products + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryResponse other = (CategoryResponse) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		return true;
	}

}
