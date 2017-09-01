package com.afrAsia.rest;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afrAsia.CommonUtils;

import com.afrAsia.Utils.AfrAsiaEmailUtility;
import com.afrAsia.Utils.AfrAsiaMailConfig;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.AccountCreationRequest.Data;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.JointApplicants;
import com.afrAsia.entities.request.NomineeInfo;
import com.afrAsia.entities.response.AccountCreateResponse;

import com.afrAsia.service.AccountCreationService;

@Component
@Path("{version}")
public class AccountCreationRestService {
	
	private static final Logger logger = LoggerFactory.getLogger(MyTrackerRestService.class);
	
	private AccountCreationService accountCreationService;
	
	private AfrAsiaMailConfig afrAsiaMailConfig;

	public AccountCreationService getAccountCreationService() {
		return accountCreationService;
	}

	public void setAccountCreationService(AccountCreationService accountCreationService) {
		this.accountCreationService = accountCreationService;
	}

	public AfrAsiaMailConfig getAfrAsiaMailConfig() {
		return afrAsiaMailConfig;
	}

	public void setAfrAsiaMailConfig(AfrAsiaMailConfig afrAsiaMailConfig) {
		this.afrAsiaMailConfig = afrAsiaMailConfig;
	}

	@Override
	public String toString() {
		return "AccountCreationRestService [accountCreationService=" + accountCreationService + "]";
	}

	@POST
	@Path("/createApplication")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAccount(AccountCreationRequest accountCreationRequest) {
		
		logger.info("############ accountCreationRequest in AccountCreationRestService is : "+accountCreationRequest);
		
		AccountCreateResponse accountCreationResponse = new AccountCreateResponse();
		
		MsgHeader msgHeader = new MsgHeader();

		try {
			String checkRequest = validateRequest(accountCreationRequest);
			if (checkRequest.equals("Success")) {
				if (accountCreationRequest.getData().getAppRefNo() == null) {
					
					accountCreationResponse = accountCreationService.createAccount(accountCreationRequest);

					//sendEmailToCustomer();

//					String smsContent = "Dear [First Name], thank you for your interest in AfrAsia Bank. "
//							+ "Your application is currently under process with application number" 
//							+ accountCreationResponse.getData().getRefNo() 
//							+ ".We shall update you as soon as your account is opened. Regards, AfrAsia Bank Team";
//					sendSMSToCustomer(smsContent);

				} else {
					if (accountCreationRequest.getData().getRecordId() != null) {
						{
							try {
								if (!accountCreationRequest.getData().getComment().isEmpty()
										|| accountCreationRequest.getData().getComment() != null
										|| accountCreationRequest.getData().getComment() != " ") {
									accountCreationResponse = accountCreationService
											.updateAccount(accountCreationRequest);
								}
							} catch (NullPointerException e) {
								logger.error("############ please provide comments, its not provided in your update request ");
								MsgHeader messageHeader = new MsgHeader();
								MsgHeader.Error error = new MsgHeader().new Error();
								error.setCd("404");
								error.setCustomCode("Comment is null");
								error.setRsn("please provide comments, its not provided in your update request");
								messageHeader.setError(error);
								accountCreationResponse.setMsgHeader(messageHeader);
								logger.error("############ accountCreationResponse "+accountCreationResponse);
							}

						}
					} else {
						logger.error("############ please provide recordId, its not provided in your update request ");
						MsgHeader messageHeader = new MsgHeader();
						MsgHeader.Error error = new MsgHeader().new Error();
						error.setCd("404");
						error.setCustomCode("Null record ID");
						error.setRsn("please provide recordId, its not provided in your update request"); 
						messageHeader.setError(error);
						accountCreationResponse.setMsgHeader(messageHeader);
						logger.error("############ accountCreationResponse "+accountCreationResponse);
					}

				}

				if (accountCreationResponse!=null) {
					logger.info("############ accountCreationResponse is : "+accountCreationResponse);
					return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					logger.error("############ No data from rmApplication ");
					System.out.println("No data from rmApplication ");
				}

			}
			else{
				logger.error("############ checkRequest is : "+checkRequest);
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn(checkRequest);
				msgHeader.setError(error);
				accountCreationResponse.setMsgHeader(msgHeader);
				logger.error("############ accountCreationResponse "+accountCreationResponse);
				return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();
			}
		} catch (Exception e) {
			logger.error("############ Sorry, there was an error while creating the account. Please try again later ");
			e.printStackTrace();
			Error error = new MsgHeader().new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error while creating the account. Please try again later.");
			msgHeader.setError(error);
			accountCreationResponse.setMsgHeader(msgHeader);
			logger.error("############ accountCreationResponse "+accountCreationResponse);
			return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();
		}
		logger.error("############ accountCreationResponse "+accountCreationResponse);
		return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();

	}

