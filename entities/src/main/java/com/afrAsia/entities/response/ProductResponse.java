package com.afrAsia.entities.response;

import java.io.Serializable;

public class ProductResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String productName;
	
	private String productDescription;
	
	private String productImageURL;
	
	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImageURL() {
		return productImageURL;
	}

	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productDescription=" + productDescription
				+ ", productImageURL=" + productImageURL + "]";
	}

}
