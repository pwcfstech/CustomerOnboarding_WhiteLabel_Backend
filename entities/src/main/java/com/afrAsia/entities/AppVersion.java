package com.afrAsia.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;
@Entity
@Table(name = "APP_VERSION_MASTER")
@EntityListeners(value = { EntityListener.class })
public class AppVersion implements Serializable {
	@EmbeddedId
    private AppVersionId appVersionId;
	@Column(name = "APP_STATUS")
	private String status;
	@Column(name = "RELEASE_DATE")
	private Date releaseDate;
	@Column(name = "DEPRECATED_DATE")
	private Date depcrecatedDate;
	@Column(name = "GRACE_PERIOD")
	private Integer gracePeriod;
	@Column(name = "VERSION_DESC")
	private String versionDesc;
	@Column(name = "DOWNLOAD_URL")
	private String downloadUrl;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	public AppVersionId getAppVersionId() {
		return appVersionId;
	}
	public void setAppVersionId(AppVersionId appVersionId) {
		this.appVersionId = appVersionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getDepcrecatedDate() {
		return depcrecatedDate;
	}
	public void setDepcrecatedDate(Date depcrecatedDate) {
		this.depcrecatedDate = depcrecatedDate;
	}
	public Integer getGracePeriod() {
		return gracePeriod;
	}
	public void setGracePeriod(Integer gracePeriod) {
		this.gracePeriod = gracePeriod;
	}
	public String getVersionDesc() {
		return versionDesc;
	}
	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "AppVersion [appVersionId=" + appVersionId + ", status=" + status + ", releaseDate=" + releaseDate
				+ ", depcrecatedDate=" + depcrecatedDate + ", gracePeriod=" + gracePeriod + ", versionDesc="
				+ versionDesc + ", downloadUrl=" + downloadUrl + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	

}