	private String validateRequest(AccountCreationRequest accountCreationRequest) {

		// if (accountCreationRequest != null &&
		// accountCreationRequest.getData() != null) {
		if (accountCreationRequest != null && accountCreationRequest.getData() != null) {

			Data accountCreationData = accountCreationRequest.getData();
			logger.error("############ accountCreationData "+accountCreationData);
			// System.out.println(" in validateRequest , in if ,
			// accountCreationData ======== "+accountCreationData);
			// Validate Account Details
			String accountValidated = validateAccountDetails(accountCreationData);
			// System.out.println(" in validateRequest , in if ,
			// accountValidated ===== "+accountValidated);
			if (!accountValidated.equalsIgnoreCase("Success")) {
				logger.error("############ accountValidated is not equal to success ");
				System.out.println("Account:Returning from here");
				return accountValidated;
			}
			// Validate Primary Applicant Details and Guardian Detail
			ApplicantDetails primaryApplicant = accountCreationRequest.getData().getPrimaryApplicantDetail();
			logger.error("############ primaryApplicant "+primaryApplicant);
			// System.out.println(" in validateRequest , in if ,
			// primaryApplicant ======= "+primaryApplicant);
			ApplicantDetails guardianPrimary = accountCreationRequest.getData().getGuardianDetail();
			logger.error("############ guardianPrimary "+guardianPrimary);
			// System.out.println(" in validateRequest , in if , guardianPrimary
			// ======= "+guardianPrimary);
			String primaryValidated = validateApplicant(accountCreationData, primaryApplicant, guardianPrimary,
					"Primary");
			logger.error("############ primaryValidated "+primaryValidated);
			// System.out.println(" in validateRequest , in if ,
			// primaryValidated ====== "+primaryValidated);
			if (!primaryValidated.equalsIgnoreCase("Success")) {
				logger.error("############ primaryValidated is not equal to success ");
				return primaryValidated;
			}

			// Validate Joint holder details
			List<JointApplicants> jointApplicants = accountCreationRequest.getData().getJointApplicants();
			if (accountCreationData.getAccountDetails().getAccountType().equalsIgnoreCase("J")) {
				if (jointApplicants.size() == 0) {
					logger.error("############ Account Category is joint but there are no joint holders ");
					return ("Account Category is joint but there are no joint holders");
				}
			}
			if (accountCreationData.getAccountDetails().getAccountType().equalsIgnoreCase("S")) {
				if (jointApplicants.size() > 0) {
					logger.error("############ Account Category is sole but there are joint holders ");
					return ("Account Category is sole but there are joint holders");
				}
			}
			int cntr = 0;
			for (JointApplicants jointDetail : jointApplicants) {
				String jointValidated = validateApplicant(accountCreationData, jointDetail.getJointApplicantDetail(),
						jointDetail.getGuardianDetail(), "Joint " + cntr);
				if (!jointValidated.equalsIgnoreCase("Success")) {
					return jointValidated;
				}
				cntr++;
			}

			return ("Success");
		} else {
			System.out.println("Invalid Request from Get Application Details ");
			logger.error("############ Invalid Request from Get Application Details ");
			return ("Invalid Request from Create Application");
		}
	}

