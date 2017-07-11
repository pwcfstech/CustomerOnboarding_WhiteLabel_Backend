package com.afrAsia.entities.response;

import java.io.Serializable;

public class DashboardResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private AverageProductivity avgProductivity;

	private AppLoggedSummary appLoggedSummary;

	private PendingAction pendingAction;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public AverageProductivity getAvgProductivity() {
		return avgProductivity;
	}

	public void setAvgProductivity(AverageProductivity avgProductivity) {
		this.avgProductivity = avgProductivity;
	}

	public AppLoggedSummary getAppLoggedSummary() {
		return appLoggedSummary;
	}

	public void setAppLoggedSummary(AppLoggedSummary appLoggedSummary) {
		this.appLoggedSummary = appLoggedSummary;
	}

	public PendingAction getPendingAction() {
		return pendingAction;
	}

	public void setPendingAction(PendingAction pendingAction) {
		this.pendingAction = pendingAction;
	}

	@Override
	public String toString() {
		return "DashboardResponse [messageHeader=" + messageHeader + ", avgProductivity=" + avgProductivity
				+ ", appLoggedSummary=" + appLoggedSummary + ", pendingAction=" + pendingAction + "]";
	}

}
