package com.afrAsia.entities.request;

import java.io.Serializable;

public class DeviceFootPrintReq implements Serializable {
	private DeviceFootPrintReq.Data data;

	public DeviceFootPrintReq.Data getData() {
		return data;
	}

	public void setData(DeviceFootPrintReq.Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ClassPojo [data = " + data + "]";
	}
	
	public static class Data implements Serializable {
		
		private static final long serialVersionUID = -6145838904264249027L;

		private String deviceId;
		private String deviceName;
		private Boolean dualSim;
		private String activeSIM;
		private String nwProviderLine1;
		private String nwProviderLine2;
		private String networkTypeLine1;
		private String networkTypeLine2;
	
		private String phoneNoLine1;
	
		private String phoneNoLine2;
		
		private String osName;
		
		private String osVersion;
		
		private Boolean touchIdStatus;
		
		private String deviceModelNo;
	
		private String deviceManufacturer;
		
		private String batteryLevel;
		
		private String language;
		
		private String country;
		
		private Boolean multitaskingSupport;
		
		private Boolean proximityMonitoringEnabled;
		
		private String timeZone;
		
		private String geoLatitude;
		
		private String geoLongitude;
		
		private String ipAddress;
		
		private String connectionMode;
		
		private Boolean jailBrokenRooted;
		
		private String emailId;
		
		private String wifiStationName;
		
		private String wifiBBSID;
		
		private String wifiSignalStrength;
		
		private String cellTowerID;
	
		private String locationAreaCode;
		
		private String mcc;
		private String mnc;
		private String gSMsignalStrength;
		private String appVersionId;
		
		private Boolean notificationPermissionFlag;
		
		private String notificationTokenId;

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

		public Boolean getDualSim() {
			return dualSim;
		}

		public void setDualSim(Boolean dualSim) {
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

		public Boolean getTouchIdStatus() {
			return touchIdStatus;
		}

		public void setTouchIdStatus(Boolean touchIdStatus) {
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

		public Boolean getMultitaskingSupport() {
			return multitaskingSupport;
		}

		public void setMultitaskingSupport(Boolean multitaskingSupport) {
			this.multitaskingSupport = multitaskingSupport;
		}

		public Boolean getProximityMonitoringEnabled() {
			return proximityMonitoringEnabled;
		}

		public void setProximityMonitoringEnabled(Boolean proximityMonitoringEnabled) {
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

		public Boolean getJailBrokenRooted() {
			return jailBrokenRooted;
		}

		public void setJailBrokenRooted(Boolean jailBrokenRooted) {
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

		public Boolean getNotificationPermissionFlag() {
			return notificationPermissionFlag;
		}

		public void setNotificationPermissionFlag(Boolean notificationPermissionFlag) {
			this.notificationPermissionFlag = notificationPermissionFlag;
		}

		public String getNotificationTokenId() {
			return notificationTokenId;
		}

		public void setNotificationTokenId(String notificationTokenId) {
			this.notificationTokenId = notificationTokenId;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Data [deviceId=" + deviceId + ", deviceName=" + deviceName + ", dualSim=" + dualSim + ", activeSIM="
					+ activeSIM + ", nwProviderLine1=" + nwProviderLine1 + ", nwProviderLine2=" + nwProviderLine2
					+ ", networkTypeLine1=" + networkTypeLine1 + ", networkTypeLine2=" + networkTypeLine2
					+ ", phoneNoLine1=" + phoneNoLine1 + ", phoneNoLine2=" + phoneNoLine2 + ", osName=" + osName
					+ ", osVersion=" + osVersion + ", touchIdStatus=" + touchIdStatus + ", deviceModelNo="
					+ deviceModelNo + ", deviceManufacturer=" + deviceManufacturer + ", batteryLevel=" + batteryLevel
					+ ", language=" + language + ", country=" + country + ", multitaskingSupport=" + multitaskingSupport
					+ ", proximityMonitoringEnabled=" + proximityMonitoringEnabled + ", timeZone=" + timeZone
					+ ", geoLatitude=" + geoLatitude + ", geoLongitude=" + geoLongitude + ", ipAddress=" + ipAddress
					+ ", connectionMode=" + connectionMode + ", jailBrokenRooted=" + jailBrokenRooted + ", emailId="
					+ emailId + ", wifiStationName=" + wifiStationName + ", wifiBBSID=" + wifiBBSID
					+ ", wifiSignalStrength=" + wifiSignalStrength + ", cellTowerID=" + cellTowerID
					+ ", locationAreaCode=" + locationAreaCode + ", mcc=" + mcc + ", mnc=" + mnc
					+ ", gSMsignalStrength=" + gSMsignalStrength + ", appVersionId=" + appVersionId
					+ ", notificationPermissionFlag=" + notificationPermissionFlag + ", notificationTokenId="
					+ notificationTokenId + "]";
		}
		
	}
		
}
