package com.afrAsia.entities.request;

/**
 * Login request POJO
 * @author nyalfernandes
 *
 */
public class LogoutRequest 
{
	private MessageHeader msgHeader;
	private LogoutDataRequest data;
	
	public MessageHeader getMsgHeader() {
		return msgHeader;
	}
	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}
	public LogoutDataRequest getData() {
		return data;
	}
	public void setData(LogoutDataRequest data) {
		this.data = data;
	}
	
	
}