	/*
	 * // Account Details private String validateAccountDetails(Data
	 * accountCreationData) {
	 * 
	 * if
	 * (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().
	 * getAccount()) ||
	 * accountCreationData.getAccountDetails().getAccount().length() > 6) {
	 * return ("Error in account type::" +
	 * CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().
	 * getAccount()) + "   " +
	 * accountCreationData.getAccountDetails().getAccount().length());
	 */
	// Account Details
	private String validateAccountDetails(Data accountCreationData) {

		if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccount())
				|| accountCreationData.getAccountDetails().getAccount().length() > 6) {
			logger.error("############ Error in account type::"
					+ CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccount()) + "   "
					+ accountCreationData.getAccountDetails().getAccount().length());
			return ("Error in account type::"
					+ CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccount()) + "   "
					+ accountCreationData.getAccountDetails().getAccount().length());
		}
		if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccountType())
				|| accountCreationData.getAccountDetails().getAccountType().length() > 1) {
			logger.error("############ Error in account category ");
			return ("Error in account category");
		} else {
			String[] arr = { "S", "J" };
			int i;
			for (i = 0; i < arr.length; i++) {
				if (arr[i].equalsIgnoreCase(accountCreationData.getAccountDetails().getAccountType())) {
					break;
				}
			}
			if (i == arr.length) {
				logger.error("############ Account Category is incorrect ");
				return ("Account Category is incorrect");
			}
		}

		// Check for Statement delivery type
		if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtDelivery())) {
			if (accountCreationData.getAccountDetails().getStmtDelivery().equalsIgnoreCase("Post")) {
				if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtAddr1())
						|| accountCreationData.getAccountDetails().getStmtAddr1().length() > 105) {
					// Check for Statement delivery type
					if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtDelivery())) {
						if (accountCreationData.getAccountDetails().getStmtDelivery().equalsIgnoreCase("Post")) {
							if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtAddr1())
									|| accountCreationData.getAccountDetails().getStmtAddr1().length() > 105) {
								logger.error("############ Error in Stmt Address 1 ");
								return ("Error in Stmt Address 1");
							}
							if (!accountCreationData.getAccountDetails().getStmtAddr2().isEmpty()
									&& accountCreationData.getAccountDetails().getStmtAddr2().length() > 105) {
								logger.error("############ Error in Stmt Address 2 ");
								return ("Error in Stmt Address 2");
							}
							if (!accountCreationData.getAccountDetails().getStmtAddr3().isEmpty()
									&& accountCreationData.getAccountDetails().getStmtAddr3().length() > 105) {
								logger.error("############ Error in Stmt Address 3 ");
								return ("Error in Stmt Address 3");
							}
							if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtCity())
									|| accountCreationData.getAccountDetails().getStmtCity().length() > 105) {
								logger.error("############ Error in Stmt City ");
								return ("Error in Stmt City");
							}
							if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtCountry())
									|| accountCreationData.getAccountDetails().getStmtCountry().length() > 105) {
								logger.error("############ Error in Stmt Country ");
								return ("Error in Stmt Country");
							}
						} else
							if (!accountCreationData.getAccountDetails().getStmtDelivery().equalsIgnoreCase("Estmt")) {
								logger.error("############ Invalid value for Statement Delivery ");
							return ("Invalid value for Statement Delivery");
						}
					}

					// Check for Internet banking
					if (accountCreationData.getAccountDetails().getNeedInternetBanking()) {
						if (!CommonUtils
								.checkNullorBlank(accountCreationData.getAccountDetails().getInternetBankingUn())
								|| accountCreationData.getAccountDetails().getInternetBankingUn().length() > 20) {
							logger.error("############ Please enter a username for internet banking ");
							return ("Please enter a username for internet banking");
						}
					}

					// Check if user has opted for transactions thru email
					if (accountCreationData.getAccountDetails().getOptTransactionsThruEmail()) {
						if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAuthEmail1())
								|| accountCreationData.getAccountDetails().getAuthEmail1().length() > 255) {
							logger.error("############ Error in Auth email 1 ");
							return ("Error in Auth email 1");
						}
						if (!accountCreationData.getAccountDetails().getAuthEmail1().isEmpty()
								&& accountCreationData.getAccountDetails().getAuthEmail2().length() > 255) {
							logger.error("############ Error in Auth email 2 ");
							return ("Error in Auth email 2");
						}
						if (!accountCreationData.getAccountDetails().getAuthEmail1().isEmpty()
								&& accountCreationData.getAccountDetails().getAuthEmail2().length() > 255) {
							logger.error("############ Error in Auth email 3 ");
							return ("Error in Auth email 3");
						}
					}

					// Check if opted for call back services
					if (accountCreationData.getAccountDetails().getOptCallBackServices()) {
						if (accountCreationData.getAccountDetails().getNomineeInfo().size() == 0) {
							logger.error("############ Please enter Nominee information ");
							return ("Please enter Nominee information");
						}

						int cntr = 0;
						for (NomineeInfo n : accountCreationData.getAccountDetails().getNomineeInfo()) {

							if (!CommonUtils.checkNullorBlank(n.getNomineeName()) && cntr == 0) {
								logger.error("############ Error in Nominee name ");
								return ("Error in Nominee name");
							}
							if (!CommonUtils.checkNullorBlank(n.getNomineeId()) && cntr == 0) {
								logger.error("############ Error in Nominee Id ");
								return ("Error in Nominee Id");
							}
							if (!CommonUtils.checkNullorBlank(n.getNomineeEmail()) && cntr == 0) {
								logger.error("############ Error in Nominee Email ");
								return ("Error in Nominee Email");
							}
							if (n.getNomineeCallbkNo() == 0 && cntr == 0) {
								logger.error("############ Error in Nominee Call bk No ");
								return ("Error in Nominee Call bk No");
							}
							cntr++;
						}
					}
				}
			}
		}
		return ("Success");
	}

	private String validateApplicant(Data accountCreationData, ApplicantDetails applicant, ApplicantDetails guardian,
			String customerType) {

		// System.out.println("Applicant Details:: " + applicant.toString());
		// Primary applicant information
		// Check DOB to identify if customer is minor. If not minor, check for
		// below fields.
		Date currentDate = new Date();
		Calendar firstCalendar = Calendar.getInstance();
		firstCalendar.setTime(applicant.getDob()); // set the time as the first
													// java.util.Date
		Calendar secondCalendar = Calendar.getInstance();
		secondCalendar.setTime(currentDate); // set the time as the second
												// java.util.Date
		int year = Calendar.YEAR;
		int month = Calendar.MONTH;
		int age = secondCalendar.get(year) - firstCalendar.get(year);
		if (age > 0 && (secondCalendar.get(month) < firstCalendar.get(month))) {
			age--;
		}

		if (!CommonUtils.checkNullorBlank(applicant.getResidencyStatus())) {
			logger.error(customerType + " : Error in Primary Applicant Residency Status");
			return (customerType + ":Error in Primary Applicant Residency Status");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getTitle())) {
			logger.error(customerType + " : Error in Title");
			return (customerType + ":Error in Title");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getFirstName()) || applicant.getFirstName().length() > 105) {
			logger.error(customerType + " : Error in First Name");
			return (customerType + ":Error in First Name");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getLastName()) || applicant.getLastName().length() > 105) {
			logger.error(customerType + " : Error in Last Name");
			return (customerType + ":Error in Last Name");
		}
		if (!applicant.getMaidenName().isEmpty() && applicant.getMaidenName().length() > 105) {
			logger.error(customerType + " : Error in Maiden Name");
			return (customerType + ":Error in Maiden Name");
		}
		if (applicant.getResidencyStatus().equals("RESIDENT") && !CommonUtils.checkNullorBlank(applicant.getNic())) {
			if (!CommonUtils.checkNullorBlank(applicant.getPassportNo())) {
				logger.error(customerType + " : Need NIC or Passport information for customer");
				return (customerType + ":Need NIC or Passport information for customer");
			}
			if (applicant.getPassportNo().length() > 20) {
				logger.error(customerType + " : Error in Passort No");
				return (customerType + ":Error in Passort No");
			}
		}
		if (applicant.getResidencyStatus().equals("NON_RES")
				&& (!CommonUtils.checkNullorBlank(applicant.getPassportNo())
						|| applicant.getPassportNo().length() > 20)) {
			logger.error(customerType + " : Error in Passport No for Non resident");
			return (customerType + ":Error in Passport No for Non resident");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getCountryBirth()) || applicant.getCountryBirth().length() > 3) {
			logger.error(customerType + " : Error in Birth Country");
			return (customerType + ":Error in Birth Country");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getNationality()) || applicant.getNationality().length() > 3) {
			logger.error(customerType + " : Error in Nationality");
			return (customerType + ":Error in Nationality");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getEmail()) || applicant.getEmail().length() > 255) {
			logger.error(customerType + " : Error in Email");
			return (customerType + ":Error in Email");
		}
		if (applicant.getDob() == null) {
			logger.error(customerType + " : Error in DoB ");
			return (customerType + ":Error in DoB");
		}
		if (applicant.getIsEmployee() || applicant.getIsExistingCustomer()) {
			if (!CommonUtils.checkNullorBlank(applicant.getCustomerCIF()) || applicant.getCustomerCIF().length() > 9) {
				logger.error(customerType + " : Error in Customer CIF");
				return (customerType + ":Error in Customer CIF");
			}
		}

		if (age >= 18) {
			if (!CommonUtils.checkNullorBlank(applicant.getMaritialStatus())
					|| applicant.getMaritialStatus().length() > 1) {
				logger.error(customerType + " : Error in Maritial Status");
				return (customerType + ":Error in Maritial Status");
			} else {
				String[] arr = { "S", "M", "D", "R", "P", "E" };
				int i;
				for (i = 0; i < arr.length; i++) {
					if (arr[i].equalsIgnoreCase(applicant.getMaritialStatus())) {
						logger.error(customerType + " I was here in mar status");
						System.out.println("I was here in mar status");
						break;
					}
				}
				if (i == arr.length) {
					logger.error(customerType + ":Maritial status is incorrect"+ " " + i);
					return (customerType + ":Maritial status is incorrect" + " " + i);
				}
			}
		}
		if (!CommonUtils.checkNullorBlank(applicant.getPermAddr1()) || applicant.getPermAddr1().length() > 105) {
			logger.error(customerType + ":Error in Perm Address 1");
			return (customerType + ":Error in Perm Address 1");
		}
		if (!applicant.getPermAddr2().isEmpty() && applicant.getPermAddr2().length() > 105) {
			logger.error(customerType + ":Error in Perm Address 2");
			return (customerType + ":Error in Perm Address 2");
		}
		if (!applicant.getPermAddr3().isEmpty() && applicant.getPermAddr3().length() > 105) {
			logger.error(customerType + ":Error in Perm Address 3");
			return (customerType + ":Error in Perm Address 3");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getPermCity()) || applicant.getPermCity().length() > 105) {
			logger.error(customerType + ":Error in Perm City");
			return (customerType + ":Error in Perm City");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getPermCountry()) || applicant.getPermCountry().length() > 4) {
			logger.error(customerType + ":Error in Perm Country");
			return (customerType + ":Error in Perm Country");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getMailAddr1()) || applicant.getMailAddr1().length() > 105) {
			logger.error(customerType + ":Error in Mail Address 1");
			return (customerType + ":Error in Mail Address 1");
		}
		if (!applicant.getMailAddr2().isEmpty() && applicant.getMailAddr2().length() > 105) {
			logger.error(customerType + ":Error in Mail Address 2");
			return (customerType + ":Error in Mail Address 2");
		}
		if (!applicant.getMailAddr3().isEmpty() && applicant.getMailAddr3().length() > 105) {
			logger.error(customerType + ":Error in Mail Address 3");
			return (customerType + ":Error in Mail Address 3");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getMailCity()) || applicant.getMailCity().length() > 105) {
			logger.error(customerType + ":Error in Mail City");
			return (customerType + ":Error in Mail City");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getMailCountry()) || applicant.getMailCountry().length() > 3) {
			logger.error(customerType + ":Error in Mail Country");
			return (customerType + ":Error in Mail Country");
		}
		//
		if (applicant.getTelNoHome() == null) {
			logger.error(customerType + ":Error in Home Tel no");
			return (customerType + ":Error in Home Tel no");
		}
		if (applicant.getTelNoOff() == null) {
			logger.error(customerType + ":Error in Office Tel no");
			return (customerType + ":Error in Office Tel no");
		}
		if (applicant.getMobNo() == null) {
			logger.error(customerType + ":Error in Mobile No");
			return (customerType + ":Error in Mobile No");
		}

		if (age >= 18) {
			if (!CommonUtils.checkNullorBlank(applicant.getEmploymentStatus())
					|| applicant.getEmploymentStatus().length() > 1) {
				logger.error(customerType + ":Error in Employment Status");
				return (customerType + ":Error in Employment Status");
			} else {
				String[] arr = { "F", "U", "S", "P", "R", "N", "O" };
				int i;
				for (i = 0; i < arr.length; i++) {
					if (arr[i].equalsIgnoreCase(applicant.getEmploymentStatus())) {
						break;
					}
				}
				if (i == arr.length) {
					logger.error(customerType + ":Employment status is incorrect");
					return (customerType + ":Employment status is incorrect");
				}
			}

			if (!CommonUtils.checkNullorBlank(applicant.getCurrentOccupation())
					&& (applicant.getEmploymentStatus().equalsIgnoreCase("F")
							|| applicant.getEmploymentStatus().equalsIgnoreCase("S"))) {
				logger.error(customerType + ":Error in Current Occupation");
				return (customerType + ":Error in Current Occupation");
			}
		}

		// If employed, check if user has entered employment details
		if ("F".equalsIgnoreCase(applicant.getEmploymentStatus())) {
			if (!CommonUtils.checkNullorBlank(applicant.getEmployerName())
					|| applicant.getEmployerName().length() > 105) {
				logger.error(customerType + ":Error in Employer Name");
				return (customerType + ":Error in Employer Name");
			}
			if (!CommonUtils.checkNullorBlank(applicant.getEmployerAddr1())
					|| applicant.getEmployerAddr1().length() > 105) {
				logger.error(customerType + ":Error in Employer Address 1");
				return (customerType + ":Error in Employer Address 1");
			}
			if (!applicant.getEmployerAddr2().isEmpty() && applicant.getEmployerAddr2().length() > 105) {
				logger.error(customerType + ":Error in Employer Address 2");
				return (customerType + ":Error in Employer Address 2");
			}
			if (!applicant.getEmployerAddr3().isEmpty() && applicant.getEmployerAddr3().length() > 105) {
				logger.error(customerType + ":Error in Employer Address 3");
				return (customerType + ":Error in Employer Address 3");
			}
			if (!CommonUtils.checkNullorBlank(applicant.getEmployerCity())
					|| applicant.getEmployerCity().length() > 105) {
				logger.error(customerType + ":Error in Employer City");
				return (customerType + ":Error in Employer City");
			}
			if (!CommonUtils.checkNullorBlank(applicant.getEmployerCountry())
					|| applicant.getEmployerCountry().length() > 3) {
				logger.error(customerType + ":Error in Employer Country");
				return (customerType + ":Error in Employer Country");
			}
			if (!(applicant.getNoYearsService() > 0)) {
				logger.error(customerType + ":Error in No of Years if service should be more than 0");
				return (customerType + ":Error in No of Years if service should be more than 0");
			}
		}

		// If self-employed, check if user has entered details
		if ("S".equalsIgnoreCase(applicant.getEmploymentStatus())) {
			if (!CommonUtils.checkNullorBlank(applicant.getBusinessSector())
					|| applicant.getBusinessSector().length() > 105) {
				logger.error(customerType + ":Error in Business Sector");
				return (customerType + ":Error in Business Sector");
			}

			if (applicant.getDateStarted() == null) {
				logger.error(customerType + ":Error in Business Sector Start Date");
				return (customerType + ":Error in Business Sector Start Date");
			}
		}

		System.out.println("Current Date:" + currentDate + "DOB:" + applicant.getDob() + "AGE" + age);
		if (age >= 18) {
			if (applicant.getNetMonthlyIncome() < 50000 || applicant.getNetMonthlyIncome() > 1000000000) {
				logger.error(customerType + ":Error in Net Monthly Income");
				return (customerType + ":Error in Net Monthly Income");
			}
			if (applicant.getAnnualDepositTurnover() < 1000000 || applicant.getAnnualDepositTurnover() > 1000000000) {
				logger.error(customerType + ":Error in Annual Deposit Turnover");
				return (customerType + ":Error in Annual Deposit Turnover");
			}
		}
		if (applicant.getiSUSCitizen() || applicant.getIsIncomeTaxableinUSA()) {
			if ((!CommonUtils.checkNullorBlank(applicant.getUsaSsn()) || applicant.getUsaSsn().length() > 11)) {
				logger.error(customerType + ":Error in SSN");
				return (customerType + ":Error in SSN");
			}
		}
		if (applicant.getResidencyStatus().equals("NON_RES") && age >= 18) {
			if (!CommonUtils.checkNullorBlank(applicant.getoAddr1()) || applicant.getoAddr1().length() > 105) {
				logger.error(customerType + ":Error in Overseas Address 1");
				return (customerType + ":Error in Overseas Address 1");
			}
			if (!applicant.getoAddr2().isEmpty() && applicant.getoAddr2().length() > 105) {
				logger.error(customerType + ":Error in Overseas Address 2");
				return (customerType + ":Error in Overseas Address 2");
			}
			if (!applicant.getoAddr3().isEmpty() && applicant.getoAddr3().length() > 105) {
				logger.error(customerType + ":Error in Overseas Address 3");
				return (customerType + ":Error in Overseas Address 3");
			}
			if (!CommonUtils.checkNullorBlank(applicant.getoCity()) || applicant.getoCity().length() > 105) {
				logger.error(customerType + ":Error in Overseas City");
				return (customerType + ":Error in Overseas City");
			}
			if (!CommonUtils.checkNullorBlank(applicant.getoCountry()) || applicant.getoCountry().length() > 3) {
				logger.error(customerType + ":Error in Overseas Country");
				return (customerType + ":Error in Overseas Country");
			}
			if (applicant.getWorkPermitExpDate() == null) {
				logger.error(customerType + ":Error in Work Permit Expiry Date");
				return (customerType + ":Error in Work Permit Expiry Date");
			}
		}
		if (applicant.getIncomeOtherCountryTaxable()) {
			if (!CommonUtils.checkNullorBlank(applicant.getCrsTin1())) {
				logger.error(customerType + ":Error in CRS Tin1");
				return (customerType + ":Error in CRS Tin1");
			}
			if (!CommonUtils.checkNullorBlank(applicant.getCrsCountryResidence1())
					|| applicant.getCrsCountryResidence1().length() > 3) {
				logger.error(customerType + ":Error in CRS Country");
				return (customerType + ":Error in CRS Country");
			}
		}

		// Check if guardian details are correct.
		System.out.println("Age is ::" + age);
		if (age < 18 && !customerType.equalsIgnoreCase("Guardian")) {
			if (guardian == null) {
				logger.error(customerType + ":The customer is a minor. Please enter guardian details.");
				return (customerType + ":The customer is a minor. Please enter guardian details.");
			}
			System.out.println("Inside Guardian ::" + guardian);

			String guardianValidated = validateApplicant(accountCreationData, guardian, null, "Guardian");
			if (!guardianValidated.equalsIgnoreCase("Success")) {
				logger.error("guardianValidated is not equal to success");
				return guardianValidated;
			}
		}
		return ("Success");

	}

	public void sendEmailToCustomer(){
		String host = afrAsiaMailConfig.getMailhost();
		String port = afrAsiaMailConfig.getMailport();
		String mailFrom = afrAsiaMailConfig.getMailFrom();
		String password = afrAsiaMailConfig.getMailPassword();
		String smtpAuthRequired=afrAsiaMailConfig.getSmtpAuthRequired();
		String smtpAuthstarttls=afrAsiaMailConfig.getSmtpAuthRequired();
		String toAddress="neha.marda@gmail.com";
		String subject="Test Mail";

		String message="Dear [First Name]," +
				"Welcome to AfrAsia Bank and thank you for choosing us as your banking partner. Your application is currently under process with application number [XXX]. We shall update you as soon as your account is opened." +
				"In the meantime, we invite you to browse our website www.afrasiabank.com for a detailed overview of our banking solutions, and our pioneering rewards programme, AfrAsia XtraMiles." +
				"We remain at your disposal should you wish to discuss about your financial aspirations and how we can be of more relevance to you." +
				"Thank you for your trust and we hope that our team measures up to your expectations." +
				"Kind regards," + 
				"Relationship manager (name)";



		try {
			AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, toAddress, subject, message, smtpAuthRequired, smtpAuthstarttls);
			logger.error("EMail sent success");
			System.out.println("EMail sent success");
		} catch (AddressException e) {
			logger.error("AddressException found : "+e.getMessage());
			e.printStackTrace();
		} catch (MessagingException e) {
			logger.error("MessagingException found : "+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("IOException found : "+e.getMessage());
			e.printStackTrace();
		} catch (NamingException e) {
			logger.error("NamingException found : "+e.getMessage());
			e.printStackTrace();
		}
	}


	public void sendSMSToCustomer(String text){
		String url = "http://41.212.214.205:81/cgi-bin/BMP_SendTextMsg?"
				+ "UserName=afrasia1&PassWord=4fr4s14&UserData="
				+ text
				+ "&Concatenated=0&SenderId=23052581818&Deferred=false&Number="
				+ "23051234567"
				+ "&Dsr=false";
	}	}
