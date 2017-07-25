package com.afrAsia.entities.request;

import java.io.Serializable;

import com.afrAsia.entities.request.MessageHeader;

public class GenericRequest2<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader msgHeader;

	private T data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericRequest [msgHeader=" + msgHeader + ", data=" + data + "]";
	}
	
	

}
