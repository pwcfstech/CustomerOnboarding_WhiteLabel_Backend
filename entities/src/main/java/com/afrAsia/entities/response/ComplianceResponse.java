package com.afrAsia.entities.response;

import java.io.Serializable;

public class ComplianceResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private ComplianceApps data;																			

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public ComplianceApps getData() {
		return data;
	}

	public void setData(ComplianceApps data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ComplianceResponse [messageHeader=" + messageHeader + ", data=" + data + "]";
	}

}
