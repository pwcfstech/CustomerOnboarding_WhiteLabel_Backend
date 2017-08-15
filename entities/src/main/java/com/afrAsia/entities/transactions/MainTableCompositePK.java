package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MOB_APPLICANT_PERSONAL_DETAILS database table.
 * 
 */
@Embeddable
public class MainTableCompositePK implements Serializable {

	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID",insertable=false, updatable=false)
	private Long id;

	@Column(name="APPLICANT_ID", insertable=false, updatable=false)
	private Long applicantId;

	public MainTableCompositePK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MainTableCompositePK)) {
			return false;
		}
		MainTableCompositePK castOther = (MainTableCompositePK)other;
		return 
			(this.id == castOther.id)
			&& (this.applicantId == castOther.applicantId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.id ^ (this.id >>> 32)));
		hash = hash * prime + ((int) (this.applicantId ^ (this.applicantId >>> 32)));
		
		return hash;
	}
}