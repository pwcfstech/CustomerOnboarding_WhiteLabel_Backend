package com.afrAsia.service.impl;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.jpa.AppVersionJpaDAO;
import com.afrAsia.entities.jpa.AppVersion;
import com.afrAsia.entities.jpa.DeviceFootPrint;
import com.afrAsia.service.AppVersionService;

public class AppVersionServiceImpl implements AppVersionService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private AppVersionJpaDAO appVersionDAO;

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
		infoLog.info("deviceFootPrint is stored in DB, AppVersionServiceImpl");
		return appVersionDAO.storeDeviceFootPrint(deviceFootPrint);
	}
	
	
	public DeviceFootPrint getDeviceFootPrint(String deviceId) {
		return appVersionDAO.getDeviceFootPrint(deviceId);
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public DeviceFootPrint updateDeviceFootPrint(DeviceFootPrint deviceFootPrint) {
		infoLog.info("deviceFootPrint is updated in DB, AppVersionServiceImpl");
		return appVersionDAO.updateDeviceFootPrint(deviceFootPrint);
	}

}
