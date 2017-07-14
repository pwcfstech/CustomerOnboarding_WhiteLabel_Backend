package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MOB_APPLICANT_RECORD_ID_HIST database table.
 * 
 */
@Entity
@Table(name="MOB_APPLICANT_RECORD_ID_HIST")
@NamedQuery(name="MobApplicantRecordIdHist.findAll", query="SELECT m FROM MobApplicantRecordIdHist m")
public class MobApplicantRecordIdHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MainTableCompositePK id;

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

	public MobApplicantRecordIdHist() {
	}

	public MainTableCompositePK getId() {
		return this.id;
	}

	public void setId(MainTableCompositePK id) {
		this.id = id;
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

}