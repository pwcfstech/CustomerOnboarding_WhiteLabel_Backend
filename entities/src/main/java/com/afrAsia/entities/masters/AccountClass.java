package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_FLEX_MASTER_ACCOUNT")
public class AccountClass extends BaseMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ACCOUNT_CLASS")
	private String accountClass;
	@Column(name = "AC_CLASS_TYPE")
	private String acClassType;
	@Column(name = "DESCRIPTION")
	private String description;

	public String getAccountClass() {
		return accountClass;
	}

	public void setAccountClass(String accountClass) {
		this.accountClass = accountClass;
	}

	public String getAcClassType() {
		return acClassType;
	}

	public void setAcClassType(String acClassType) {
		this.acClassType = acClassType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AccountClass [accountClass=" + accountClass + ", acClassType=" + acClassType + ", description="
				+ description + "]";
	}
	
	

}

