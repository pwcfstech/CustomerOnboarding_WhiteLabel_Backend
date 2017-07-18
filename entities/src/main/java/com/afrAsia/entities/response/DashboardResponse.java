package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

public class DashboardResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessageHeader messageHeader;

	private AverageProductivity avgProductivity;

	private AppLoggedSummary appLoggedSummary;

	private List<PendingAction> pendingAction;

	/**
	 * @return the messageHeader
	 */
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	/**
	 * @param messageHeader
	 *            the messageHeader to set
	 */
	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	/**
	 * @return the avgProductivity
	 */
	public AverageProductivity getAvgProductivity() {
		return avgProductivity;
	}

	/**
	 * @param avgProductivity
	 *            the avgProductivity to set
	 */
	public void setAvgProductivity(AverageProductivity avgProductivity) {
		this.avgProductivity = avgProductivity;
	}

	/**
	 * @return the appLoggedSummary
	 */
	public AppLoggedSummary getAppLoggedSummary() {
		return appLoggedSummary;
	}

	/**
	 * @param appLoggedSummary
	 *            the appLoggedSummary to set
	 */
	public void setAppLoggedSummary(AppLoggedSummary appLoggedSummary) {
		this.appLoggedSummary = appLoggedSummary;
	}

	/**
	 * @return the pendingAction
	 */
	public List<PendingAction> getPendingAction() {
		return pendingAction;
	}

	/**
	 * @param pendingAction
	 *            the pendingAction to set
	 */
	public void setPendingAction(List<PendingAction> pendingAction) {
		this.pendingAction = pendingAction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DashboardResponse [messageHeader=" + messageHeader + ", avgProductivity=" + avgProductivity
				+ ", appLoggedSummary=" + appLoggedSummary + ", pendingAction=" + pendingAction + "]";
	}

}
