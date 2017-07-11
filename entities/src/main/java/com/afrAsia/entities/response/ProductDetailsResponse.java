package com.afrAsia.entities.response;

public class ProductDetailsResponse {
	
	private String shortDescription;
	
	private String longDescription;
	
	private String imageURL;
	
	private String InfoLink;

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
	
}
