package com.afrAsia.entities.response;

import com.afrAsia.entities.jpa.MsgHeader;

/**
 * Structure for Login Response
 * @author nyalfernandes
 *
 */
public class LoginResponse 
{
	private MsgHeader msgHeader;

	private LoginDataResponse data;

	public MsgHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public LoginDataResponse getData() {
		return data;
	}

	public void setData(LoginDataResponse data) {
		this.data = data;
	}
	
	
}
