package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;


public class RmApplicationAppResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private List<Apps> apps;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public List<Apps> getApps() {
		return apps;
	}

	public void setApps(List<Apps> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "RmApplicationAppResponse [messageHeader=" + messageHeader + ", apps=" + apps + "]";
	}

}
