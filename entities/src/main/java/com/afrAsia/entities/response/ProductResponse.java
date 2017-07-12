package com.afrAsia.entities.response;

import java.io.Serializable;

public class ProductResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long productId;

	private String productName;

	private String productDescription;

	private String productImageURL;

	private String productDetailImageURL;

	private String productLongDesc;

	private String productBrochureLink;

	private String addnField1;

	private String addnField2;

	private String addnField3;

	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

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

	public String getProductDetailImageURL() {
		return productDetailImageURL;
	}

	public void setProductDetailImageURL(String productDetailImageURL) {
		this.productDetailImageURL = productDetailImageURL;
	}

	public String getProductLongDesc() {
		return productLongDesc;
	}

	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}

	public String getProductBrochureLink() {
		return productBrochureLink;
	}

	public void setProductBrochureLink(String productBrochureLink) {
		this.productBrochureLink = productBrochureLink;
	}

	public String getAddnField1() {
		return addnField1;
	}

	public void setAddnField1(String addnField1) {
		this.addnField1 = addnField1;
	}

	public String getAddnField2() {
		return addnField2;
	}

	public void setAddnField2(String addnField2) {
		this.addnField2 = addnField2;
	}

	public String getAddnField3() {
		return addnField3;
	}

	public void setAddnField3(String addnField3) {
		this.addnField3 = addnField3;
	}

	@Override
	public String toString() {
		return "ProductResponse [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productImageURL=" + productImageURL + ", productDetailImageURL="
				+ productDetailImageURL + ", productLongDesc=" + productLongDesc + ", productBrochureLink="
				+ productBrochureLink + ", addnField1=" + addnField1 + ", addnField2=" + addnField2 + ", addnField3="
				+ addnField3 + "]";
	}

}
