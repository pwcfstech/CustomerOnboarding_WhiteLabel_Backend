package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_ACCOUNT_DETAILS database table.
 * 
 */
@Entity
@Table(name = "MOB_APPLICANT_KYC_DOCUMENTS")
@NamedQuery(name = "MobApplicantKycDocuments.findAll", query = "SELECT m FROM MobApplicantKycDocuments m")
public class MobApplicantKycDocuments implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private KycTableCompositePK id;

	@Column(name = "RECORD_ID")
	// private String recordId;
	private Long recordId;

	@Column(name = "DOC_URL")
	private String docUrl;	

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

	public KycTableCompositePK getId() {
		return id;
	}

	public void setId(KycTableCompositePK id) {
		this.id = id;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
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
		return "MobApplicantKycDocuments [id=" + id + ", recordId=" + recordId + ", docUrl=" + docUrl + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + "]";
	}

}