package com.afrAsia.entities.request;

import java.io.Serializable;
import java.util.Date;

public class SearchParameterCompliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private String custName;

	private Date startDate;																

	private Date endDate;

	private String appStatus;

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
		return "SearchParameterCompliance [custName=" + custName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", appStatus=" + appStatus + "]";
	}

}
