package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ComplianceApps implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<AccountsRejected> accountsRejected;

	private List<AccountsCreated> accountsCreated;

	private List<ApplicationsUnderProcessing> applicationsUnderProcessing;

	public List<AccountsRejected> getAccountsRejected() {
		return accountsRejected;
	}

	public void setAccountsRejected(List<AccountsRejected> accountsRejected) {
		this.accountsRejected = accountsRejected;
	}

	public List<AccountsCreated> getAccountsCreated() {
		return accountsCreated;
	}

	public void setAccountsCreated(List<AccountsCreated> accountsCreated) {
		this.accountsCreated = accountsCreated;
	}

	public List<ApplicationsUnderProcessing> getApplicationsUnderProcessing() {
		return applicationsUnderProcessing;
	}

	public void setApplicationsUnderProcessing(List<ApplicationsUnderProcessing> applicationsUnderProcessing) {
		this.applicationsUnderProcessing = applicationsUnderProcessing;
	}

	@Override
	public String toString() {
		return "ComplianceApps [accountsRejected=" + accountsRejected + ", accountsCreated=" + accountsCreated
				+ ", applicationsUnderProcessing=" + applicationsUnderProcessing + "]";
	}

	public class AccountsRejected implements Serializable {

		private static final long serialVersionUID = 1L;

		private String refNo;

		private String recordId;

		private String rmName;

		private String customerName;

		@Temporal(TemporalType.TIMESTAMP)
		private Date appSubmittedDate;

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

		public String getRmName() {
			return rmName;
		}

		public void setRmName(String rmName) {
			this.rmName = rmName;
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

		@Override
		public String toString() {
			return "AccountsRejected [refNo=" + refNo + ", recordId=" + recordId + ", rmName=" + rmName
					+ ", customerName=" + customerName + ", appSubmittedDate=" + appSubmittedDate + "]";
		}
	}

	public class AccountsCreated implements Serializable {

		private static final long serialVersionUID = 1L;

		private String refNo;

		private String recordId;

		private String rmName;

		private String customerName;

		private String accountNumber;

		@Temporal(TemporalType.TIMESTAMP)
		private Date appSubmittedDate;

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

		public String getRmName() {
			return rmName;
		}

		public void setRmName(String rmName) {
			this.rmName = rmName;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Date getAppSubmittedDate() {
			return appSubmittedDate;
		}

		public void setAppSubmittedDate(Date appSubmittedDate) {
			this.appSubmittedDate = appSubmittedDate;
		}

		@Override
		public String toString() {
			return "AccountsCreated [refNo=" + refNo + ", recordId=" + recordId + ", rmName=" + rmName
					+ ", customerName=" + customerName + ", accountNumber=" + accountNumber + ", appSubmittedDate="
					+ appSubmittedDate + "]";
		}

	}

	public class ApplicationsUnderProcessing implements Serializable {

		private static final long serialVersionUID = 1L;

		private String refNo;

		private String recordId;

		private String rmName;

		private String customerName;

		@Temporal(TemporalType.TIMESTAMP)
		private Date appSubmittedDate;

		private String appStatus;

		private String isAppLocked;

		private String lockedBy;

		private String isKycDone;

		private String kycStatus;

		private String kycUrl;

		private String kycDoneBy;

		@Temporal(TemporalType.TIMESTAMP)
		private Date kycDate;

		private String isWcDone;

		private String wcStatus;

		private String wcUrl;

		private String wcDoneBy;

		@Temporal(TemporalType.TIMESTAMP)
		private Date wcDate;

		private String isCcDone;

		private String ccStatus;

		private String ccUrl;

		private String ccDoneBy;

		@Temporal(TemporalType.TIMESTAMP)
		private Date ccDate;

		private String isIcDone;

		private String icStatus;

		private String icUrl;

		private String icDoneBy;

		@Temporal(TemporalType.TIMESTAMP)
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

		public String getRmName() {
			return rmName;
		}

		public void setRmName(String rmName) {
			this.rmName = rmName;
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

		public Date getKycDate() {
			return kycDate;
		}

		public void setKycDate(Date kycDate) {
			this.kycDate = kycDate;
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
			return "ApplicationsUnderProcessing [refNo=" + refNo + ", recordId=" + recordId + ", rmName=" + rmName
					+ ", customerName=" + customerName + ", appSubmittedDate=" + appSubmittedDate + ", appStatus="
					+ appStatus + ", isAppLocked=" + isAppLocked + ", lockedBy=" + lockedBy + ", isKycDone=" + isKycDone
					+ ", kycStatus=" + kycStatus + ", kycUrl=" + kycUrl + ", kycDoneBy=" + kycDoneBy + ", kycDate="
					+ kycDate + ", isWcDone=" + isWcDone + ", wcStatus=" + wcStatus + ", wcUrl=" + wcUrl + ", wcDoneBy="
					+ wcDoneBy + ", wcDate=" + wcDate + ", isCcDone=" + isCcDone + ", ccStatus=" + ccStatus + ", ccUrl="
					+ ccUrl + ", ccDoneBy=" + ccDoneBy + ", ccDate=" + ccDate + ", isIcDone=" + isIcDone + ", icStatus="
					+ icStatus + ", icUrl=" + icUrl + ", icDoneBy=" + icDoneBy + ", icDate=" + icDate + "]";
		}

	}
}
