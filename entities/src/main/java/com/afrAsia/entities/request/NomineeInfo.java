package com.afrAsia.entities.request;

import java.io.Serializable;

public class NomineeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public NomineeInfo() {
		super();
	}

	private String nomineeName;
	private String nomineeId;
	private Long nomineeCallbkNo;
	private String nomineeEmail;
	private String nomineeEmail1;
	private String nomineeEmail2;

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeId() {
		return nomineeId;
	}

	public void setNomineeId(String nomineeId) {
		this.nomineeId = nomineeId;
	}

	public Long getNomineeCallbkNo() {
		return nomineeCallbkNo;
	}

	public void setNomineeCallbkNo(Long nomineeCallbkNo) {
		this.nomineeCallbkNo = nomineeCallbkNo;
	}

	public String getNomineeEmail() {
		return nomineeEmail;
	}

	public void setNomineeEmail(String nomineeEmail) {
		this.nomineeEmail = nomineeEmail;
	}

	public String getNomineeEmail1() {
		return nomineeEmail1;
	}

	public void setNomineeEmail1(String nomineeEmail1) {
		this.nomineeEmail1 = nomineeEmail1;
	}

	public String getNomineeEmail2() {
		return nomineeEmail2;
	}

	public void setNomineeEmail2(String nomineeEmail2) {
		this.nomineeEmail2 = nomineeEmail2;
	}

	@Override
	public String toString() {
		return "NomineeInfo [nomineeName=" + nomineeName + ", nomineeId=" + nomineeId + ", nomineeCallbkNo="
				+ nomineeCallbkNo + ", nomineeEmail=" + nomineeEmail + ", nomineeEmail1=" + nomineeEmail1
				+ ", nomineeEmail2=" + nomineeEmail2 + "]";
	}

}
