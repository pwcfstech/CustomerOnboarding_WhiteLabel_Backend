package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_ACCOUNT_TYPE")
public class AccountType extends BaseMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "NONRESIDENT")
	private String nonResident;
	
	@Column(name = "RESIDENT")
	private String resident;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNonResident() {
		return nonResident;
	}

	public void setNonResident(String nonResident) {
		this.nonResident = nonResident;
	}

	public String getResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	@Override
	public String toString() {
		return "AccountType [id=" + id + ", name=" + name + ", nonResident=" + nonResident + ", resident=" + resident
				+ "]";
	}
	
	
}
