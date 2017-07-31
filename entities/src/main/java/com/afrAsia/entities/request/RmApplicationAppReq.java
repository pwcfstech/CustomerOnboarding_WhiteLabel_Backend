package com.afrAsia.entities.request;

import java.io.Serializable;

public class RmApplicationAppReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private SearchParameter searchParameter;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public SearchParameter getSearchParameter() {
		return searchParameter;
	}

	public void setSearchParameter(SearchParameter searchParameter) {
		this.searchParameter = searchParameter;
	}

	@Override
	public String toString() {
		return "RmApplicationAppReq [messageHeader=" + messageHeader + ", searchParameter=" + searchParameter + "]";
	}

}
