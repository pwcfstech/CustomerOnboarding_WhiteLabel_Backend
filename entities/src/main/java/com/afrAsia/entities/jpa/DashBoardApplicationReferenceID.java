package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_RM_APP_REF_ID")
@EntityListeners(value = { EntityListener.class })
public class DashBoardApplicationReferenceID extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "RM_USED_ID")
	private String rmUsedId;
	@Column(name = "RM_NAME")
	private String rmName;
	@Column(name = "APP_STATUS")
	private String appStatus;

	public String getRmUsedId() {
		return rmUsedId;
	}

	public void setRmUsedId(String rmUsedId) {
		this.rmUsedId = rmUsedId;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	@Override
	public String toString() {
		return "DashBoardApplicationReferenceID [rmUsedId=" + rmUsedId + ", rmName=" + rmName + ", appStatus="
				+ appStatus + "]";
	}

}
