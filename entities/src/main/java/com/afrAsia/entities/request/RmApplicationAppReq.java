package com.afrAsia.entities.request;

import java.io.Serializable;

public class RmApplicationAppReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader msgHeader;

	private SearchParameter searchParameter;

	/**
	 * @return the msgHeader
	 */
	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	/**
	 * @param msgHeader
	 *            the msgHeader to set
	 */
	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	/**
	 * @return the searchParameter
	 */
	public SearchParameter getSearchParameter() {
		return searchParameter;
	}

	/**
	 * @param searchParameter
	 *            the searchParameter to set
	 */
	public void setSearchParameter(SearchParameter searchParameter) {
		this.searchParameter = searchParameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RmApplicationAppReq [msgHeader=" + msgHeader + ", searchParameter=" + searchParameter + "]";
	}

}
