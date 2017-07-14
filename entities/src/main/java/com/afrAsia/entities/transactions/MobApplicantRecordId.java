package com.afrAsia.entities.transactions;



import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MOB_APPLICANT_RECORD_ID database table.
 * 
 */
@Entity
@Table(name="MOB_APPLICANT_RECORD_ID")

public class MobApplicantRecordId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOB_APPLICANT_RECORD_ID_APPLICANTID_GENERATOR", sequenceName="AA_APPLICANT_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOB_APPLICANT_RECORD_ID_APPLICANTID_GENERATOR")
	@Column(name="APPLICANT_ID")
	private long applicantId;
	
	@Column(name="RECORD_ID")
	private java.math.BigDecimal recordId;
	
	@Column(name="ID")
	private long Id;
	
	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	private java.math.BigDecimal id;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	

	public MobApplicantRecordId() {
	}

	public long getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(long applicantId) {
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

	public java.math.BigDecimal getId() {
		return this.id;
	}

	public void setId(java.math.BigDecimal id) {
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

	public java.math.BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(java.math.BigDecimal recordId) {
		this.recordId = recordId;
	}

	public void setId(long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "MobApplicantRecordId [applicantId=" + applicantId + ", recordId=" + recordId + ", Id=" + Id
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", id=" + id + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	

}
