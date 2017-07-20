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
public class ApplicationReference extends BaseEntity implements Serializable {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appStatus == null) ? 0 : appStatus.hashCode());
		result = prime * result + ((rmName == null) ? 0 : rmName.hashCode());
		result = prime * result + ((rmUsedId == null) ? 0 : rmUsedId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (rmUsedId == null) {
			if (other.rmUsedId != null)
				return false;
		} else if (!rmUsedId.equals(other.rmUsedId))
			return false;
		return true;
	}

}
