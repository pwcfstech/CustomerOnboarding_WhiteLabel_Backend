package com.afrAsia.entities.request;

import java.io.Serializable;

public class MobCommentsRequest implements Serializable {

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

	@Override
	public String toString() {
		return "MobCommentsRequest [msgHeader=" + msgHeader + ", data=" + data + "]";
	}

}
