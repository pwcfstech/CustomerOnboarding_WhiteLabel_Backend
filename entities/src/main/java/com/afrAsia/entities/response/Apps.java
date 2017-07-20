package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Date;

public class Apps implements Serializable {

	private static final long serialVersionUID = 1L;

	private String refNo;

	private String customerName;

	private Date pendingSince;

	private Date appSubmittedDate;

	private String appStatus;

	/**
	 * @return the refNo
	 */
	public String getRefNo() {
		return refNo;
	}

	/**
	 * @param refNo
	 *            the refNo to set
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the pendingSince
	 */
	public Date getPendingSince() {
		return pendingSince;
	}

	/**
	 * @param pendingSince
	 *            the pendingSince to set
	 */
	public void setPendingSince(Date pendingSince) {
		this.pendingSince = pendingSince;
	}

	/**
	 * @return the appSubmittedDate
	 */
	public Date getAppSubmittedDate() {
		return appSubmittedDate;
	}

	/**
	 * @param appSubmittedDate
	 *            the appSubmittedDate to set
	 */
	public void setAppSubmittedDate(Date appSubmittedDate) {
		this.appSubmittedDate = appSubmittedDate;
	}

	/**
	 * @return the appStatus
	 */
	public String getAppStatus() {
		return appStatus;
	}

	/**
	 * @param appStatus
	 *            the appStatus to set
	 */
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Apps [refNo=" + refNo + ", customerName=" + customerName + ", pendingSince=" + pendingSince
				+ ", appSubmittedDate=" + appSubmittedDate + ", appStatus=" + appStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((refNo == null) ? 0 : refNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apps other = (Apps) obj;
		if (refNo == null) {
			if (other.refNo != null)
				return false;
		} else if (!refNo.equals(other.refNo))
			return false;
		return true;
	}

}
