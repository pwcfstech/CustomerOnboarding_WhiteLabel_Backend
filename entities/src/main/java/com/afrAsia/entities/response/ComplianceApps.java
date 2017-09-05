package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ComplianceApps implements Serializable {

	private static final long serialVersionUID = 1L;

	private String refNo;

	private String recordId;

	private String customerName;

	private Date appSubmittedDate;

	private String appStatus;

	private List<?> accountsCreated;

	private String accountNumber;

	private Date accountCreationDate;

	private List<?> applicationsUnderProcessing;

	private String isAppLocked;

	private String lockedBy;

	private String isKycDone;

	private String kycStatus;

	private String kycComment;

	private String kycUrl;

	private String kycDoneBy;

	private Date kycDatel;

	private String isWcDone;

	private String wcStatus;

	private String wcComment;

	private String wcUrl;

	private String wcDoneBy;

	private Date wcDate;

	private String isCcDone;

	private String ccStatus;

	private String ccComment;

	private String ccUrl;

	private String ccDoneBy;

	private Date ccDate;

	private String isIcDone;

	private String icStatus;

	private String icComment;

	private String icUrl;

	private String icDoneBy;

	private Date icDate;

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getAppSubmittedDate() {
		return appSubmittedDate;
	}

	public void setAppSubmittedDate(Date appSubmittedDate) {
		this.appSubmittedDate = appSubmittedDate;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public List<?> getAccountsCreated() {
		return accountsCreated;
	}

	public void setAccountsCreated(List<?> accountsCreated) {
		this.accountsCreated = accountsCreated;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public List<?> getApplicationsUnderProcessing() {
		return applicationsUnderProcessing;
	}

	public void setApplicationsUnderProcessing(List<?> applicationsUnderProcessing) {
		this.applicationsUnderProcessing = applicationsUnderProcessing;
	}

	public String getIsAppLocked() {
		return isAppLocked;
	}

	public void setIsAppLocked(String isAppLocked) {
		this.isAppLocked = isAppLocked;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public String getIsKycDone() {
		return isKycDone;
	}

	public void setIsKycDone(String isKycDone) {
		this.isKycDone = isKycDone;
	}

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public String getKycComment() {
		return kycComment;
	}

	public void setKycComment(String kycComment) {
		this.kycComment = kycComment;
	}

	public String getKycUrl() {
		return kycUrl;
	}

	public void setKycUrl(String kycUrl) {
		this.kycUrl = kycUrl;
	}

	public String getKycDoneBy() {
		return kycDoneBy;
	}

	public void setKycDoneBy(String kycDoneBy) {
		this.kycDoneBy = kycDoneBy;
	}

	public Date getKycDatel() {
		return kycDatel;
	}

	public void setKycDatel(Date kycDatel) {
		this.kycDatel = kycDatel;
	}

	public String getIsWcDone() {
		return isWcDone;
	}

	public void setIsWcDone(String isWcDone) {
		this.isWcDone = isWcDone;
	}

	public String getWcStatus() {
		return wcStatus;
	}

	public void setWcStatus(String wcStatus) {
		this.wcStatus = wcStatus;
	}

	public String getWcComment() {
		return wcComment;
	}

	public void setWcComment(String wcComment) {
		this.wcComment = wcComment;
	}

	public String getWcUrl() {
		return wcUrl;
	}

	public void setWcUrl(String wcUrl) {
		this.wcUrl = wcUrl;
	}

	public String getWcDoneBy() {
		return wcDoneBy;
	}

	public void setWcDoneBy(String wcDoneBy) {
		this.wcDoneBy = wcDoneBy;
	}

	public Date getWcDate() {
		return wcDate;
	}

	public void setWcDate(Date wcDate) {
		this.wcDate = wcDate;
	}

	public String getIsCcDone() {
		return isCcDone;
	}

	public void setIsCcDone(String isCcDone) {
		this.isCcDone = isCcDone;
	}

	public String getCcStatus() {
		return ccStatus;
	}

	public void setCcStatus(String ccStatus) {
		this.ccStatus = ccStatus;
	}

	public String getCcComment() {
		return ccComment;
	}

	public void setCcComment(String ccComment) {
		this.ccComment = ccComment;
	}

	public String getCcUrl() {
		return ccUrl;
	}

	public void setCcUrl(String ccUrl) {
		this.ccUrl = ccUrl;
	}

	public String getCcDoneBy() {
		return ccDoneBy;
	}

	public void setCcDoneBy(String ccDoneBy) {
		this.ccDoneBy = ccDoneBy;
	}

	public Date getCcDate() {
		return ccDate;
	}

	public void setCcDate(Date ccDate) {
		this.ccDate = ccDate;
	}

	public String getIsIcDone() {
		return isIcDone;
	}

	public void setIsIcDone(String isIcDone) {
		this.isIcDone = isIcDone;
	}

	public String getIcStatus() {
		return icStatus;
	}

	public void setIcStatus(String icStatus) {
		this.icStatus = icStatus;
	}

	public String getIcComment() {
		return icComment;
	}

	public void setIcComment(String icComment) {
		this.icComment = icComment;
	}

	public String getIcUrl() {
		return icUrl;
	}

	public void setIcUrl(String icUrl) {
		this.icUrl = icUrl;
	}

	public String getIcDoneBy() {
		return icDoneBy;
	}

	public void setIcDoneBy(String icDoneBy) {
		this.icDoneBy = icDoneBy;
	}

	public Date getIcDate() {
		return icDate;
	}

	public void setIcDate(Date icDate) {
		this.icDate = icDate;
	}

	@Override
	public String toString() {
		return "ComplianceApps [refNo=" + refNo + ", recordId=" + recordId + ", customerName=" + customerName
				+ ", appSubmittedDate=" + appSubmittedDate + ", appStatus=" + appStatus + ", accountsCreated="
				+ accountsCreated + ", accountNumber=" + accountNumber + ", accountCreationDate=" + accountCreationDate
				+ ", applicationsUnderProcessing=" + applicationsUnderProcessing + ", isAppLocked=" + isAppLocked
				+ ", lockedBy=" + lockedBy + ", isKycDone=" + isKycDone + ", kycStatus=" + kycStatus + ", kycComment="
				+ kycComment + ", kycUrl=" + kycUrl + ", kycDoneBy=" + kycDoneBy + ", kycDatel=" + kycDatel
				+ ", isWcDone=" + isWcDone + ", wcStatus=" + wcStatus + ", wcComment=" + wcComment + ", wcUrl=" + wcUrl
				+ ", wcDoneBy=" + wcDoneBy + ", wcDate=" + wcDate + ", isCcDone=" + isCcDone + ", ccStatus=" + ccStatus
				+ ", ccComment=" + ccComment + ", ccUrl=" + ccUrl + ", ccDoneBy=" + ccDoneBy + ", ccDate=" + ccDate
				+ ", isIcDone=" + isIcDone + ", icStatus=" + icStatus + ", icComment=" + icComment + ", icUrl=" + icUrl
				+ ", icDoneBy=" + icDoneBy + ", icDate=" + icDate + "]";
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
		ComplianceApps other = (ComplianceApps) obj;
		if (refNo == null) {
			if (other.refNo != null)
				return false;
		} else if (!refNo.equals(other.refNo))
			return false;
		return true;
	}

}
