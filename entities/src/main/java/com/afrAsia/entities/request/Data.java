package com.afrAsia.entities.request;

import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String productID;

	private Long appId;

	private String comment;

	private String userId;

	private String userCat;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCat() {
		return userCat;
	}

	public void setUserCat(String userCat) {
		this.userCat = userCat;
	}

	@Override
	public String toString() {
		return "Data [productID=" + productID + ", appId=" + appId + ", comment=" + comment + ", userId=" + userId
				+ ", userCat=" + userCat + "]";
	}

}
