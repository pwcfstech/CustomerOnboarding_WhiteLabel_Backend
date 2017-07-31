package com.afrAsia.entities.request;

import java.io.Serializable;
import java.util.Date;

public class SearchParameter implements Serializable {

	private static final long serialVersionUID = 1L;

	private String rmId;

	private String custName;

	private Date startDate;

	private Date endDate;

	private String appStatus;

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	@Override
	public String toString() {
		return "SearchParameter [rmId=" + rmId + ", custName=" + custName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", appStatus=" + appStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rmId == null) ? 0 : rmId.hashCode());
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
		SearchParameter other = (SearchParameter) obj;
		if (rmId == null) {
			if (other.rmId != null)
				return false;
		} else if (!rmId.equals(other.rmId))
			return false;
		return true;
	}

}
