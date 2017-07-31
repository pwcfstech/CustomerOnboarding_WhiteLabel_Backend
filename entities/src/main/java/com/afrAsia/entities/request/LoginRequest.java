package com.afrAsia.entities.request;

/**
 * Login request POJO
 * @author nyalfernandes
 *
 */
public class LoginRequest 
{
	private MessageHeader msgHeader;
	private LoginDataRequest data;
	
	public MessageHeader getMsgHeader() {
		return msgHeader;
	}
	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}
	public LoginDataRequest getData() {
		return data;
	}
	public void setData(LoginDataRequest data) {
		this.data = data;
	}
	
}
