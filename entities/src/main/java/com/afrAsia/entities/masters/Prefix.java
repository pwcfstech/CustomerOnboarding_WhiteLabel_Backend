package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_FLEX_MASTER_PREFIX")
public class Prefix extends BaseMaster  implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BRANCH_CODE")
	private String branchCode;
	@Column(name = "PREFIX1")
	private String prefix1;
	@Column(name = "PREFIX2")
	private String prefix2;
	@Column(name = "PREFIX3")
	private String prefix3;

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getPrefix1() {
		return prefix1;
	}

	public void setPrefix1(String prefix1) {
		this.prefix1 = prefix1;
	}

	public String getPrefix2() {
		return prefix2;
	}

	public void setPrefix2(String prefix2) {
		this.prefix2 = prefix2;
	}

	public String getPrefix3() {
		return prefix3;
	}

	public void setPrefix3(String prefix3) {
		this.prefix3 = prefix3;
	}

	@Override
	public String toString() {
		return "Prefix [branchCode=" + branchCode + ", prefix1=" + prefix1 + ", prefix2=" + prefix2 + ", prefix3="
				+ prefix3 + "]";
	}
	

}

