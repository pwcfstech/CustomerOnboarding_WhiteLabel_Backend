package com.afrAsia.entities.transactions;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the MOB_APPL_KYC_DOCUMENTS_HIST database table.
 * 
 */
@Entity
@Table(name = "MOB_APPL_KYC_DOCUMENTS_HIST")
@NamedQuery(name = "MobApplKycDocumentsHist.findAll", query = "SELECT m FROM MobApplKycDocumentsHist m")
public class MobApplKycDocumentsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	/*
	 * @EmbeddedId private HistTableCompositePK id;
	 */
	@Id
	@Column(name = "RECORD_ID", insertable = false, updatable = false)
	private long recordId;	

	@Column(name = "APPLICANT_ID", insertable = false, updatable = false)
	private long applicantId;

	@Column(name = "DOC_ID")
	private String docId;

	@Column(name = "DOC_URL")
	private String docUrl;

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

	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(long applicantId) {
		this.applicantId = applicantId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
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
		return "MobApplKycDocumentsHist [recordId=" + recordId + ", applicantId=" + applicantId + ", docId=" + docId
				+ ", docUrl=" + docUrl + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}