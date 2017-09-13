package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

public class ComplianceResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private List<ComplianceApps> data;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public List<ComplianceApps> getData() {
		return data;
	}

	public void setData(List<ComplianceApps> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ComplianceResponse [messageHeader=" + messageHeader + ", data=" + data + "]";
	}

}
