package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_RM")
public class RMDetails extends BaseMaster  implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "RM_Name")
	private String rmName;

	public String getId() {
		return id;
	}

	public void setId(String rmId) {
		this.id = rmId;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	@Override
	public String toString() {
		return "RMDetails [rmId=" + id + ", rmName=" + rmName + "]";
	}
	

}
