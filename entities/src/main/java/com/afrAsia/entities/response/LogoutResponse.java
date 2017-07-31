package com.afrAsia.entities.response;

/**
 * Structure for Login Response
 * @author nyalfernandes
 *
 */
public class LogoutResponse 
{
	private MessageHeader msgHeader;

	private LogoutResponse data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public LogoutResponse getData() {
		return data;
	}

	public void setData(LogoutResponse data) {
		this.data = data;
	}
	
	
}
