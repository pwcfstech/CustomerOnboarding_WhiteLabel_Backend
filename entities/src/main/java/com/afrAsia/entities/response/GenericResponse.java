package com.afrAsia.entities.response;

import java.io.Serializable;

import com.afrAsia.entities.request.MessageHeader;

public class GenericResponse implements Serializable {

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

}
