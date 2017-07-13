package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_PROD_MASTER")
@EntityListeners(value = { EntityListener.class })
public class Product extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name = "IMAGE_URL")
	private String productImageURL;
	@Column(name = "DETAIL_IMAGE_URL")
	private String productDetailImageURL;
	@Column(name = "PRODUCT_LONG_DESCRIPTION")
	private String productLongDesc;
	@Column(name = "BROCHURE_LINK")
	private String productBrochureLink;
	@Column(name = "CATEGORY_ID")
	private String categoryID;
	@Column(name = "ADDN_FIELD1")
	private String addnField1;
	@Column(name = "ADDN_FIELD2")
	private String addnField2;
	@Column(name = "ADDN_FIELD3")
	private String addnField3;

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

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
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
		return "Product [productName=" + productName + ", productDescription=" + productDescription
				+ ", productImageURL=" + productImageURL + ", productDetailImageURL=" + productDetailImageURL
				+ ", productLongDesc=" + productLongDesc + ", productBrochureLink=" + productBrochureLink
				+ ", categoryID=" + categoryID + ", addnField1=" + addnField1 + ", addnField2=" + addnField2
				+ ", addnField3=" + addnField3 + "]";
	}

}