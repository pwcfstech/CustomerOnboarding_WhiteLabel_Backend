package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_PROD_DETAILS")
@EntityListeners(value = { EntityListener.class })
public class ProductDetails extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "FEATURE")
	private String feature;
	@Column(name = "INFO_LINK")
	private String infoLink;
	@Column(name = "IMAGE_URL")
	private String imageURL;
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getInfoLink() {
		return infoLink;
	}
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	@Override
	public String toString() {
		return "ProductDetails [feature=" + feature + ", infoLink=" + infoLink + ", imageURL=" + imageURL + "]";
	}
}