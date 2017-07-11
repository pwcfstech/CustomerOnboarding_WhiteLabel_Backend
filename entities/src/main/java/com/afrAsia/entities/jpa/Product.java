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
	@Column(name = "SHORT_DESCRIPTION")
	private String shortDescription;
	@Column(name = "LONG_DESCRIPTION")
	private String longDescription;
	@Column(name = "INFO_LINK")
	private String infoLink;
	@Column(name = "CATEGORY_ID")
	private String categoryID;

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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getInfoLink() {
		return infoLink;
	}

	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

}
