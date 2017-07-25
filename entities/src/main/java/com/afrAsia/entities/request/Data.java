package com.afrAsia.entities.request;

import java.io.Serializable;

public class Data implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String productID;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "Data [productID=" + productID + "]";
	}

	
}
