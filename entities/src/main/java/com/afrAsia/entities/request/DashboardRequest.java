package com.afrAsia.entities.request;

import java.io.Serializable;

public class DashboardRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private String rmId;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	@Override
	public String toString() {
		return "DashboardResponse [messageHeader=" + messageHeader + ", rmId=" + rmId + "]";
	}

}
