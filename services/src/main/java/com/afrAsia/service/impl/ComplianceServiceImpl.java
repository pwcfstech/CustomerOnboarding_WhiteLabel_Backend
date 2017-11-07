package com.afrAsia.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.afrAsia.dao.jpa.ComplianceJpaDao;
import com.afrAsia.entities.response.ComplianceApps;
import com.afrAsia.entities.response.ComplianceApps.AccountsCreated;
import com.afrAsia.entities.response.ComplianceApps.AccountsRejected;
import com.afrAsia.entities.response.ComplianceApps.ApplicationsUnderProcessing;
import com.afrAsia.entities.response.ComplianceResponse;
import com.afrAsia.service.ComplianceService;

public class ComplianceServiceImpl implements ComplianceService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private ComplianceJpaDao complianceDao;

	public ComplianceJpaDao getComplianceDao() {
		return complianceDao;
	}

	public void setComplianceDao(ComplianceJpaDao complianceDao) {
		this.complianceDao = complianceDao;
	}

	public ComplianceResponse getDetailsByDefault() {

		ComplianceResponse complianceResponse = new ComplianceResponse();

		ComplianceApps complianceApps = new ComplianceApps();

		List<Object> detailsByAccountRejected = new ArrayList<Object>();

		List<Object> detailsByAccountOpened = new ArrayList<Object>();

		List<Object> detailsByUnderProcessing = new ArrayList<Object>();

		List<Object> detailsByUnderProcessingMobCheck = new ArrayList<Object>();

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobCheck = new ArrayList<ApplicationsUnderProcessing>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobFinal = new ArrayList<ApplicationsUnderProcessing>();

		detailsByAccountRejected = (List<Object>) complianceDao.getDetailsByAccountRejectedDefault();

		for (Object object : detailsByAccountRejected) {

			ComplianceApps.AccountsRejected accountsRejected = complianceApps.new AccountsRejected();

			Object[] outputs = (Object[]) object;

			accountsRejected.setRefNo(outputs[0].toString());

			accountsRejected.setRecordId(outputs[1].toString());

			accountsRejected.setRmName(outputs[2].toString());

			accountsRejected.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

			/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[5].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl");
			}*/

			accountsRejected.setAppSubmittedDate((Date) outputs[5]);

			listAccountsRejected.add(accountsRejected);
			complianceApps.setAccountsRejected(listAccountsRejected);
			complianceResponse.setData(complianceApps);
		}

		detailsByAccountOpened = (List<Object>) complianceDao.getDetailsByAccountOpenedDefault();

		for (Object object : detailsByAccountOpened) {

			ComplianceApps.AccountsCreated accountsCreated = complianceApps.new AccountsCreated();

			Object[] outputs = (Object[]) object;

			accountsCreated.setRefNo(outputs[0].toString());

			accountsCreated.setRecordId(outputs[1].toString());

			accountsCreated.setRmName(outputs[2].toString());

			accountsCreated.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

			if (outputs[5] != null)
				accountsCreated.setAccountNumber(outputs[5].toString());

			/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[6].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
			}*/

			accountsCreated.setAppSubmittedDate((Date) outputs[6]);

			listAccountsCreated.add(accountsCreated);
			complianceApps.setAccountsCreated(listAccountsCreated);
			complianceResponse.setData(complianceApps);
		}

		int k = 0;
		
		detailsByUnderProcessing = (List<Object>) complianceDao.getDetailsByUnderProcessingDefault();

		for (Object object : detailsByUnderProcessing) {
			ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();
			Object[] outputs = (Object[]) object;

			applicationsUnderProcessing.setRefNo(outputs[0].toString());

			applicationsUnderProcessing.setRecordId(outputs[1].toString());

			applicationsUnderProcessing.setRmName(outputs[2].toString());

			applicationsUnderProcessing.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

			/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[5].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
			}*/

			applicationsUnderProcessing.setAppSubmittedDate((Date) outputs[5]);
			applicationsUnderProcessing.setAppStatus(outputs[6].toString());

			listApplicationsUnderProcessing.add(applicationsUnderProcessing);	
		}
		
		
		detailsByUnderProcessingMobCheck = complianceDao.getDetailsByUnderProcessingDefaultMobCheck();

		for (Object objectMobCheck : detailsByUnderProcessingMobCheck) {
			ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing2 = complianceApps.new ApplicationsUnderProcessing();
			Object[] outputsMobCheck = (Object[]) objectMobCheck;

			applicationsUnderProcessing2.setRefNo(outputsMobCheck[0].toString());


			if (outputsMobCheck[1] != null)
					applicationsUnderProcessing2.setIsAppLocked(outputsMobCheck[1].toString());

			if (outputsMobCheck[2] != null)
					applicationsUnderProcessing2.setLockedBy(outputsMobCheck[2].toString());

			if (outputsMobCheck[3] != null)
					applicationsUnderProcessing2.setIsKycDone(outputsMobCheck[3].toString());

				if (outputsMobCheck[4] != null)
					applicationsUnderProcessing2.setKycStatus(outputsMobCheck[4].toString());

				if (outputsMobCheck[5] != null)
					applicationsUnderProcessing2.setKycUrl(outputsMobCheck[5].toString());

				if (outputsMobCheck[6] != null)
					applicationsUnderProcessing2.setKycDoneBy(outputsMobCheck[6].toString());

				/*SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

				String dateKYCUnderProcessing = null;*/
				if (outputsMobCheck[7] != null) {
					/*dateKYCUnderProcessing = outputsMobCheck[7].toString();

					Date dateKYC = new Date();
					try {
						dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("dateKYC coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
								e);
					}*/
					applicationsUnderProcessing2.setKycDate((Date) outputsMobCheck[7]);
				}

				if (outputsMobCheck[8] != null)
					applicationsUnderProcessing2.setIsWcDone(outputsMobCheck[8].toString());

				if (outputsMobCheck[10] != null)
					applicationsUnderProcessing2.setWcUrl(outputsMobCheck[10].toString());

				if (outputsMobCheck[9] != null)
					applicationsUnderProcessing2.setWcStatus(outputsMobCheck[9].toString());

				if (outputsMobCheck[11] != null)
					applicationsUnderProcessing2.setWcDoneBy(outputsMobCheck[11].toString());

				String dateWCUnderProcessing = null;
				if (outputsMobCheck[12] != null) {
					/*dateWCUnderProcessing = outputsMobCheck[12].toString();

					Date wcDate = new Date();
					try {
						wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("wcDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
								e);
					}*/
					applicationsUnderProcessing2.setWcDate((Date) outputsMobCheck[12]);
				}

				if (outputsMobCheck[13] != null)
					applicationsUnderProcessing2.setIsCcDone(outputsMobCheck[13].toString());

				if (outputsMobCheck[15] != null)
					applicationsUnderProcessing2.setCcUrl(outputsMobCheck[15].toString());

				if (outputsMobCheck[14] != null)
					applicationsUnderProcessing2.setCcStatus(outputsMobCheck[14].toString());

				if (outputsMobCheck[16] != null)
					applicationsUnderProcessing2.setCcDoneBy(outputsMobCheck[16].toString());

				String dateCCUnderProcessing = null;
				if (outputsMobCheck[17] != null) {
					/*dateCCUnderProcessing = outputsMobCheck[17].toString();

					Date ccDate = new Date();
					try {
						ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("ccDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
								e);
					}*/
					applicationsUnderProcessing2.setCcDate((Date) outputsMobCheck[17]);
				}

				if (outputsMobCheck[18] != null)
					applicationsUnderProcessing2.setIsIcDone(outputsMobCheck[18].toString());

				if (outputsMobCheck[20] != null)
					applicationsUnderProcessing2.setIcUrl(outputsMobCheck[20].toString());

				if (outputsMobCheck[19] != null)
					applicationsUnderProcessing2.setIcStatus(outputsMobCheck[19].toString());

				if (outputsMobCheck[21] != null)
					applicationsUnderProcessing2.setIcDoneBy(outputsMobCheck[21].toString());

				String dateICUnderProcessing = null;
				if (outputsMobCheck[22] != null) {
					/*dateICUnderProcessing = outputsMobCheck[22].toString();

					Date icDate = new Date();
					try {
						icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("icDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
								e);
					}*/

					applicationsUnderProcessing2.setIcDate((Date) outputsMobCheck[22]);
				}
				listApplicationsUnderProcessingMobCheck.add(applicationsUnderProcessing2);
			}

		List<String> matchedValues = new ArrayList<String>();
		
		for(ApplicationsUnderProcessing applicationsUnderPrcsMob : listApplicationsUnderProcessingMobCheck){
			
			for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
				
				if(StringUtils.trim(applicationsUnderPrcsMob.getRefNo()).equals(StringUtils.trim(applicationsUnderPrcs.getRefNo()))){
					ApplicationsUnderProcessing finalApplicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();	
					finalApplicationsUnderProcessing.setRefNo(applicationsUnderPrcs.getRefNo());
					finalApplicationsUnderProcessing.setRecordId(applicationsUnderPrcs.getRecordId());
					finalApplicationsUnderProcessing.setAppStatus(applicationsUnderPrcs.getAppStatus());
					finalApplicationsUnderProcessing.setAppSubmittedDate(applicationsUnderPrcs.getAppSubmittedDate());
					finalApplicationsUnderProcessing.setCustomerName(applicationsUnderPrcs.getCustomerName());
					finalApplicationsUnderProcessing.setRmName(applicationsUnderPrcs.getRmName());
					finalApplicationsUnderProcessing.setIsAppLocked(applicationsUnderPrcsMob.getIsAppLocked());
					finalApplicationsUnderProcessing.setLockedBy(applicationsUnderPrcsMob.getLockedBy());

					finalApplicationsUnderProcessing.setIsKycDone(applicationsUnderPrcsMob.getIsKycDone());

					finalApplicationsUnderProcessing.setKycStatus(applicationsUnderPrcsMob.getKycStatus());

					finalApplicationsUnderProcessing.setKycUrl(applicationsUnderPrcsMob.getKycUrl());

					finalApplicationsUnderProcessing.setKycDoneBy(applicationsUnderPrcsMob.getKycDoneBy());

					finalApplicationsUnderProcessing.setKycDate(applicationsUnderPrcsMob.getKycDate());
					finalApplicationsUnderProcessing.setIsWcDone(applicationsUnderPrcsMob.getIsWcDone());

					finalApplicationsUnderProcessing.setWcUrl(applicationsUnderPrcsMob.getWcUrl());

					
					finalApplicationsUnderProcessing.setWcStatus(applicationsUnderPrcsMob.getWcStatus());

					finalApplicationsUnderProcessing.setWcDoneBy(applicationsUnderPrcsMob.getWcDoneBy());

					finalApplicationsUnderProcessing.setWcDate(applicationsUnderPrcsMob.getWcDate());

					finalApplicationsUnderProcessing.setIsCcDone(applicationsUnderPrcsMob.getIsCcDone());

					finalApplicationsUnderProcessing.setCcUrl(applicationsUnderPrcsMob.getCcUrl());

					finalApplicationsUnderProcessing.setCcStatus(applicationsUnderPrcsMob.getCcStatus());

					finalApplicationsUnderProcessing.setCcDoneBy(applicationsUnderPrcsMob.getCcDoneBy());

					finalApplicationsUnderProcessing.setCcDate(applicationsUnderPrcsMob.getCcDate());

					finalApplicationsUnderProcessing.setIsIcDone(applicationsUnderPrcsMob.getIsIcDone());

					finalApplicationsUnderProcessing.setIcUrl(applicationsUnderPrcsMob.getIcUrl());

					finalApplicationsUnderProcessing.setIcStatus(applicationsUnderPrcsMob.getIcStatus());

					finalApplicationsUnderProcessing.setIcDoneBy(applicationsUnderPrcsMob.getIcDoneBy());

					finalApplicationsUnderProcessing.setIcDate(applicationsUnderPrcsMob.getIcDate());
					
					listApplicationsUnderProcessingMobFinal.add(finalApplicationsUnderProcessing);
					matchedValues.add(finalApplicationsUnderProcessing.getRefNo());
					Collections.sort(listApplicationsUnderProcessingMobFinal);
					complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
					complianceResponse.setData(complianceApps);
				}
			}
		}
		
		for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
			
			if(!matchedValues.contains(applicationsUnderPrcs.getRefNo())){
				listApplicationsUnderProcessingMobFinal.add(applicationsUnderPrcs);
				Collections.sort(listApplicationsUnderProcessingMobFinal);
				complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
				complianceResponse.setData(complianceApps);
			}
		}
		debugLog.debug("complianceResponse : " + complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByName(String name, String appStatus) {

		ComplianceResponse complianceResponse = new ComplianceResponse();

		ComplianceApps complianceApps = new ComplianceApps();

		List<Object> detailsByAccountRejected = new ArrayList<Object>();

		List<Object> detailsByAccountOpened = new ArrayList<Object>();

		List<Object> detailsByUnderProcessing = new ArrayList<Object>();

		List<Object> detailsByUnderProcessingMobCheck = new ArrayList<Object>();

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobCheck = new ArrayList<ApplicationsUnderProcessing>();
		
		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobFinal = new ArrayList<ApplicationsUnderProcessing>();

		int j = 0;

		if (appStatus.equalsIgnoreCase("ACCOUNT REJECTED")) {
			detailsByAccountRejected = (List<Object>) complianceDao.getDetailsByAccountRejectedName(name);

			for (Object object : detailsByAccountRejected) {

				ComplianceApps.AccountsRejected accountsRejected = complianceApps.new AccountsRejected();

				Object[] outputs = (Object[]) object;

				accountsRejected.setRefNo(outputs[0].toString());

				accountsRejected.setRecordId(outputs[1].toString());

				accountsRejected.setRmName(outputs[2].toString());

				accountsRejected.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByName(),ComplianceServiceImpl");
				}*/

				accountsRejected.setAppSubmittedDate((Date) outputs[5]);
				listAccountsRejected.add(j, accountsRejected);
				j++;
				complianceApps.setAccountsRejected(listAccountsRejected);

			}
		}
		int h = 0;
		if (appStatus.equalsIgnoreCase("ACCOUNT OPENED")) {
			detailsByAccountOpened = (List<Object>) complianceDao.getDetailsByAccountOpenedName(name);

			for (Object object : detailsByAccountOpened) {

				ComplianceApps.AccountsCreated accountsCreated = complianceApps.new AccountsCreated();

				Object[] outputs = (Object[]) object;

				accountsCreated.setRefNo(outputs[0].toString());

				accountsCreated.setRecordId(outputs[1].toString());

				accountsCreated.setRmName(outputs[2].toString());

				accountsCreated.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				try {
					if (outputs[5].toString() != null)
						accountsCreated.setAccountNumber(outputs[5].toString());
					else {
						accountsCreated.setAccountNumber(null);
					}
				} catch (NullPointerException e) {
					errorLog.error("AccountNumber is Null in getDetailsByName(),ComplianceServiceImpl", e);
				}

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[6].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted could not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}*/

				accountsCreated.setAppSubmittedDate((Date) outputs[6]);
				listAccountsCreated.add(h, accountsCreated);
				h++;
				complianceApps.setAccountsCreated(listAccountsCreated);
			}
		}
		int k = 0;
		if (appStatus.equalsIgnoreCase("Under Processing")) {

			detailsByUnderProcessing = (List<Object>) complianceDao.getDetailsByUnderProcessingName(name);

			for (Object object : detailsByUnderProcessing) {
				ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();
				Object[] outputs = (Object[]) object;

				applicationsUnderProcessing.setRefNo(outputs[0].toString());

				applicationsUnderProcessing.setRecordId(outputs[1].toString());

				applicationsUnderProcessing.setRmName(outputs[2].toString());

				applicationsUnderProcessing.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
				}*/

				applicationsUnderProcessing.setAppSubmittedDate((Date) outputs[5]);
				applicationsUnderProcessing.setAppStatus(outputs[6].toString());

				listApplicationsUnderProcessing.add(applicationsUnderProcessing);	
			}
			
			
			detailsByUnderProcessingMobCheck = complianceDao.getDetailsByUnderProcessingNameMobCheck(name);

			for (Object objectMobCheck : detailsByUnderProcessingMobCheck) {
				ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing2 = complianceApps.new ApplicationsUnderProcessing();
				Object[] outputsMobCheck = (Object[]) objectMobCheck;

				applicationsUnderProcessing2.setRefNo(outputsMobCheck[0].toString());


				if (outputsMobCheck[1] != null)
						applicationsUnderProcessing2.setIsAppLocked(outputsMobCheck[1].toString());

				if (outputsMobCheck[2] != null)
						applicationsUnderProcessing2.setLockedBy(outputsMobCheck[2].toString());

				if (outputsMobCheck[3] != null)
						applicationsUnderProcessing2.setIsKycDone(outputsMobCheck[3].toString());

					if (outputsMobCheck[4] != null)
						applicationsUnderProcessing2.setKycStatus(outputsMobCheck[4].toString());

					if (outputsMobCheck[5] != null)
						applicationsUnderProcessing2.setKycUrl(outputsMobCheck[5].toString());

					if (outputsMobCheck[6] != null)
						applicationsUnderProcessing2.setKycDoneBy(outputsMobCheck[6].toString());

					/*SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

					String dateKYCUnderProcessing = null;*/
					if (outputsMobCheck[7] != null) {
						/*dateKYCUnderProcessing = outputsMobCheck[7].toString();

						Date dateKYC = new Date();
						try {
							dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("dateKYC coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setKycDate((Date) outputsMobCheck[7]);
					}

					if (outputsMobCheck[8] != null)
						applicationsUnderProcessing2.setIsWcDone(outputsMobCheck[8].toString());

					if (outputsMobCheck[9] != null)
						applicationsUnderProcessing2.setWcUrl(outputsMobCheck[9].toString());

					if (outputsMobCheck[10] != null)
						applicationsUnderProcessing2.setWcStatus(outputsMobCheck[10].toString());

					if (outputsMobCheck[11] != null)
						applicationsUnderProcessing2.setWcDoneBy(outputsMobCheck[11].toString());

					String dateWCUnderProcessing = null;
					if (outputsMobCheck[12] != null) {
						/*dateWCUnderProcessing = outputsMobCheck[12].toString();

						Date wcDate = new Date();
						try {
							wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("wcDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setWcDate((Date) outputsMobCheck[12]);
					}

					if (outputsMobCheck[13] != null)
						applicationsUnderProcessing2.setIsCcDone(outputsMobCheck[13].toString());

					if (outputsMobCheck[14] != null)
						applicationsUnderProcessing2.setCcUrl(outputsMobCheck[14].toString());

					if (outputsMobCheck[15] != null)
						applicationsUnderProcessing2.setCcStatus(outputsMobCheck[15].toString());

					if (outputsMobCheck[16] != null)
						applicationsUnderProcessing2.setCcDoneBy(outputsMobCheck[16].toString());

					String dateCCUnderProcessing = null;
					if (outputsMobCheck[17] != null) {
						/*dateCCUnderProcessing = outputsMobCheck[17].toString();

						Date ccDate = new Date();
						try {
							ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("ccDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setCcDate((Date) outputsMobCheck[17]);
					}

					if (outputsMobCheck[18] != null)
						applicationsUnderProcessing2.setIsIcDone(outputsMobCheck[18].toString());

					if (outputsMobCheck[19] != null)
						applicationsUnderProcessing2.setIcUrl(outputsMobCheck[19].toString());

					if (outputsMobCheck[20] != null)
						applicationsUnderProcessing2.setIcStatus(outputsMobCheck[20].toString());

					if (outputsMobCheck[21] != null)
						applicationsUnderProcessing2.setIcDoneBy(outputsMobCheck[21].toString());

					String dateICUnderProcessing = null;
					if (outputsMobCheck[22] != null) {
						/*dateICUnderProcessing = outputsMobCheck[22].toString();

						Date icDate = new Date();
						try {
							icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("icDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/

						applicationsUnderProcessing2.setIcDate((Date) outputsMobCheck[22]);
					}
					listApplicationsUnderProcessingMobCheck.add(applicationsUnderProcessing2);
				}

			List<String> matchedValues = new ArrayList<String>();
			
			for(ApplicationsUnderProcessing applicationsUnderPrcsMob : listApplicationsUnderProcessingMobCheck){
				
				for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
					
					if(StringUtils.trim(applicationsUnderPrcsMob.getRefNo()).equals(StringUtils.trim(applicationsUnderPrcs.getRefNo()))){
						ApplicationsUnderProcessing finalApplicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();	
						finalApplicationsUnderProcessing.setRefNo(applicationsUnderPrcs.getRefNo());
						finalApplicationsUnderProcessing.setRecordId(applicationsUnderPrcs.getRecordId());
						finalApplicationsUnderProcessing.setAppStatus(applicationsUnderPrcs.getAppStatus());
						finalApplicationsUnderProcessing.setAppSubmittedDate(applicationsUnderPrcs.getAppSubmittedDate());
						finalApplicationsUnderProcessing.setCustomerName(applicationsUnderPrcs.getCustomerName());
						finalApplicationsUnderProcessing.setRmName(applicationsUnderPrcs.getRmName());
						finalApplicationsUnderProcessing.setIsAppLocked(applicationsUnderPrcsMob.getIsAppLocked());
						finalApplicationsUnderProcessing.setLockedBy(applicationsUnderPrcsMob.getLockedBy());

						finalApplicationsUnderProcessing.setIsKycDone(applicationsUnderPrcsMob.getIsKycDone());

						finalApplicationsUnderProcessing.setKycStatus(applicationsUnderPrcsMob.getKycStatus());

						finalApplicationsUnderProcessing.setKycUrl(applicationsUnderPrcsMob.getKycUrl());

						finalApplicationsUnderProcessing.setKycDoneBy(applicationsUnderPrcsMob.getKycDoneBy());

						finalApplicationsUnderProcessing.setKycDate(applicationsUnderPrcsMob.getKycDate());
						finalApplicationsUnderProcessing.setIsWcDone(applicationsUnderPrcsMob.getIsWcDone());

						finalApplicationsUnderProcessing.setWcUrl(applicationsUnderPrcsMob.getWcUrl());

						
						finalApplicationsUnderProcessing.setWcStatus(applicationsUnderPrcsMob.getWcStatus());

						finalApplicationsUnderProcessing.setWcDoneBy(applicationsUnderPrcsMob.getWcDoneBy());

						finalApplicationsUnderProcessing.setWcDate(applicationsUnderPrcsMob.getWcDate());

						finalApplicationsUnderProcessing.setIsCcDone(applicationsUnderPrcsMob.getIsCcDone());

						finalApplicationsUnderProcessing.setCcUrl(applicationsUnderPrcsMob.getCcUrl());

						finalApplicationsUnderProcessing.setCcStatus(applicationsUnderPrcsMob.getCcStatus());

						finalApplicationsUnderProcessing.setCcDoneBy(applicationsUnderPrcsMob.getCcDoneBy());

						finalApplicationsUnderProcessing.setCcDate(applicationsUnderPrcsMob.getCcDate());

						finalApplicationsUnderProcessing.setIsIcDone(applicationsUnderPrcsMob.getIsIcDone());

						finalApplicationsUnderProcessing.setIcUrl(applicationsUnderPrcsMob.getIcUrl());

						finalApplicationsUnderProcessing.setIcStatus(applicationsUnderPrcsMob.getIcStatus());

						finalApplicationsUnderProcessing.setIcDoneBy(applicationsUnderPrcsMob.getIcDoneBy());

						finalApplicationsUnderProcessing.setIcDate(applicationsUnderPrcsMob.getIcDate());
						
						listApplicationsUnderProcessingMobFinal.add(finalApplicationsUnderProcessing);
						matchedValues.add(finalApplicationsUnderProcessing.getRefNo());
						Collections.sort(listApplicationsUnderProcessingMobFinal);
						complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
						//complianceResponse.setData(complianceApps);
					}
				}
			}
			
			for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
				
				if(!matchedValues.contains(applicationsUnderPrcs.getRefNo())){
					listApplicationsUnderProcessingMobFinal.add(applicationsUnderPrcs);
					Collections.sort(listApplicationsUnderProcessingMobFinal);
					complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
					//complianceResponse.setData(complianceApps);
				}
			}

		}
		complianceResponse.setData(complianceApps);
		debugLog.debug("complianceResponse  : " + complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByDates(Date startDate, Date endDate, String appStatus) {

		ComplianceResponse complianceResponse = new ComplianceResponse();

		ComplianceApps complianceApps = new ComplianceApps();

		List<Object> detailsByAccountRejected = new ArrayList<Object>();

		List<Object> detailsByAccountOpened = new ArrayList<Object>();

		List<Object> detailsByUnderProcessing = new ArrayList<Object>();

		List<Object> detailsByUnderProcessingMobCheck = new ArrayList<Object>();

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobCheck = new ArrayList<ApplicationsUnderProcessing>();
		
		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobFinal = new ArrayList<ApplicationsUnderProcessing>();

		if (appStatus.equalsIgnoreCase("ACCOUNT REJECTED")) {
			detailsByAccountRejected = (List<Object>) complianceDao.getDetailsByAccountRejectedDates(startDate,
					endDate);

			int j = 0;

			for (Object object : detailsByAccountRejected) {

				ComplianceApps.AccountsRejected accountsRejected = complianceApps.new AccountsRejected();

				Object[] outputs = (Object[]) object;

				accountsRejected.setRefNo(outputs[0].toString());

				accountsRejected.setRecordId(outputs[1].toString());

				accountsRejected.setRmName(outputs[2].toString());

				accountsRejected.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDates(),ComplianceServiceImpl");
				}*/

				accountsRejected.setAppSubmittedDate((Date) outputs[5]);

				listAccountsRejected.add(j, accountsRejected);
				j++;
				complianceApps.setAccountsRejected(listAccountsRejected);

			}
		}
		int h = 0;
		if (appStatus.equalsIgnoreCase("ACCOUNT OPENED")) {
			detailsByAccountOpened = (List<Object>) complianceDao.getDetailsByAccountOpenedDates(startDate, endDate);

			for (Object object : detailsByAccountOpened) {

				ComplianceApps.AccountsCreated accountsCreated = complianceApps.new AccountsCreated();

				Object[] outputs = (Object[]) object;

				accountsCreated.setRefNo(outputs[0].toString());

				accountsCreated.setRecordId(outputs[1].toString());

				accountsCreated.setRmName(outputs[2].toString());

				accountsCreated.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				try {
					if (outputs[5].toString() != null)
						accountsCreated.setAccountNumber(outputs[5].toString());
					else {
						accountsCreated.setAccountNumber(null);
					}
				} catch (NullPointerException e) {
					errorLog.error("AccountNumber is Null in getDetailsByDates(),ComplianceServiceImpl", e);
				}

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[6].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDates(),ComplianceServiceImpl", e);
				}*/

				accountsCreated.setAppSubmittedDate((Date) outputs[6]);

				listAccountsCreated.add(h, accountsCreated);
				h++;
				complianceApps.setAccountsCreated(listAccountsCreated);

			}
		}
		int k = 0;
		if (appStatus.equalsIgnoreCase("Under Processing")) {

			detailsByUnderProcessing = (List<Object>) complianceDao.getDetailsByUnderProcessingDates(startDate,
					endDate);

			for (Object object : detailsByUnderProcessing) {
				ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();
				Object[] outputs = (Object[]) object;

				applicationsUnderProcessing.setRefNo(outputs[0].toString());

				applicationsUnderProcessing.setRecordId(outputs[1].toString());

				applicationsUnderProcessing.setRmName(outputs[2].toString());

				applicationsUnderProcessing.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
				}*/

				applicationsUnderProcessing.setAppSubmittedDate((Date) outputs[5]);
				applicationsUnderProcessing.setAppStatus(outputs[6].toString());

				listApplicationsUnderProcessing.add(applicationsUnderProcessing);	
			}
			
			
			detailsByUnderProcessingMobCheck = complianceDao.getDetailsByUnderProcessingDatesMobCheck(startDate, endDate);

			for (Object objectMobCheck : detailsByUnderProcessingMobCheck) {
				ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing2 = complianceApps.new ApplicationsUnderProcessing();
				Object[] outputsMobCheck = (Object[]) objectMobCheck;

				applicationsUnderProcessing2.setRefNo(outputsMobCheck[0].toString());


				if (outputsMobCheck[1] != null)
						applicationsUnderProcessing2.setIsAppLocked(outputsMobCheck[1].toString());

				if (outputsMobCheck[2] != null)
						applicationsUnderProcessing2.setLockedBy(outputsMobCheck[2].toString());

				if (outputsMobCheck[3] != null)
						applicationsUnderProcessing2.setIsKycDone(outputsMobCheck[3].toString());

					if (outputsMobCheck[4] != null)
						applicationsUnderProcessing2.setKycStatus(outputsMobCheck[4].toString());

					if (outputsMobCheck[5] != null)
						applicationsUnderProcessing2.setKycUrl(outputsMobCheck[5].toString());

					if (outputsMobCheck[6] != null)
						applicationsUnderProcessing2.setKycDoneBy(outputsMobCheck[6].toString());

					/*SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

					String dateKYCUnderProcessing = null;*/
					if (outputsMobCheck[7] != null) {
						/*dateKYCUnderProcessing = outputsMobCheck[7].toString();

						Date dateKYC = new Date();
						try {
							dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("dateKYC coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setKycDate((Date) outputsMobCheck[7]);
					}

					if (outputsMobCheck[8] != null)
						applicationsUnderProcessing2.setIsWcDone(outputsMobCheck[8].toString());

					if (outputsMobCheck[9] != null)
						applicationsUnderProcessing2.setWcUrl(outputsMobCheck[9].toString());

					if (outputsMobCheck[10] != null)
						applicationsUnderProcessing2.setWcStatus(outputsMobCheck[10].toString());

					if (outputsMobCheck[11] != null)
						applicationsUnderProcessing2.setWcDoneBy(outputsMobCheck[11].toString());

					String dateWCUnderProcessing = null;
					if (outputsMobCheck[12] != null) {
						/*dateWCUnderProcessing = outputsMobCheck[12].toString();

						Date wcDate = new Date();
						try {
							wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("wcDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setWcDate((Date) outputsMobCheck[12]);
					}

					if (outputsMobCheck[13] != null)
						applicationsUnderProcessing2.setIsCcDone(outputsMobCheck[13].toString());

					if (outputsMobCheck[14] != null)
						applicationsUnderProcessing2.setCcUrl(outputsMobCheck[14].toString());

					if (outputsMobCheck[15] != null)
						applicationsUnderProcessing2.setCcStatus(outputsMobCheck[15].toString());

					if (outputsMobCheck[16] != null)
						applicationsUnderProcessing2.setCcDoneBy(outputsMobCheck[16].toString());

					String dateCCUnderProcessing = null;
					if (outputsMobCheck[17] != null) {
						/*dateCCUnderProcessing = outputsMobCheck[17].toString();

						Date ccDate = new Date();
						try {
							ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("ccDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setCcDate((Date) outputsMobCheck[17]);
					}

					if (outputsMobCheck[18] != null)
						applicationsUnderProcessing2.setIsIcDone(outputsMobCheck[18].toString());

					if (outputsMobCheck[19] != null)
						applicationsUnderProcessing2.setIcUrl(outputsMobCheck[19].toString());

					if (outputsMobCheck[20] != null)
						applicationsUnderProcessing2.setIcStatus(outputsMobCheck[20].toString());

					if (outputsMobCheck[21] != null)
						applicationsUnderProcessing2.setIcDoneBy(outputsMobCheck[21].toString());

					String dateICUnderProcessing = null;
					if (outputsMobCheck[22] != null) {
						/*dateICUnderProcessing = outputsMobCheck[22].toString();

						Date icDate = new Date();
						try {
							icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("icDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/

						applicationsUnderProcessing2.setIcDate((Date) outputsMobCheck[22]);
					}
					listApplicationsUnderProcessingMobCheck.add(applicationsUnderProcessing2);
				}

			List<String> matchedValues = new ArrayList<String>();
			
			for(ApplicationsUnderProcessing applicationsUnderPrcsMob : listApplicationsUnderProcessingMobCheck){
				
				for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
					
					if(StringUtils.trim(applicationsUnderPrcsMob.getRefNo()).equals(StringUtils.trim(applicationsUnderPrcs.getRefNo()))){
						ApplicationsUnderProcessing finalApplicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();	
						finalApplicationsUnderProcessing.setRefNo(applicationsUnderPrcs.getRefNo());
						finalApplicationsUnderProcessing.setRecordId(applicationsUnderPrcs.getRecordId());
						finalApplicationsUnderProcessing.setAppStatus(applicationsUnderPrcs.getAppStatus());
						finalApplicationsUnderProcessing.setAppSubmittedDate(applicationsUnderPrcs.getAppSubmittedDate());
						finalApplicationsUnderProcessing.setCustomerName(applicationsUnderPrcs.getCustomerName());
						finalApplicationsUnderProcessing.setRmName(applicationsUnderPrcs.getRmName());
						finalApplicationsUnderProcessing.setIsAppLocked(applicationsUnderPrcsMob.getIsAppLocked());
						finalApplicationsUnderProcessing.setLockedBy(applicationsUnderPrcsMob.getLockedBy());

						finalApplicationsUnderProcessing.setIsKycDone(applicationsUnderPrcsMob.getIsKycDone());

						finalApplicationsUnderProcessing.setKycStatus(applicationsUnderPrcsMob.getKycStatus());

						finalApplicationsUnderProcessing.setKycUrl(applicationsUnderPrcsMob.getKycUrl());

						finalApplicationsUnderProcessing.setKycDoneBy(applicationsUnderPrcsMob.getKycDoneBy());

						finalApplicationsUnderProcessing.setKycDate(applicationsUnderPrcsMob.getKycDate());
						finalApplicationsUnderProcessing.setIsWcDone(applicationsUnderPrcsMob.getIsWcDone());

						finalApplicationsUnderProcessing.setWcUrl(applicationsUnderPrcsMob.getWcUrl());

						
						finalApplicationsUnderProcessing.setWcStatus(applicationsUnderPrcsMob.getWcStatus());

						finalApplicationsUnderProcessing.setWcDoneBy(applicationsUnderPrcsMob.getWcDoneBy());

						finalApplicationsUnderProcessing.setWcDate(applicationsUnderPrcsMob.getWcDate());

						finalApplicationsUnderProcessing.setIsCcDone(applicationsUnderPrcsMob.getIsCcDone());

						finalApplicationsUnderProcessing.setCcUrl(applicationsUnderPrcsMob.getCcUrl());

						finalApplicationsUnderProcessing.setCcStatus(applicationsUnderPrcsMob.getCcStatus());

						finalApplicationsUnderProcessing.setCcDoneBy(applicationsUnderPrcsMob.getCcDoneBy());

						finalApplicationsUnderProcessing.setCcDate(applicationsUnderPrcsMob.getCcDate());

						finalApplicationsUnderProcessing.setIsIcDone(applicationsUnderPrcsMob.getIsIcDone());

						finalApplicationsUnderProcessing.setIcUrl(applicationsUnderPrcsMob.getIcUrl());

						finalApplicationsUnderProcessing.setIcStatus(applicationsUnderPrcsMob.getIcStatus());

						finalApplicationsUnderProcessing.setIcDoneBy(applicationsUnderPrcsMob.getIcDoneBy());

						finalApplicationsUnderProcessing.setIcDate(applicationsUnderPrcsMob.getIcDate());
						
						listApplicationsUnderProcessingMobFinal.add(finalApplicationsUnderProcessing);
						matchedValues.add(finalApplicationsUnderProcessing.getRefNo());
						Collections.sort(listApplicationsUnderProcessingMobFinal);
						complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
						//complianceResponse.setData(complianceApps);
					}
				}
			}
			
			for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
				
				if(!matchedValues.contains(applicationsUnderPrcs.getRefNo())){
					listApplicationsUnderProcessingMobFinal.add(applicationsUnderPrcs);
					Collections.sort(listApplicationsUnderProcessingMobFinal);
					complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
					//complianceResponse.setData(complianceApps);
				}
			}
		}

		complianceResponse.setData(complianceApps);
		debugLog.debug("complianceResponse :: " + complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByAllCriteria(String name, Date startDate, Date endDate, String appStatus) {

		ComplianceResponse complianceResponse = new ComplianceResponse();

		ComplianceApps complianceApps = new ComplianceApps();

		List<Object> detailsByAccountRejected = new ArrayList<Object>();

		List<Object> detailsByAccountOpened = new ArrayList<Object>();

		List<Object> detailsByUnderProcessing = new ArrayList<Object>();

		List<Object> detailsByUnderProcessingMobCheck = new ArrayList<Object>();

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobCheck = new ArrayList<ApplicationsUnderProcessing>();
		
		List<ApplicationsUnderProcessing> listApplicationsUnderProcessingMobFinal = new ArrayList<ApplicationsUnderProcessing>();

		if (appStatus.equalsIgnoreCase("ACCOUNT REJECTED")) {
			detailsByAccountRejected = (List<Object>) complianceDao.getDetailsByAccountRejectedAllCriteria(name,
					startDate, endDate);

			int j = 0;

			for (Object object : detailsByAccountRejected) {

				ComplianceApps.AccountsRejected accountsRejected = complianceApps.new AccountsRejected();

				Object[] outputs = (Object[]) object;

				accountsRejected.setRefNo(outputs[0].toString());

				accountsRejected.setRecordId(outputs[1].toString());

				accountsRejected.setRmName(outputs[2].toString());

				accountsRejected.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error(
							"dateSubmitted coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl");
				}*/

				accountsRejected.setAppSubmittedDate((Date) outputs[5]);

				listAccountsRejected.add(j, accountsRejected);
				j++;
				complianceApps.setAccountsRejected(listAccountsRejected);
			}
		}
		int h = 0;
		if (appStatus.equalsIgnoreCase("ACCOUNT OPENED")) {
			detailsByAccountOpened = (List<Object>) complianceDao.getDetailsByAccountOpenedAllCriteria(name, startDate,
					endDate);

			for (Object object : detailsByAccountOpened) {

				ComplianceApps.AccountsCreated accountsCreated = complianceApps.new AccountsCreated();

				Object[] outputs = (Object[]) object;

				accountsCreated.setRefNo(outputs[0].toString());

				accountsCreated.setRecordId(outputs[1].toString());

				accountsCreated.setRmName(outputs[2].toString());

				accountsCreated.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				try {
					if (outputs[5].toString() != null)
						accountsCreated.setAccountNumber(outputs[5].toString());
					else {
						accountsCreated.setAccountNumber(null);
					}
				} catch (NullPointerException e) {
					errorLog.error("AccountNumber is Null in getDetailsByAllCriteria(),ComplianceServiceImpl", e);
				}

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[6].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error(
							"dateSubmitted coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl", e);
				}*/

				accountsCreated.setAppSubmittedDate((Date) outputs[6]);

				listAccountsCreated.add(h, accountsCreated);
				h++;
				complianceApps.setAccountsCreated(listAccountsCreated);

			}
		}
		int k = 0;
		if (appStatus.equalsIgnoreCase("Under Processing")) {

			detailsByUnderProcessing = (List<Object>) complianceDao.getDetailsByUnderProcessingAllCriteria(name,
					startDate, endDate);

			for (Object object : detailsByUnderProcessing) {
				ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();
				Object[] outputs = (Object[]) object;

				applicationsUnderProcessing.setRefNo(outputs[0].toString());

				applicationsUnderProcessing.setRecordId(outputs[1].toString());

				applicationsUnderProcessing.setRmName(outputs[2].toString());

				applicationsUnderProcessing.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

				/*SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
				}*/

				applicationsUnderProcessing.setAppSubmittedDate((Date) outputs[5]);
				applicationsUnderProcessing.setAppStatus(outputs[6].toString());

				listApplicationsUnderProcessing.add(applicationsUnderProcessing);	
			}
			
			
			detailsByUnderProcessingMobCheck = complianceDao.getDetailsByUnderProcessingAllCriteriaMobCheck(name,
					startDate, endDate);

			for (Object objectMobCheck : detailsByUnderProcessingMobCheck) {
				ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing2 = complianceApps.new ApplicationsUnderProcessing();
				Object[] outputsMobCheck = (Object[]) objectMobCheck;

				applicationsUnderProcessing2.setRefNo(outputsMobCheck[0].toString());


				if (outputsMobCheck[1] != null)
						applicationsUnderProcessing2.setIsAppLocked(outputsMobCheck[1].toString());

				if (outputsMobCheck[2] != null)
						applicationsUnderProcessing2.setLockedBy(outputsMobCheck[2].toString());

				if (outputsMobCheck[3] != null)
						applicationsUnderProcessing2.setIsKycDone(outputsMobCheck[3].toString());

					if (outputsMobCheck[4] != null)
						applicationsUnderProcessing2.setKycStatus(outputsMobCheck[4].toString());

					if (outputsMobCheck[5] != null)
						applicationsUnderProcessing2.setKycUrl(outputsMobCheck[5].toString());

					if (outputsMobCheck[6] != null)
						applicationsUnderProcessing2.setKycDoneBy(outputsMobCheck[6].toString());

					/*SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

					String dateKYCUnderProcessing = null;*/
					if (outputsMobCheck[7] != null) {
						/*dateKYCUnderProcessing = outputsMobCheck[7].toString();

						Date dateKYC = new Date();
						try {
							dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("dateKYC coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setKycDate((Date) outputsMobCheck[7]);
					}

					if (outputsMobCheck[8] != null)
						applicationsUnderProcessing2.setIsWcDone(outputsMobCheck[8].toString());

					if (outputsMobCheck[9] != null)
						applicationsUnderProcessing2.setWcUrl(outputsMobCheck[9].toString());

					if (outputsMobCheck[10] != null)
						applicationsUnderProcessing2.setWcStatus(outputsMobCheck[10].toString());

					if (outputsMobCheck[11] != null)
						applicationsUnderProcessing2.setWcDoneBy(outputsMobCheck[11].toString());

					String dateWCUnderProcessing = null;
					if (outputsMobCheck[12] != null) {
						/*dateWCUnderProcessing = outputsMobCheck[12].toString();

						Date wcDate = new Date();
						try {
							wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("wcDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setWcDate((Date) outputsMobCheck[12]);
					}

					if (outputsMobCheck[13] != null)
						applicationsUnderProcessing2.setIsCcDone(outputsMobCheck[13].toString());

					if (outputsMobCheck[14] != null)
						applicationsUnderProcessing2.setCcUrl(outputsMobCheck[14].toString());

					if (outputsMobCheck[15] != null)
						applicationsUnderProcessing2.setCcStatus(outputsMobCheck[15].toString());

					if (outputsMobCheck[16] != null)
						applicationsUnderProcessing2.setCcDoneBy(outputsMobCheck[16].toString());

					String dateCCUnderProcessing = null;
					if (outputsMobCheck[17] != null) {
						/*dateCCUnderProcessing = outputsMobCheck[17].toString();

						Date ccDate = new Date();
						try {
							ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("ccDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/
						applicationsUnderProcessing2.setCcDate((Date) outputsMobCheck[17]);
					}

					if (outputsMobCheck[18] != null)
						applicationsUnderProcessing2.setIsIcDone(outputsMobCheck[18].toString());

					if (outputsMobCheck[19] != null)
						applicationsUnderProcessing2.setIcUrl(outputsMobCheck[19].toString());

					if (outputsMobCheck[20] != null)
						applicationsUnderProcessing2.setIcStatus(outputsMobCheck[20].toString());

					if (outputsMobCheck[21] != null)
						applicationsUnderProcessing2.setIcDoneBy(outputsMobCheck[21].toString());

					String dateICUnderProcessing = null;
					if (outputsMobCheck[22] != null) {
						/*dateICUnderProcessing = outputsMobCheck[22].toString();

						Date icDate = new Date();
						try {
							icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
						} catch (ParseException e) {
							errorLog.error("icDate coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl",
									e);
						}*/

						applicationsUnderProcessing2.setIcDate((Date) outputsMobCheck[22]);
					}
					listApplicationsUnderProcessingMobCheck.add(applicationsUnderProcessing2);
				}

			List<String> matchedValues = new ArrayList<String>();
			
			for(ApplicationsUnderProcessing applicationsUnderPrcsMob : listApplicationsUnderProcessingMobCheck){
				
				for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
					
					if(StringUtils.trim(applicationsUnderPrcsMob.getRefNo()).equals(StringUtils.trim(applicationsUnderPrcs.getRefNo()))){
						ApplicationsUnderProcessing finalApplicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();	
						finalApplicationsUnderProcessing.setRefNo(applicationsUnderPrcs.getRefNo());
						finalApplicationsUnderProcessing.setRecordId(applicationsUnderPrcs.getRecordId());
						finalApplicationsUnderProcessing.setAppStatus(applicationsUnderPrcs.getAppStatus());
						finalApplicationsUnderProcessing.setAppSubmittedDate(applicationsUnderPrcs.getAppSubmittedDate());
						finalApplicationsUnderProcessing.setCustomerName(applicationsUnderPrcs.getCustomerName());
						finalApplicationsUnderProcessing.setRmName(applicationsUnderPrcs.getRmName());
						finalApplicationsUnderProcessing.setIsAppLocked(applicationsUnderPrcsMob.getIsAppLocked());
						finalApplicationsUnderProcessing.setLockedBy(applicationsUnderPrcsMob.getLockedBy());

						finalApplicationsUnderProcessing.setIsKycDone(applicationsUnderPrcsMob.getIsKycDone());

						finalApplicationsUnderProcessing.setKycStatus(applicationsUnderPrcsMob.getKycStatus());

						finalApplicationsUnderProcessing.setKycUrl(applicationsUnderPrcsMob.getKycUrl());

						finalApplicationsUnderProcessing.setKycDoneBy(applicationsUnderPrcsMob.getKycDoneBy());

						finalApplicationsUnderProcessing.setKycDate(applicationsUnderPrcsMob.getKycDate());
						finalApplicationsUnderProcessing.setIsWcDone(applicationsUnderPrcsMob.getIsWcDone());

						finalApplicationsUnderProcessing.setWcUrl(applicationsUnderPrcsMob.getWcUrl());

						
						finalApplicationsUnderProcessing.setWcStatus(applicationsUnderPrcsMob.getWcStatus());

						finalApplicationsUnderProcessing.setWcDoneBy(applicationsUnderPrcsMob.getWcDoneBy());

						finalApplicationsUnderProcessing.setWcDate(applicationsUnderPrcsMob.getWcDate());

						finalApplicationsUnderProcessing.setIsCcDone(applicationsUnderPrcsMob.getIsCcDone());

						finalApplicationsUnderProcessing.setCcUrl(applicationsUnderPrcsMob.getCcUrl());

						finalApplicationsUnderProcessing.setCcStatus(applicationsUnderPrcsMob.getCcStatus());

						finalApplicationsUnderProcessing.setCcDoneBy(applicationsUnderPrcsMob.getCcDoneBy());

						finalApplicationsUnderProcessing.setCcDate(applicationsUnderPrcsMob.getCcDate());

						finalApplicationsUnderProcessing.setIsIcDone(applicationsUnderPrcsMob.getIsIcDone());

						finalApplicationsUnderProcessing.setIcUrl(applicationsUnderPrcsMob.getIcUrl());

						finalApplicationsUnderProcessing.setIcStatus(applicationsUnderPrcsMob.getIcStatus());

						finalApplicationsUnderProcessing.setIcDoneBy(applicationsUnderPrcsMob.getIcDoneBy());

						finalApplicationsUnderProcessing.setIcDate(applicationsUnderPrcsMob.getIcDate());
						
						listApplicationsUnderProcessingMobFinal.add(finalApplicationsUnderProcessing);
						matchedValues.add(finalApplicationsUnderProcessing.getRefNo());
						Collections.sort(listApplicationsUnderProcessingMobFinal);
						complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
						//complianceResponse.setData(complianceApps);
					}
				}
			}
			
			for(ApplicationsUnderProcessing applicationsUnderPrcs:listApplicationsUnderProcessing){
				
				if(!matchedValues.contains(applicationsUnderPrcs.getRefNo())){
					listApplicationsUnderProcessingMobFinal.add(applicationsUnderPrcs);
					Collections.sort(listApplicationsUnderProcessingMobFinal);
					complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessingMobFinal);
					//complianceResponse.setData(complianceApps);
				}
			}

		}
		
		//complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessing);
		complianceResponse.setData(complianceApps);
		debugLog.debug("complianceResponse : " + complianceResponse.toString());
		return complianceResponse;
	}
}