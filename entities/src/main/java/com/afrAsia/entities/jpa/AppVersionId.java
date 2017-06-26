package com.afrAsia.entities.jpa;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AppVersionId implements Serializable {
	@Column(name = "APP_VERSION_ID")
	private String appVersionId;
	@Column(name = "PLATFORM")
	private String platform;
	
	public AppVersionId(){
		
	}

	public AppVersionId(String appVersionId, String platform) {
		this.appVersionId = appVersionId;
		this.platform = platform;
	}

	public String getAppVersionId() {
		return appVersionId;
	}

	public void setAppVersionId(String appVersionId) {
		this.appVersionId = appVersionId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof AppVersionId)) return false;
	        AppVersionId that = (AppVersionId) o;
	        return Objects.equals(getAppVersionId(), that.getAppVersionId()) &&
	        		Objects.equals(getPlatform(), that.getPlatform());
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(getAppVersionId(), getPlatform());
	    }
	
	
	
	
}
