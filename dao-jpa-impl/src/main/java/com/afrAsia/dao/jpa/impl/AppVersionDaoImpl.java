package com.afrAsia.dao.jpa.impl;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AppVersionJpaDAO;
import com.afrAsia.entities.jpa.AppVersion;
import com.afrAsia.entities.jpa.DeviceFootPrint;

public class AppVersionDaoImpl extends BaseJpaDAOImpl<String, AppVersion> implements AppVersionJpaDAO {

	public AppVersion getAppVersionDetails(String platform, String appVersion) {
		
		String queryString = "SELECT s FROM AppVersion s where s.appVersionId.platform = :platform and s.appVersionId.appVersionId=:appVersion";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("platform", platform);
		query.setParameter("appVersion", appVersion);
		
		//query.setCacheable(true);
		return (AppVersion) query.getSingleResult();
	}
	
public AppVersion getLatestVersion(String platform) {
		
	System.out.println("here in JPADAO");
		String queryString = "SELECT s FROM AppVersion s where s.appVersionId.platform = :platform and s.status=:status";
		Query query = getEntityManager().createQuery(queryString);
		
		query.setParameter("platform", platform);
		query.setParameter("status", "L");
		
		//query.setCacheable(true);
		return (AppVersion) query.getSingleResult();
	}

public DeviceFootPrint storeDeviceFootPrint(DeviceFootPrint deviceFootPrint) {
	
	getEntityManager().persist(deviceFootPrint);
	getEntityManager().flush();
	return deviceFootPrint;
}

public DeviceFootPrint getDeviceFootPrint(String deviceId) {
	String queryString = "SELECT s FROM DeviceFootPrint s where s.deviceId = :deviceId";
	Query query = getEntityManager().createQuery(queryString);
	query.setParameter("deviceId", deviceId);
	//query.setCacheable(true);
	return (DeviceFootPrint) query.getSingleResult();
}

public DeviceFootPrint updateDeviceFootPrint(DeviceFootPrint deviceFootPrint) {
	getEntityManager().merge(deviceFootPrint);
	getEntityManager().flush();
	return deviceFootPrint;
}



}
