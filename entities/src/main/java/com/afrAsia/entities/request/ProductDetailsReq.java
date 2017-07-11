package com.afrAsia.entities.request;

import java.io.Serializable;

public class ProductDetailsReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader msgHeader;

	private Data data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public class Data {

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

}
