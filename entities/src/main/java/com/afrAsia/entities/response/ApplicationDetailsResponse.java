package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Date;

import com.afrAsia.entities.jpa.MsgHeader;

public class ApplicationDetailsResponse implements Serializable {
	
	private MsgHeader msgHeader;
	private Data data;
	
	public MsgHeader getMsgHeader() {
		return msgHeader;
	}
	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ApplicationDetailsResponse [msgHeader=" + msgHeader + ", data=" + data + "]";
	}

	public class Data implements Serializable{
		private String rmId;
		private Integer refNo;
		private String appStatus;
		private Date appSubDate;
		private Date pendingRMSince;

		
		public String getRmId() {
			return rmId;
		}

		public void setRmId(String rmId) {
			this.rmId = rmId;
		}

		public Integer getRefNo() {
			return refNo;
		}
		
		public void setRefNo(Integer refNo) {
			this.refNo = refNo;
		}

		public String getAppStatus() {
			return appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}
	
		public void setPendingRMSince(Date pendingRMSince){
			this.pendingRMSince = pendingRMSince;
		}
		
		public Date getPendingRMSince(){
			return pendingRMSince;
		}
	
		public void setAppSubDate(Date appSubDate){
			this.appSubDate = appSubDate;
		}
	
		public Date getAppSubDate(){
			return appSubDate;
		}

		@Override
		public String toString() {
			return "Data [rmId=" + rmId + ", refNo=" + refNo
				+ ", appStatus=" + appStatus + ", appSubDate=" + appSubDate + ", pendingRMSince="
				+ pendingRMSince + "]";
		}
	}
}
