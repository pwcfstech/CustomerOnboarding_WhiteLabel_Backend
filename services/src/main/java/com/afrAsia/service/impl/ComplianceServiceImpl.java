package com.afrAsia.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

		List<ComplianceApps> listOfComplianceApps = new ArrayList<ComplianceApps>();

		List<Object> detailsByAccountRejected = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByAccountOpened = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByUnderProcessing = new ArrayList<Object>(listOfComplianceApps);

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

		detailsByAccountRejected = (List<Object>) complianceDao.getDetailsByAccountRejectedDefault();

		int j = 0;

		for (Object object : detailsByAccountRejected) {

			ComplianceApps.AccountsRejected accountsRejected = complianceApps.new AccountsRejected();

			Object[] outputs = (Object[]) object;

			accountsRejected.setRefNo(outputs[0].toString());

			accountsRejected.setRecordId(outputs[1].toString());

			accountsRejected.setRmName(outputs[2].toString());

			accountsRejected.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[5].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl");
			}

			accountsRejected.setAppSubmittedDate(dateSubmitted);

			listAccountsRejected.add(accountsRejected);
			complianceApps.setAccountsRejected(listAccountsRejected);
		}
		listOfComplianceApps.add(complianceApps);
		int h = 0;
		detailsByAccountOpened = (List<Object>) complianceDao.getDetailsByAccountOpenedDefault();

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
				errorLog.error("AccountNumber is Null in getDetailsByDefault(),ComplianceServiceImpl", e);
			}

			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[6].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
			}

			accountsCreated.setAppSubmittedDate(dateSubmitted);

			listAccountsCreated.add(accountsCreated);
			complianceApps.setAccountsCreated(listAccountsCreated);
		}
		listOfComplianceApps.add(complianceApps);
		int k = 0;
		detailsByUnderProcessing = (List<Object>) complianceDao.getDetailsByUnderProcessingDefault();

		for (Object object : detailsByUnderProcessing) {

			ComplianceApps.ApplicationsUnderProcessing applicationsUnderProcessing = complianceApps.new ApplicationsUnderProcessing();

			Object[] outputs = (Object[]) object;

			applicationsUnderProcessing.setRefNo(outputs[0].toString());

			applicationsUnderProcessing.setRecordId(outputs[1].toString());

			applicationsUnderProcessing.setRmName(outputs[2].toString());

			applicationsUnderProcessing.setCustomerName(outputs[3].toString() + " " + outputs[4].toString());

			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[5].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDefault(),ComplianceServiceImpl", e);
			}

			applicationsUnderProcessing.setAppSubmittedDate(dateSubmitted);
			applicationsUnderProcessing.setAppStatus(outputs[6].toString());

			try {
				applicationsUnderProcessing.setIsAppLocked(outputs[7].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIsAppLocked(null);
			}

			try {
				applicationsUnderProcessing.setLockedBy(outputs[8].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setLockedBy(null);
			}

			try {
				applicationsUnderProcessing.setIsKycDone(outputs[9].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIsKycDone(null);
			}

			try {
				applicationsUnderProcessing.setKycStatus(outputs[10].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setKycStatus(null);
			}

			try {
				applicationsUnderProcessing.setKycUrl(outputs[11].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setKycUrl(null);
			}

			try {
				applicationsUnderProcessing.setKycDoneBy(outputs[12].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setKycDoneBy(null);
			}

			SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

			String dateKYCUnderProcessing = null;

			try {
				dateKYCUnderProcessing = outputs[13].toString();

				Date dateKYC = new Date();
				try {
					dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
				} catch (ParseException e) {
					errorLog.error("dateKYC coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}
				applicationsUnderProcessing.setKycDate(dateKYC);
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setKycDate(null);
			}

			try {
				applicationsUnderProcessing.setIsWcDone(outputs[14].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIsWcDone(null);
			}

			try {
				applicationsUnderProcessing.setWcUrl(outputs[15].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setWcUrl(null);
			}
			try {
				applicationsUnderProcessing.setWcStatus(outputs[16].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setWcStatus(null);
			}
			try {
				applicationsUnderProcessing.setWcDoneBy(outputs[17].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setWcDoneBy(null);
			}
			String dateWCUnderProcessing = null;
			try {
				dateWCUnderProcessing = outputs[18].toString();

				Date wcDate = new Date();
				try {
					wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
				} catch (ParseException e) {
					errorLog.error("wcDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}
				applicationsUnderProcessing.setWcDate(wcDate);

			} catch (NullPointerException e) {
				applicationsUnderProcessing.setWcDate(null);
			}
			try {
				applicationsUnderProcessing.setIsCcDone(outputs[19].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIsCcDone(null);
			}

			try {
				applicationsUnderProcessing.setCcUrl(outputs[20].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setCcUrl(null);
			}
			try {
				applicationsUnderProcessing.setCcStatus(outputs[21].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setCcStatus(null);
			}
			try {
				applicationsUnderProcessing.setCcDoneBy(outputs[22].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setCcDoneBy(null);
			}

			String dateCCUnderProcessing = null;
			try {
				dateCCUnderProcessing = outputs[23].toString();

				Date ccDate = new Date();
				try {
					ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
				} catch (ParseException e) {
					errorLog.error("ccDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}
				applicationsUnderProcessing.setCcDate(ccDate);
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setCcDate(null);
			}

			try {
				applicationsUnderProcessing.setIsIcDone(outputs[24].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIsIcDone(null);
			}
			try {
				applicationsUnderProcessing.setIcUrl(outputs[25].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIcUrl(null);
			}

			try {
				applicationsUnderProcessing.setIcStatus(outputs[26].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIcStatus(null);
			}

			try {
				applicationsUnderProcessing.setIcDoneBy(outputs[27].toString());
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIcDoneBy(null);
			}

			String dateICUnderProcessing = null;
			try {
				dateICUnderProcessing = outputs[28].toString();

				Date icDate = new Date();
				try {
					icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
				} catch (ParseException e) {
					errorLog.error("icDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}
				applicationsUnderProcessing.setIcDate(icDate);
			} catch (NullPointerException e) {
				applicationsUnderProcessing.setIcDate(null);
			}

			listApplicationsUnderProcessing.add(k, applicationsUnderProcessing);
			k++;
			complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessing);
		}
		listOfComplianceApps.add(complianceApps);
		complianceResponse.setData(listOfComplianceApps);
		debugLog.debug(
				"complianceResponse : " + complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByName(String name, String appStatus) {

		ComplianceResponse complianceResponse = new ComplianceResponse();
		
		ComplianceApps complianceApps = new ComplianceApps();

		List<ComplianceApps> listOfComplianceApps = new ArrayList<ComplianceApps>();

		List<Object> detailsByAccountRejected = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByAccountOpened = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByUnderProcessing = new ArrayList<Object>(listOfComplianceApps);

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByName(),ComplianceServiceImpl");
				}

				accountsRejected.setAppSubmittedDate(dateSubmitted);
				listAccountsRejected.add(j, accountsRejected);
				j++;
				complianceApps.setAccountsRejected(listAccountsRejected);
				
			}
			listOfComplianceApps.add(complianceApps);
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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[6].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted could not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}

				accountsCreated.setAppSubmittedDate(dateSubmitted);
				listAccountsCreated.add(h, accountsCreated);
				h++;
				complianceApps.setAccountsCreated(listAccountsCreated);
			}
			listOfComplianceApps.add(complianceApps);
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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
				}

				applicationsUnderProcessing.setAppSubmittedDate(dateSubmitted);
				applicationsUnderProcessing.setAppStatus(outputs[6].toString());

				try {
					applicationsUnderProcessing.setIsAppLocked(outputs[7].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsAppLocked(null);
				}

				try {
					applicationsUnderProcessing.setLockedBy(outputs[8].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setLockedBy(null);
				}

				try {
					applicationsUnderProcessing.setIsKycDone(outputs[9].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsKycDone(null);
				}

				try {
					applicationsUnderProcessing.setKycStatus(outputs[10].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycStatus(null);
				}

				try {
					applicationsUnderProcessing.setKycUrl(outputs[11].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycUrl(null);
				}

				try {
					applicationsUnderProcessing.setKycDoneBy(outputs[12].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycDoneBy(null);
				}

				SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

				String dateKYCUnderProcessing = null;

				try {
					dateKYCUnderProcessing = outputs[13].toString();

					Date dateKYC = new Date();
					try {
						dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("dateKYC coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setKycDate(dateKYC);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycDate(null);
				}

				try {
					applicationsUnderProcessing.setIsWcDone(outputs[14].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsWcDone(null);
				}

				try {
					applicationsUnderProcessing.setWcUrl(outputs[15].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcUrl(null);
				}
				try {
					applicationsUnderProcessing.setWcStatus(outputs[16].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcStatus(null);
				}
				try {
					applicationsUnderProcessing.setWcDoneBy(outputs[17].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcDoneBy(null);
				}
				String dateWCUnderProcessing = null;
				try {
					dateWCUnderProcessing = outputs[18].toString();

					Date wcDate = new Date();
					try {
						wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("wcDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setWcDate(wcDate);

				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcDate(null);
				}
				try {
					applicationsUnderProcessing.setIsCcDone(outputs[19].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsCcDone(null);
				}

				try {
					applicationsUnderProcessing.setCcUrl(outputs[20].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcUrl(null);
				}
				try {
					applicationsUnderProcessing.setCcStatus(outputs[21].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcStatus(null);
				}
				try {
					applicationsUnderProcessing.setCcDoneBy(outputs[22].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcDoneBy(null);
				}

				String dateCCUnderProcessing = null;
				try {
					dateCCUnderProcessing = outputs[23].toString();

					Date ccDate = new Date();
					try {
						ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("ccDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setCcDate(ccDate);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcDate(null);
				}

				try {
					applicationsUnderProcessing.setIsIcDone(outputs[24].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsIcDone(null);
				}
				try {
					applicationsUnderProcessing.setIcUrl(outputs[25].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcUrl(null);
				}

				try {
					applicationsUnderProcessing.setIcStatus(outputs[26].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcStatus(null);
				}

				try {
					applicationsUnderProcessing.setIcDoneBy(outputs[27].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcDoneBy(null);
				}

				String dateICUnderProcessing = null;
				try {
					dateICUnderProcessing = outputs[28].toString();

					Date icDate = new Date();
					try {
						icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("icDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setIcDate(icDate);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcDate(null);
				}

				listApplicationsUnderProcessing.add(k, applicationsUnderProcessing);
				k++;
				complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessing);
				
			}
			listOfComplianceApps.add(complianceApps);
		}
		complianceResponse.setData(listOfComplianceApps);
		debugLog.debug(
				"complianceResponse  : " + complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByDates(Date startDate, Date endDate, String appStatus) {

		ComplianceResponse complianceResponse = new ComplianceResponse();
		
		ComplianceApps complianceApps = new ComplianceApps();

		List<ComplianceApps> listOfComplianceApps = new ArrayList<ComplianceApps>();

		List<Object> detailsByAccountRejected = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByAccountOpened = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByUnderProcessing = new ArrayList<Object>(listOfComplianceApps);

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDates(),ComplianceServiceImpl");
				}

				accountsRejected.setAppSubmittedDate(dateSubmitted);

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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[6].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDates(),ComplianceServiceImpl", e);
				}

				accountsCreated.setAppSubmittedDate(dateSubmitted);

				listAccountsCreated.add(h, accountsCreated);
				h++;
				complianceApps.setAccountsCreated(listAccountsCreated);
				
			}
			listOfComplianceApps.add(complianceApps);
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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error("dateSubmitted coud not be parsed in getDetailsByDates(),ComplianceServiceImpl", e);
				}

				applicationsUnderProcessing.setAppSubmittedDate(dateSubmitted);
				applicationsUnderProcessing.setAppStatus(outputs[6].toString());

				try {
					applicationsUnderProcessing.setIsAppLocked(outputs[7].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsAppLocked(null);
				}

				try {
					applicationsUnderProcessing.setLockedBy(outputs[8].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setLockedBy(null);
				}

				try {
					applicationsUnderProcessing.setIsKycDone(outputs[9].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsKycDone(null);
				}

				try {
					applicationsUnderProcessing.setKycStatus(outputs[10].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycStatus(null);
				}

				try {
					applicationsUnderProcessing.setKycUrl(outputs[11].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycUrl(null);
				}

				try {
					applicationsUnderProcessing.setKycDoneBy(outputs[12].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycDoneBy(null);
				}

				SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

				String dateKYCUnderProcessing = null;

				try {
					dateKYCUnderProcessing = outputs[13].toString();

					Date dateKYC = new Date();
					try {
						dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("dateKYC coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setKycDate(dateKYC);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycDate(null);
				}

				try {
					applicationsUnderProcessing.setIsWcDone(outputs[14].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsWcDone(null);
				}

				try {
					applicationsUnderProcessing.setWcUrl(outputs[15].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcUrl(null);
				}
				try {
					applicationsUnderProcessing.setWcStatus(outputs[16].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcStatus(null);
				}
				try {
					applicationsUnderProcessing.setWcDoneBy(outputs[17].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcDoneBy(null);
				}
				String dateWCUnderProcessing = null;
				try {
					dateWCUnderProcessing = outputs[18].toString();

					Date wcDate = new Date();
					try {
						wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("wcDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setWcDate(wcDate);

				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcDate(null);
				}
				try {
					applicationsUnderProcessing.setIsCcDone(outputs[19].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsCcDone(null);
				}

				try {
					applicationsUnderProcessing.setCcUrl(outputs[20].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcUrl(null);
				}
				try {
					applicationsUnderProcessing.setCcStatus(outputs[21].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcStatus(null);
				}
				try {
					applicationsUnderProcessing.setCcDoneBy(outputs[22].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcDoneBy(null);
				}

				String dateCCUnderProcessing = null;
				try {
					dateCCUnderProcessing = outputs[23].toString();

					Date ccDate = new Date();
					try {
						ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("ccDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setCcDate(ccDate);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcDate(null);
				}

				try {
					applicationsUnderProcessing.setIsIcDone(outputs[24].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsIcDone(null);
				}
				try {
					applicationsUnderProcessing.setIcUrl(outputs[25].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcUrl(null);
				}

				try {
					applicationsUnderProcessing.setIcStatus(outputs[26].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcStatus(null);
				}

				try {
					applicationsUnderProcessing.setIcDoneBy(outputs[27].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcDoneBy(null);
				}

				String dateICUnderProcessing = null;
				try {
					dateICUnderProcessing = outputs[28].toString();

					Date icDate = new Date();
					try {
						icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("icDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setIcDate(icDate);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcDate(null);
				}

				listApplicationsUnderProcessing.add(k, applicationsUnderProcessing);
				k++;
				complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessing);
				
			}
			listOfComplianceApps.add(complianceApps);
		}
		
		complianceResponse.setData(listOfComplianceApps);
		debugLog.debug(
				"complianceResponse :: " + complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByAllCriteria(String name, Date startDate, Date endDate, String appStatus) {

		ComplianceResponse complianceResponse = new ComplianceResponse();
		
		ComplianceApps complianceApps = new ComplianceApps();

		List<ComplianceApps> listOfComplianceApps = new ArrayList<ComplianceApps>();

		List<Object> detailsByAccountRejected = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByAccountOpened = new ArrayList<Object>(listOfComplianceApps);

		List<Object> detailsByUnderProcessing = new ArrayList<Object>(listOfComplianceApps);

		List<AccountsRejected> listAccountsRejected = new ArrayList<AccountsRejected>();

		List<AccountsCreated> listAccountsCreated = new ArrayList<AccountsCreated>();

		List<ApplicationsUnderProcessing> listApplicationsUnderProcessing = new ArrayList<ApplicationsUnderProcessing>();

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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error(
							"dateSubmitted coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl");
				}

				accountsRejected.setAppSubmittedDate(dateSubmitted);

				listAccountsRejected.add(j, accountsRejected);
				j++;
				complianceApps.setAccountsRejected(listAccountsRejected);
				
			}
			listOfComplianceApps.add(complianceApps);
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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[6].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error(
							"dateSubmitted coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl", e);
				}

				accountsCreated.setAppSubmittedDate(dateSubmitted);

				listAccountsCreated.add(h, accountsCreated);
				h++;
				complianceApps.setAccountsCreated(listAccountsCreated);
				
			}
			listOfComplianceApps.add(complianceApps);
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

				SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

				String dateSubmittedDate = outputs[5].toString();

				Date dateSubmitted = new Date();
				try {
					dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
				} catch (ParseException e) {
					errorLog.error(
							"dateSubmitted coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl", e);
				}

				applicationsUnderProcessing.setAppSubmittedDate(dateSubmitted);
				applicationsUnderProcessing.setAppStatus(outputs[6].toString());

				try {
					applicationsUnderProcessing.setIsAppLocked(outputs[7].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsAppLocked(null);
				}

				try {
					applicationsUnderProcessing.setLockedBy(outputs[8].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setLockedBy(null);
				}

				try {
					applicationsUnderProcessing.setIsKycDone(outputs[9].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsKycDone(null);
				}

				try {
					applicationsUnderProcessing.setKycStatus(outputs[10].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycStatus(null);
				}

				try {
					applicationsUnderProcessing.setKycUrl(outputs[11].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycUrl(null);
				}

				try {
					applicationsUnderProcessing.setKycDoneBy(outputs[12].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycDoneBy(null);
				}

				SimpleDateFormat dateFormatUnderProcessing = new SimpleDateFormat("yyyy-MM-dd");

				String dateKYCUnderProcessing = null;

				try {
					dateKYCUnderProcessing = outputs[13].toString();

					Date dateKYC = new Date();
					try {
						dateKYC = dateFormatUnderProcessing.parse(dateKYCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("dateKYC coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setKycDate(dateKYC);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setKycDate(null);
				}

				try {
					applicationsUnderProcessing.setIsWcDone(outputs[14].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsWcDone(null);
				}

				try {
					applicationsUnderProcessing.setWcUrl(outputs[15].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcUrl(null);
				}
				try {
					applicationsUnderProcessing.setWcStatus(outputs[16].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcStatus(null);
				}
				try {
					applicationsUnderProcessing.setWcDoneBy(outputs[17].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcDoneBy(null);
				}
				String dateWCUnderProcessing = null;
				try {
					dateWCUnderProcessing = outputs[18].toString();

					Date wcDate = new Date();
					try {
						wcDate = dateFormatUnderProcessing.parse(dateWCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("wcDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setWcDate(wcDate);

				} catch (NullPointerException e) {
					applicationsUnderProcessing.setWcDate(null);
				}
				try {
					applicationsUnderProcessing.setIsCcDone(outputs[19].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsCcDone(null);
				}

				try {
					applicationsUnderProcessing.setCcUrl(outputs[20].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcUrl(null);
				}
				try {
					applicationsUnderProcessing.setCcStatus(outputs[21].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcStatus(null);
				}
				try {
					applicationsUnderProcessing.setCcDoneBy(outputs[22].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcDoneBy(null);
				}

				String dateCCUnderProcessing = null;
				try {
					dateCCUnderProcessing = outputs[23].toString();

					Date ccDate = new Date();
					try {
						ccDate = dateFormatUnderProcessing.parse(dateCCUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("ccDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setCcDate(ccDate);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setCcDate(null);
				}

				try {
					applicationsUnderProcessing.setIsIcDone(outputs[24].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIsIcDone(null);
				}
				try {
					applicationsUnderProcessing.setIcUrl(outputs[25].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcUrl(null);
				}

				try {
					applicationsUnderProcessing.setIcStatus(outputs[26].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcStatus(null);
				}

				try {
					applicationsUnderProcessing.setIcDoneBy(outputs[27].toString());
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcDoneBy(null);
				}

				String dateICUnderProcessing = null;
				try {
					dateICUnderProcessing = outputs[28].toString();

					Date icDate = new Date();
					try {
						icDate = dateFormatUnderProcessing.parse(dateICUnderProcessing);
					} catch (ParseException e) {
						errorLog.error("icDate coud not be parsed in getDetailsByName(),ComplianceServiceImpl", e);
					}
					applicationsUnderProcessing.setIcDate(icDate);
				} catch (NullPointerException e) {
					applicationsUnderProcessing.setIcDate(null);
				}

				listApplicationsUnderProcessing.add(k, applicationsUnderProcessing);
				k++;
				complianceApps.setApplicationsUnderProcessing(listApplicationsUnderProcessing);
			}
			listOfComplianceApps.add(complianceApps);
		}
		complianceResponse.setData(listOfComplianceApps);
		debugLog.debug("complianceResponse :: "
				+ complianceResponse.toString());
		return complianceResponse;
	}
}