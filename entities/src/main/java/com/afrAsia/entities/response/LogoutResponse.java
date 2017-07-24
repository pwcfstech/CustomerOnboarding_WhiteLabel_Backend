package com.afrAsia.entities.response;

import com.afrAsia.entities.jpa.MsgHeader;

/**
 * Structure for Login Response
 * @author nyalfernandes
 *
 */
public class LogoutResponse 
{
	private MsgHeader msgHeader;

	private LogoutResponse data;

	public MsgHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public LogoutResponse getData() {
		return data;
	}

	public void setData(LogoutResponse data) {
		this.data = data;
	}
	
	
}
