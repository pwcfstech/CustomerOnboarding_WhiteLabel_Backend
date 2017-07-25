package com.afrAsia.entities.response;

import java.io.Serializable;

public class ProductDetailsResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String feature;

	private String longDescription;

	private String imageURL;

	private String InfoLink;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getInfoLink() {
		return InfoLink;
	}

	public void setInfoLink(String infoLink) {
		InfoLink = infoLink;
	}

	@Override
	public String toString() {
		return "ProductDetailsResponse [feature=" + feature + ", longDescription=" + longDescription + ", imageURL="
				+ imageURL + ", InfoLink=" + InfoLink + "]";
	}

}
