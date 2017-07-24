package com.afrAsia.entities.request;

/**
 * Login request POJO
 * @author nyalfernandes
 *
 */
public class LogoutRequest 
{
	private MessageHeader msgHeader;
	private LogoutRequest data;
	
	public MessageHeader getMsgHeader() {
		return msgHeader;
	}
	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}
	public LogoutRequest getData() {
		return data;
	}
	public void setData(LogoutRequest data) {
		this.data = data;
	}
	
	
}
