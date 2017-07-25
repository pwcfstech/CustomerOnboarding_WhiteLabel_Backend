package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

public class RmApplicationAppResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private List<Apps> apps;

	/**
	 * @return the messageHeader
	 */
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	/**
	 * @param messageHeader
	 *            the messageHeader to set
	 */
	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	/**
	 * @return the apps
	 */
	public List<Apps> getApps() {
		return apps;
	}

	/**
	 * @param apps
	 *            the apps to set
	 */
	public void setApps(List<Apps> apps) {
		this.apps = apps;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RmApplicationAppResponse [messageHeader=" + messageHeader + ", apps=" + apps + "]";
	}

}
