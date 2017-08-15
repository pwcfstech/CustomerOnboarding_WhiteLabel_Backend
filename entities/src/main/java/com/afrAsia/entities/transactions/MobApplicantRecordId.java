package com.afrAsia.entities.transactions;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the MOB_APPLICANT_RECORD_ID database table.
 * 
 */
@Entity
@Table(name="MOB_APPLICANT_RECORD_ID")

public class MobApplicantRecordId implements Serializable {

	private static final Long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOB_APPLICANT_RECORD_ID_APPLICANTID_GENERATOR", sequenceName="AA_APPLICANT_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOB_APPLICANT_RECORD_ID_APPLICANTID_GENERATOR")
	@Column(name="APPLICANT_ID")
	private Long applicantId;
	
	@Column(name="RECORD_ID")
	private Long recordId;
	
	@Column(name="ID")
	private Long id;
	
	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;


	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	

	public MobApplicantRecordId() {
	}

	public Long getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	@Override
	public String toString() {
		return "MobApplicantRecordId [applicantId=" + applicantId + ", recordId=" + recordId + ", Id=" + id
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", id=" + id + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	

}
