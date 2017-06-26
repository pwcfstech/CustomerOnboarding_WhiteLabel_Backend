package com.afrAsia.service;

import com.afrAsia.entities.AppVersion;
import com.afrAsia.entities.DeviceFootPrint;

public interface AppVersionService {
	public AppVersion getAppVersionDetails(String platform,String appVersion);
	public AppVersion getLatestVersion(String platform);
	public DeviceFootPrint createUpdateDeviceFootPrint(DeviceFootPrint deviceFootPrint);
	public DeviceFootPrint getDeviceFootPrint(String deviceId);

	public DeviceFootPrint updateDeviceFootPrint(DeviceFootPrint deviceFootPrint);
}
