package com.afrAsia.service.impl;




import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.jpa.AppVersionJpaDAO;

import com.afrAsia.entities.AppVersion;
import com.afrAsia.entities.DeviceFootPrint;
import com.afrAsia.service.AppVersionService;

public class AppVersionServiceImpl implements AppVersionService {
	
	
	AppVersionJpaDAO appVersionDAO;
	
	

	public AppVersionJpaDAO getAppVersionDAO() {
		return appVersionDAO;
	}

	public void setAppVersionDAO(AppVersionJpaDAO appVersionDAO) {
		this.appVersionDAO = appVersionDAO;
	}

	public AppVersion getAppVersionDetails(String platform, String appVersion) {
		System.out.println("here in  Service");
		return appVersionDAO.getAppVersionDetails(platform, appVersion);
	}

	public AppVersion getLatestVersion(String platform) {
		
		 return appVersionDAO.getLatestVersion(platform);
	}
	
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public DeviceFootPrint createUpdateDeviceFootPrint(DeviceFootPrint deviceFootPrint) {
		// TODO Auto-generated method stub
		return appVersionDAO.storeDeviceFootPrint(deviceFootPrint);
	}
	
	
	public DeviceFootPrint getDeviceFootPrint(String deviceId) {
		// TODO Auto-generated method stub
		return appVersionDAO.getDeviceFootPrint(deviceId);
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public DeviceFootPrint updateDeviceFootPrint(DeviceFootPrint deviceFootPrint) {
		// TODO Auto-generated method stub
		return appVersionDAO.updateDeviceFootPrint(deviceFootPrint);
	}

}
