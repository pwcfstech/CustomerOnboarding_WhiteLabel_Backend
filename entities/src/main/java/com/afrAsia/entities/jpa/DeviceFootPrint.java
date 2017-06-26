package com.afrAsia.entities.jpa;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_DEVICE_FOOTPRINT")

public class DeviceFootPrint implements Serializable {
	@Id
	@Column(name = "DEVICE_ID")
	private String deviceId;
	@Column(name = "DEVICE_NAME")
	private String deviceName;
	@Column(name = "DUAL_SIM")
	private String dualSim;
	@Column(name = "ACTIVE_SIM_NUMBER")
	private String activeSIM;
	@Column(name = "NETWORK_PROVIDER_LINE1")
	private String nwProviderLine1;
	@Column(name = "NETWORK_PROVIDER_LINE2")
	private String nwProviderLine2;
	@Column(name = "NETWORK_TYPE_LINE1")
	private String networkTypeLine1;
	@Column(name = "NETWORK_TYPE_LINE2")
	private String networkTypeLine2;
	@Column(name = "PHONE_NUMBER_LINE1")
	private String phoneNoLine1;
	@Column(name = "PHONE_NUMBER_LINE2")
	private String phoneNoLine2;
	@Column(name = "OS_NAME")
	private String osName;
	@Column(name = "OS_VERSION")
	private String osVersion;
	@Column(name = "TOUCH_ID_STATUS")
	private String touchIdStatus;
	@Column(name = "DEVICE_MODEL_NO")
	private String deviceModelNo;
	@Column(name = "DEVICE_MANUFACTURER")
	private String deviceManufacturer;
	@Column(name = "DEVICE_BATTERY_LEVEL")
	private String batteryLevel;
	@Column(name = "SELECTED_LANGUAGE")
	private String language;
	@Column(name = "SELECTED_COUNTRY")
	private String country;
	@Column(name = "MULTI_TASKING_SUPPORT")
	private String multitaskingSupport;
	@Column(name = "PROXIMITY_MONITORING_FLAG")
	private String proximityMonitoringEnabled;
	@Column(name = "DEVICE_TIMEZONE")
	private String timeZone;
	@Column(name = "LATITUDE")
	private String geoLatitude;
	@Column(name = "LONGITUDE")
	private String geoLongitude;
	@Column(name = "IP_ADDRESS")
	private String ipAddress;
	@Column(name = "CONNECTION_MODE")
	private String connectionMode;
	@Column(name = "JAIL_BROKEN_ROOTED_FLAG")
	private String jailBrokenRooted;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "WIFI_STATION_NAME")
	private String wifiStationName;
	@Column(name = "WIFI_BBSID")
	private String wifiBBSID;
	@Column(name = "WIFI_SIGNAL_STRENGTH")
	private String wifiSignalStrength;
	@Column(name = "CELL_TOWER_ID")
	private String cellTowerID;
	@Column(name = "LOCATION_AREA_CODE")
	private String locationAreaCode;
	@Column(name = "MCC")
	private String mcc;
	@Column(name = "MNC")
	private String mnc;
	@Column(name = "GSM_SIGNAL_STRENGTH")
	private String gSMsignalStrength;
	@Column(name = "APP_VERSION_ID")
	private String appVersionId;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
 
 
	
	 
	
	
	

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDualSim() {
		return dualSim;
	}

	public void setDualSim(String dualSim) {
		this.dualSim = dualSim;
	}

	public String getActiveSIM() {
		return activeSIM;
	}

	public void setActiveSIM(String activeSIM) {
		this.activeSIM = activeSIM;
	}

	public String getNwProviderLine1() {
		return nwProviderLine1;
	}

	public void setNwProviderLine1(String nwProviderLine1) {
		this.nwProviderLine1 = nwProviderLine1;
	}

	public String getNwProviderLine2() {
		return nwProviderLine2;
	}

	public void setNwProviderLine2(String nwProviderLine2) {
		this.nwProviderLine2 = nwProviderLine2;
	}

	public String getNetworkTypeLine1() {
		return networkTypeLine1;
	}

	public void setNetworkTypeLine1(String networkTypeLine1) {
		this.networkTypeLine1 = networkTypeLine1;
	}

	public String getNetworkTypeLine2() {
		return networkTypeLine2;
	}

	public void setNetworkTypeLine2(String networkTypeLine2) {
		this.networkTypeLine2 = networkTypeLine2;
	}

	public String getPhoneNoLine1() {
		return phoneNoLine1;
	}

	public void setPhoneNoLine1(String phoneNoLine1) {
		this.phoneNoLine1 = phoneNoLine1;
	}

	public String getPhoneNoLine2() {
		return phoneNoLine2;
	}

	public void setPhoneNoLine2(String phoneNoLine2) {
		this.phoneNoLine2 = phoneNoLine2;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getTouchIdStatus() {
		return touchIdStatus;
	}

	public void setTouchIdStatus(String touchIdStatus) {
		this.touchIdStatus = touchIdStatus;
	}

	public String getDeviceModelNo() {
		return deviceModelNo;
	}

	public void setDeviceModelNo(String deviceModelNo) {
		this.deviceModelNo = deviceModelNo;
	}

	public String getDeviceManufacturer() {
		return deviceManufacturer;
	}

	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}

	public String getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(String batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMultitaskingSupport() {
		return multitaskingSupport;
	}

	public void setMultitaskingSupport(String multitaskingSupport) {
		this.multitaskingSupport = multitaskingSupport;
	}

	public String getProximityMonitoringEnabled() {
		return proximityMonitoringEnabled;
	}

	public void setProximityMonitoringEnabled(String proximityMonitoringEnabled) {
		this.proximityMonitoringEnabled = proximityMonitoringEnabled;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getGeoLatitude() {
		return geoLatitude;
	}

	public void setGeoLatitude(String geoLatitude) {
		this.geoLatitude = geoLatitude;
	}

	public String getGeoLongitude() {
		return geoLongitude;
	}

	public void setGeoLongitude(String geoLongitude) {
		this.geoLongitude = geoLongitude;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getConnectionMode() {
		return connectionMode;
	}

	public void setConnectionMode(String connectionMode) {
		this.connectionMode = connectionMode;
	}

	public String getJailBrokenRooted() {
		return jailBrokenRooted;
	}

	public void setJailBrokenRooted(String jailBrokenRooted) {
		this.jailBrokenRooted = jailBrokenRooted;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWifiStationName() {
		return wifiStationName;
	}

	public void setWifiStationName(String wifiStationName) {
		this.wifiStationName = wifiStationName;
	}

	public String getWifiBBSID() {
		return wifiBBSID;
	}

	public void setWifiBBSID(String wifiBBSID) {
		this.wifiBBSID = wifiBBSID;
	}

	public String getWifiSignalStrength() {
		return wifiSignalStrength;
	}

	public void setWifiSignalStrength(String wifiSignalStrength) {
		this.wifiSignalStrength = wifiSignalStrength;
	}

	public String getCellTowerID() {
		return cellTowerID;
	}

	public void setCellTowerID(String cellTowerID) {
		this.cellTowerID = cellTowerID;
	}

	public String getLocationAreaCode() {
		return locationAreaCode;
	}

	public void setLocationAreaCode(String locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMnc() {
		return mnc;
	}

	public void setMnc(String mnc) {
		this.mnc = mnc;
	}

	public String getgSMsignalStrength() {
		return gSMsignalStrength;
	}

	public void setgSMsignalStrength(String gSMsignalStrength) {
		this.gSMsignalStrength = gSMsignalStrength;
	}

	public String getAppVersionId() {
		return appVersionId;
	}

	public void setAppVersionId(String appVersionId) {
		this.appVersionId = appVersionId;
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

}
