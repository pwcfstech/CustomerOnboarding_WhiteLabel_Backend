package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

public class ComplianceResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private List<ComplianceApps> apps;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public List<ComplianceApps> getApps() {
		return apps;
	}

	public void setApps(List<ComplianceApps> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "ComplianceResponse [messageHeader=" + messageHeader + ", apps=" + apps + "]";
	}

}
