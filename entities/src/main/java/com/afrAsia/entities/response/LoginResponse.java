package com.afrAsia.entities.response;



/**
 * Structure for Login Response
 * @author nyalfernandes
 *
 */
public class LoginResponse 
{
	private MessageHeader msgHeader;

	private LoginDataResponse data;

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public LoginDataResponse getData() {
		return data;
	}

	public void setData(LoginDataResponse data) {
		this.data = data;
	}
	
	
}
