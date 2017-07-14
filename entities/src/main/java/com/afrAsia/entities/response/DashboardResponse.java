package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

public class DashboardResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private List<AverageProductivity> avgProductivity;

	private List<AppLoggedSummary> appLoggedSummary;

	private List<PendingAction> pendingAction;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public List<AverageProductivity> getAvgProductivity() {
		return avgProductivity;
	}

	public void setAvgProductivity(List<AverageProductivity> avgProductivity) {
		this.avgProductivity = avgProductivity;
	}

	public List<AppLoggedSummary> getAppLoggedSummary() {
		return appLoggedSummary;
	}

	public void setAppLoggedSummary(List<AppLoggedSummary> appLoggedSummary) {
		this.appLoggedSummary = appLoggedSummary;
	}

	public List<PendingAction> getPendingAction() {
		return pendingAction;
	}

	public void setPendingAction(List<PendingAction> pendingAction) {
		this.pendingAction = pendingAction;
	}

	@Override
	public String toString() {
		return "DashboardResponse [messageHeader=" + messageHeader + ", avgProductivity=" + avgProductivity
				+ ", appLoggedSummary=" + appLoggedSummary + ", pendingAction=" + pendingAction + "]";
	}

}
