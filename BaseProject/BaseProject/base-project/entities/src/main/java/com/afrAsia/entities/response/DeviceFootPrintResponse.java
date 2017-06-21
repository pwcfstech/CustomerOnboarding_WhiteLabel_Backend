package com.afrAsia.entities.response;

import java.io.Serializable;

import com.afrAsia.entities.MsgHeader;

public class DeviceFootPrintResponse implements Serializable {
	
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
		return "DeviceFootPrintResponse [msgHeader=" + msgHeader + ", data=" + data + "]";
	}




	public class Data implements Serializable{
	private String appVersionStatus;
	
	private String newVersionDescription;
	
	private String activeVersionNo;

	private String gracePeriod;
	
	private String appUpgradeMessage;
	
	private String appDownloadLink;

	public String getAppVersionStatus() {
		return appVersionStatus;
	}

	public void setAppVersionStatus(String appVersionStatus) {
		this.appVersionStatus = appVersionStatus;
	}

	public String getNewVersionDescription() {
		return newVersionDescription;
	}

	public void setNewVersionDescription(String newVersionDescription) {
		this.newVersionDescription = newVersionDescription;
	}

	public String getActiveVersionNo() {
		return activeVersionNo;
	}

	public void setActiveVersionNo(String activeVersionNo) {
		this.activeVersionNo = activeVersionNo;
	}

	public String getGracePeriod() {
		return gracePeriod;
	}

	public void setGracePeriod(String gracePeriod) {
		this.gracePeriod = gracePeriod;
	}

	public String getAppUpgradeMessage() {
		return appUpgradeMessage;
	}

	public void setAppUpgradeMessage(String appUpgradeMessage) {
		this.appUpgradeMessage = appUpgradeMessage;
	}

	public String getAppDownloadLink() {
		return appDownloadLink;
	}

	public void setAppDownloadLink(String appDownloadLink) {
		this.appDownloadLink = appDownloadLink;
	}

	@Override
	public String toString() {
		return "Data [appVersionStatus=" + appVersionStatus + ", newVersionDescription=" + newVersionDescription
				+ ", activeVersionNo=" + activeVersionNo + ", gracePeriod=" + gracePeriod + ", appUpgradeMessage="
				+ appUpgradeMessage + ", appDownloadLink=" + appDownloadLink + "]";
	}
	
	}
	

}
