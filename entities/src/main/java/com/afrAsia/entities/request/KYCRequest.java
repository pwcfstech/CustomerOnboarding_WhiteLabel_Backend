package com.afrAsia.entities.request;

/**
 * KYC request POJO
 * 
 * @author mds012
 *
 */
public class KYCRequest {
	private MessageHeader msgHeader;
	private KYCDataRequest data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public KYCDataRequest getData() {
		return data;
	}

	public void setData(KYCDataRequest data) {
		this.data = data;
	}

}
