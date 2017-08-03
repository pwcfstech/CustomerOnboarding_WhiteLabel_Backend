package com.afrAsia.entities.response;

/**
 * Structure for Login Response
 * @author nyalfernandes
 *
 */
public class LogoutResponse 
{
	private MessageHeader msgHeader;

	private LogoutDataResponse data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public LogoutDataResponse getData() {
		return data;
	}

	public void setData(LogoutDataResponse data) {
		this.data = data;
	}
	
	
}
