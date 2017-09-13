package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_APPLICATION_COMP_STATUS database table.
 * 
 */
@Entity
@Table(name = "MOB_APPL_CHECK")
@NamedQuery(name = "MobApplCheck.findAll", query = "SELECT m FROM MobApplCheck m")
public class MobApplCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private Long id;

	@Id
	@Column(name = "RECORD_ID")
	private Long recordId;

	@Column(name = "IS_APP_LOCKED")
	private Boolean isAppLocked;

	@Column(name = "LOCKED_BY")
	private String lockedBy;

	@Column(name = "KYC_DONE")
	private Boolean kycDone;

	@Column(name = "KYC_STATUS")
	private String kycStatus;

	@Column(name = "KYC_URL")
	private String kycUrl;

	@Column(name = "KYC_DONE_BY")
	private String kycDoneBy;

	@Column(name = "KYC_DATE")
	private Date kycDate;

	@Column(name = "WC_DONE")
	private Boolean wcDone;

	@Column(name = "WC_STATUS")
	private String wcStatus;

	@Column(name = "WC_URl")
	private String wcUrl;

	@Column(name = "WC_DONE_BY")
	private String wcDoneBy;

	@Column(name = "WC_DATE")
	private Date wcDate;

	@Column(name = "CC_DONE")
	private Boolean ccDone;

	@Column(name = "CC_STATUS")
	private String ccStatus;

	@Column(name = "CC_URl")
	private String ccUrl;

	@Column(name = "CC_DONE_BY")
	private String ccDoneBy;

	@Column(name = "CC_DATE")
	private Date ccDate;

	@Column(name = "IC_DONE")
	private Boolean icDone;

	@Column(name = "IC_STATUS")
	private String icStatus;

	@Column(name = "IC_URl")
	private String icUrl;

	@Column(name = "IC_DONE_BY")
	private String icDoneBy;

	@Column(name = "IC_DATE")
	private Date icDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	public MobApplCheck() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public Boolean getIsAppLocked() {
		return isAppLocked;
	}

	public void setIsAppLocked(Boolean isAppLocked) {
		this.isAppLocked = isAppLocked;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public Boolean getKycDone() {
		return kycDone;
	}

	public void setKycDone(Boolean kycDone) {
		this.kycDone = kycDone;
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

	public Boolean getWcDone() {
		return wcDone;
	}

	public void setWcDone(Boolean wcDone) {
		this.wcDone = wcDone;
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

	public Boolean getCcDone() {
		return ccDone;
	}

	public void setCcDone(Boolean ccDone) {
		this.ccDone = ccDone;
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

	public Boolean getIcDone() {
		return icDone;
	}

	public void setIcDone(Boolean icDone) {
		this.icDone = icDone;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "MobApplicationCompStatus [id=" + id + ", recordId=" + recordId + ", isAppLocked=" + isAppLocked
				+ ", lockedBy=" + lockedBy + ", kycDone=" + kycDone + ", kycStatus=" + kycStatus + ", kycUrl=" + kycUrl
				+ ", kycDoneBy=" + kycDoneBy + ", kycDate=" + kycDate + ", wcDone=" + wcDone + ", wcStatus=" + wcStatus
				+ ", wcUrl=" + wcUrl + ", wcDoneBy=" + wcDoneBy + ", wcDate=" + wcDate + ", ccDone=" + ccDone
				+ ", ccStatus=" + ccStatus + ", ccUrl=" + ccUrl + ", ccDoneBy=" + ccDoneBy + ", ccDate=" + ccDate
				+ ", icDone=" + icDone + ", icStatus=" + icStatus + ", icUrl=" + icUrl + ", icDoneBy=" + icDoneBy
				+ ", icDate=" + icDate + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}