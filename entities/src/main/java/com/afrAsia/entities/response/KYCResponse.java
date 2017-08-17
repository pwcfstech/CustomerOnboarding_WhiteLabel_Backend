package com.afrAsia.entities.response;

public class KYCResponse {
	private MessageHeader msgHeader;
	private KYCDataResponse data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public KYCDataResponse getData() {
		return data;
	}

	public void setData(KYCDataResponse data) {
		this.data = data;
	}

}
