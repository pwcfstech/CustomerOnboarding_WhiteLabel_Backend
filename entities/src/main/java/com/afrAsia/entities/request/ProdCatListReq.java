package com.afrAsia.entities.request;

import java.io.Serializable;

public class ProdCatListReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader msgHeader;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	@Override
	public String toString() {
		return "ProdCatListReq [msgHeader=" + msgHeader + "]";
	}

}
