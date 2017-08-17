package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MOB_APPLICANT_PERSONAL_DETAILS database table.
 * 
 */
@Embeddable
public class KycTableCompositePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID",insertable=false, updatable=false)
	private long id;

	@Column(name="APPLICANT_ID", insertable=false, updatable=false)
	private long applicantId;

	@Column(name="DOC_ID" , insertable=false, updatable=false)
	private String docId;
	
	public KycTableCompositePK() {
	}
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getApplicantId() {
		return this.applicantId;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (applicantId ^ (applicantId >>> 32));
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		KycTableCompositePK other = (KycTableCompositePK) obj;
		if (applicantId != other.applicantId)
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}