package com.afrAsia.entities.request;

import java.io.Serializable;

public class ComplianceReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private SearchParameterCompliance searchParameter;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public SearchParameterCompliance getSearchParameter() {
		return searchParameter;
	}

	public void setSearchParameter(SearchParameterCompliance searchParameter) {
		this.searchParameter = searchParameter;
	}

	@Override
	public String toString() {
		return "ComplianceReq [messageHeader=" + messageHeader + ", searchParameter=" + searchParameter + "]";
	}

}
