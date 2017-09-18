package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_BANK")
public class Bank extends BaseMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BANK_CODE")
	private String bankCode;												

	@Column(name = "BANK_NAME")
	private String bankName;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", bankName=" + bankName + "]";
	}

}
