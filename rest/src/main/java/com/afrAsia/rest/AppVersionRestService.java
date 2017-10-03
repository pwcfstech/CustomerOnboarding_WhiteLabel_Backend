package com.afrAsia.rest;

import java.io.InputStream;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.CommonUtils;
import com.afrAsia.entities.jpa.AppVersion;
import com.afrAsia.entities.jpa.DeviceFootPrint;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.request.DeviceFootPrintReq;
import com.afrAsia.entities.response.DeviceFootPrintResponse;
import com.afrAsia.entities.response.DeviceFootPrintResponse.Data;
import com.afrAsia.service.AppVersionService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component

@Path("{version}")
public class AppVersionRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private AppVersionService appVersionService;

	public AppVersionService getAppVersionService() {
		return appVersionService;
	}

	public void setAppVersionService(AppVersionService appVersionService) {
		this.appVersionService = appVersionService;
	}

	@POST
	@Path("/appversion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAppversion(InputStream request) {
		
		infoLog.info("Entered in appversion Service");
		debugLog.debug(" request of appversion Service :: "+request);
		DeviceFootPrintReq deviceFootPrintReq=null;
		try{
			 deviceFootPrintReq= new ObjectMapper().readValue(request, DeviceFootPrintReq.class);
		}catch(Exception e){
			errorLog.error(" Exception for deviceFootPrintReq  is :",e);
			//AfrAsiaLogger.errorLog("error :", e);
		}
		DeviceFootPrintResponse deviceFootPrintResponse= new DeviceFootPrintResponse();
		Data data= new DeviceFootPrintResponse().new Data();
		//AfrAsiaLogger.debugLog(""+deviceFootPrintReq.toString());
		debugLog.debug("deviceFootPrintReq : "+deviceFootPrintReq.toString());
		
		try{
			if (validateRequest(deviceFootPrintReq)) {
				
				String deviceId = deviceFootPrintReq.getData().getDeviceId();
				debugLog.debug("deviceId :: "+deviceId);
				DeviceFootPrint deviceFootPrint = null;
				try{
					deviceFootPrint = appVersionService.getDeviceFootPrint(deviceId);
				}catch(Exception e){
					errorLog.error(" Exception for deviceFootPrint  is :",e);
				}
				if (deviceFootPrint == null) {
					deviceFootPrint = new DeviceFootPrint();
					createDeviceFootPrintModel(deviceFootPrintReq, deviceFootPrint);
					deviceFootPrint.setCreatedBy("Admin");
					deviceFootPrint.setCreatedDate(new Date());
					appVersionService.createUpdateDeviceFootPrint(deviceFootPrint);
				} else {
					createDeviceFootPrintModel(deviceFootPrintReq, deviceFootPrint);
					appVersionService.updateDeviceFootPrint(deviceFootPrint);
				}
				AppVersion appVersion = appVersionService.getAppVersionDetails(deviceFootPrintReq.getData().getOsName(),
						deviceFootPrintReq.getData().getAppVersionId());
				if (appVersion!=null && "L".equalsIgnoreCase(appVersion.getStatus())) {
					data.setAppVersionStatus("L");
					data.setActiveVersionNo(appVersion.getAppVersionId().getAppVersionId());
					data.setAppDownloadLink("null");
					
					data.setGracePeriod("null");
					data.setNewVersionDescription("null");
					deviceFootPrintResponse.setData(data);
					
				}else{
					AppVersion latestAppVersion = appVersionService
							.getLatestVersion(deviceFootPrintReq.getData().getOsName());
					debugLog.debug("latestAppVersion :: "+latestAppVersion);
					Date releaseDate = latestAppVersion.getReleaseDate();
					Integer gracePeriod = latestAppVersion.getGracePeriod();
					Integer actualGrace = gracePeriod;
					if (gracePeriod != null) {
						Date graceDate = CommonUtils.addDay(releaseDate, gracePeriod);
						Date sysdate = new Date();
						Long diff = (graceDate.getTime() - sysdate.getTime());
						actualGrace = (int) (diff / (1000l * 60L * 60L * 24L));
						if (actualGrace <= 0) {
							actualGrace = 0;
							errorLog.error("PLEASE UPDATE YOUR APP TO LOGIN");
							data.setAppUpgradeMessage("PLEASE UPDATE YOUR APP TO LOGIN");
						} else {
							infoLog.info("New APP IS AVAILABLE");
							data.setAppUpgradeMessage("New APP IS AVAILABLE");
						}
					} else {
						infoLog.info("New APP IS AVAILABLE");
						data.setAppUpgradeMessage("New APP IS AVAILABLE");
					}
					data.setActiveVersionNo(latestAppVersion.getAppVersionId().getAppVersionId());
					data.setAppDownloadLink(latestAppVersion.getDownloadUrl());
					data.setAppVersionStatus("D");
					data.setGracePeriod(CommonUtils.objToString(actualGrace));
					data.setNewVersionDescription(latestAppVersion.getVersionDesc());
					deviceFootPrintResponse.setData(data);
					
				}
			}
			else{
				/*MsgHeader msgHeader= new MsgHeader();
				com.afrAsia.entities.MsgHeader.Error error = new MsgHeader().new Error();
				error.setCd("404");
				error.setRsn("invaild Request");
				msgHeader.setError(error);*/
			}
		}catch(Exception e){
			errorLog.error("Exception  is :",e);
		}
		//AppVersion appVersion = appVersionService.getLatestVersion("Android");
		errorLog.error("Exit from app version service :");
		debugLog.debug(" deviceFootPrintResponse  is : "+deviceFootPrintResponse);
		return Response.ok(deviceFootPrintResponse, MediaType.APPLICATION_JSON).build();

	}
	
	private DeviceFootPrint createDeviceFootPrintModel(DeviceFootPrintReq deviceFootPrintReq,
			DeviceFootPrint deviceFootPrint) {
		
		deviceFootPrint.setDeviceId(deviceFootPrintReq.getData().getDeviceId());
		deviceFootPrint.setDeviceName(deviceFootPrintReq.getData().getDeviceName());
		deviceFootPrint.setDualSim(CommonUtils.dbEqBoolean(deviceFootPrintReq.getData().getDualSim()));
		deviceFootPrint.setActiveSIM(deviceFootPrintReq.getData().getActiveSIM());
		deviceFootPrint.setNwProviderLine1(deviceFootPrintReq.getData().getNwProviderLine1());
		deviceFootPrint.setNwProviderLine2(deviceFootPrintReq.getData().getNwProviderLine2());
		deviceFootPrint.setNetworkTypeLine1(deviceFootPrintReq.getData().getNetworkTypeLine1());
		deviceFootPrint.setNetworkTypeLine2(deviceFootPrintReq.getData().getNetworkTypeLine2());
		deviceFootPrint.setPhoneNoLine1(deviceFootPrintReq.getData().getPhoneNoLine1());
		deviceFootPrint.setPhoneNoLine2(deviceFootPrintReq.getData().getPhoneNoLine2());
		deviceFootPrint.setOsName(deviceFootPrintReq.getData().getOsName());
		deviceFootPrint.setOsVersion(deviceFootPrintReq.getData().getOsVersion());
		deviceFootPrint.setDeviceModelNo(deviceFootPrintReq.getData().getDeviceModelNo());
		deviceFootPrint.setDeviceManufacturer(deviceFootPrintReq.getData().getDeviceManufacturer());
		deviceFootPrint.setBatteryLevel(deviceFootPrintReq.getData().getBatteryLevel());
		deviceFootPrint.setLanguage(deviceFootPrintReq.getData().getLanguage());
		deviceFootPrint.setCountry(deviceFootPrintReq.getData().getCountry());
		deviceFootPrint
				.setMultitaskingSupport(CommonUtils.dbEqBoolean(deviceFootPrintReq.getData().getMultitaskingSupport()));
		deviceFootPrint.setProximityMonitoringEnabled(
				CommonUtils.dbEqBoolean(deviceFootPrintReq.getData().getProximityMonitoringEnabled()));
		deviceFootPrint.setTimeZone(deviceFootPrintReq.getData().getTimeZone());
		deviceFootPrint.setGeoLatitude(deviceFootPrintReq.getData().getGeoLatitude());
		deviceFootPrint.setGeoLongitude(deviceFootPrintReq.getData().getGeoLongitude());
		deviceFootPrint.setIpAddress(deviceFootPrintReq.getData().getIpAddress());
		deviceFootPrint
				.setJailBrokenRooted(CommonUtils.dbEqBoolean(deviceFootPrintReq.getData().getJailBrokenRooted()));
		deviceFootPrint.setEmailId(deviceFootPrintReq.getData().getEmailId());
		deviceFootPrint.setWifiStationName(deviceFootPrintReq.getData().getWifiStationName());
		deviceFootPrint.setWifiBBSID(deviceFootPrintReq.getData().getWifiBBSID());
		deviceFootPrint.setWifiSignalStrength(deviceFootPrintReq.getData().getWifiSignalStrength());
		deviceFootPrint.setCellTowerID(deviceFootPrintReq.getData().getCellTowerID());
		deviceFootPrint.setConnectionMode(deviceFootPrintReq.getData().getConnectionMode());
		deviceFootPrint.setTouchIdStatus(CommonUtils.dbEqBoolean(deviceFootPrintReq.getData().getTouchIdStatus()));
		deviceFootPrint.setLocationAreaCode(deviceFootPrintReq.getData().getLocationAreaCode());
		deviceFootPrint.setMcc(deviceFootPrintReq.getData().getMcc());
		deviceFootPrint.setMnc(deviceFootPrintReq.getData().getMnc());
		deviceFootPrint.setgSMsignalStrength(deviceFootPrintReq.getData().getgSMsignalStrength());
		deviceFootPrint.setAppVersionId(deviceFootPrintReq.getData().getAppVersionId());
		deviceFootPrint.setModifiedBy("Admin");
		deviceFootPrint.setModifiedDate(new Date());
		debugLog.debug("deviceFootPrint in createDeviceFootPrintModel(),AppVersionRestService is : "+deviceFootPrint);
		return deviceFootPrint;
	}
	private boolean validateRequest(DeviceFootPrintReq deviceFootPrintReq) {
		if (deviceFootPrintReq != null && deviceFootPrintReq.getData() != null
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getDeviceId())
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getOsName())
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getOsVersion())
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getOsName())
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getDeviceModelNo())
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getDeviceManufacturer())
				&& CommonUtils.checkNullorBlank(deviceFootPrintReq.getData().getConnectionMode())) {
			infoLog.info("validateRequest() returning true");
			return true;
		} else {
			errorLog.error("validateRequest() returning false");
			return false;
		}
	}
}
