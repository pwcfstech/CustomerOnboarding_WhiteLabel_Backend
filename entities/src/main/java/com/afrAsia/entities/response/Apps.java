package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Date;

public class Apps implements Serializable {

	private static final long serialVersionUID = 1L;

	private String refNo;

	private String customerName; 

	private Date pendingSince;

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getPendingSince() {
		return pendingSince;
	}

	public void setPendingSince(Date pendingSince) {
		this.pendingSince = pendingSince;
	}

	@Override
	public String toString() {
		return "Apps [refNo=" + refNo + ", customerName=" + customerName + ", pendingSince=" + pendingSince + "]";
	}

}
