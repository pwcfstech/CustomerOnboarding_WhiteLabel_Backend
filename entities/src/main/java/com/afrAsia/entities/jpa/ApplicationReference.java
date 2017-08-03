package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_RM_APP_REF_ID")
@EntityListeners(value = { EntityListener.class })
public class ApplicationReference extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "RM_USER_ID")
	private String rmUserId;
	
	@Column(name = "RM_NAME")
	private String rmName;
	
	@Column(name = "APP_STATUS")
	private String appStatus;
	
	
	public String getRmUserId() {
		return rmUserId;
	}

	public void setRmUserId(String rmUserId) {
		this.rmUserId = rmUserId;
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
		return "ApplicationReference [rmUserId=" + rmUserId + ", rmName=" + rmName + ", appStatus=" + appStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appStatus == null) ? 0 : appStatus.hashCode());
		result = prime * result + ((rmName == null) ? 0 : rmName.hashCode());
		result = prime * result + ((rmUserId == null) ? 0 : rmUserId.hashCode());
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
		ApplicationReference other = (ApplicationReference) obj;
		if (appStatus == null) {
			if (other.appStatus != null)
				return false;
		} else if (!appStatus.equals(other.appStatus))
			return false;
		if (rmName == null) {
			if (other.rmName != null)
				return false;
		} else if (!rmName.equals(other.rmName))
			return false;
		if (rmUserId == null) {
			if (other.rmUserId != null)
				return false;
		} else if (!rmUserId.equals(other.rmUserId))
			return false;
		return true;
	}

}
