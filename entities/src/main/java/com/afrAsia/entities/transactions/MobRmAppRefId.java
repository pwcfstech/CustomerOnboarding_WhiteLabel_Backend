package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_RM_APP_REF_ID database table.
 * 
 */
@Entity
@Table(name = "MOB_RM_APP_REF_ID")

public class MobRmAppRefId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "MOB_RM_APP_REF_ID_ID_GENERATOR", sequenceName = "AA_APPLICATION_ID_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOB_RM_APP_REF_ID_ID_GENERATOR")
	@Column(name = "ID")
	private long id;

	@Column(name = "RM_NAME")
	private String rmName;

	@Column(name = "RM_USER_ID")
	private String rmUsedId;

	@Column(name = "APP_STATUS")
	private String appStatus;

	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	public MobRmAppRefId() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getRmUsedId() {
		return rmUsedId;
	}

	public void setRmUsedId(String rmUsedId) {
		this.rmUsedId = rmUsedId;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
		return "MobRmAppRefId [id=" + id + ", rmName=" + rmName + ", rmUsedId=" + rmUsedId + ", appStatus=" + appStatus
				+ ", accountNumber=" + accountNumber + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}
