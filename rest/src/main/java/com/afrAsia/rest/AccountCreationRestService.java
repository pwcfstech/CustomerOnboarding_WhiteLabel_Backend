package com.afrAsia.rest;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import org.slf4j.Logger;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.CommonUtils;
import com.afrAsia.Utils.AfrAsiaEmailUtility;
import com.afrAsia.Utils.AfrAsiaMailConfig;
import com.afrAsia.Utils.AfrAsiaSMSUtility;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.AccountCreationRequest.Data;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.JointApplicants;
import com.afrAsia.entities.response.AccountCreateResponse;
import com.afrAsia.service.AccountCreationService;

@Component
@Path("{version}")
public class AccountCreationRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
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
	public Response createAccount(AccountCreationRequest accountCreationRequest,@HeaderParam("Authorization") String authToken) {
		
		infoLog.info("Enter in createApplication Service");
		debugLog.debug("accountCreationRequest :: "+accountCreationRequest);
		
		AccountCreateResponse accountCreationResponse = new AccountCreateResponse();
		
		MsgHeader msgHeader = new MsgHeader();

		try {
			//authToken = authToken.replace("bearer ", "");
			//accountCreationService.checkSession(accountCreationRequest.getData().getRmId(),"client_credentials", authToken);
			String checkRequest = validateRequest(accountCreationRequest);
			if (checkRequest.equals("Success")) {
				if (accountCreationRequest.getData().getAppRefNo() == null) {
					infoLog.info("Entered in create account Service");					
					accountCreationResponse = accountCreationService.createAccount(accountCreationRequest);

					sendEmails(accountCreationRequest,accountCreationResponse);

					//sendEmailToCustomer(accountCreationRequest,accountCreationResponse);
					//sendSMSToCustomer(accountCreationRequest,accountCreationResponse);

				} else {
					if (accountCreationRequest.getData().getRecordId() != null) {
						{
							try {
								if (!accountCreationRequest.getData().getComment().isEmpty()
										|| accountCreationRequest.getData().getComment() != null
										|| accountCreationRequest.getData().getComment() != " ") {
									infoLog.info("Entered in update account Service");
									accountCreationResponse = accountCreationService
											.updateAccount(accountCreationRequest);
								}
							} catch (NullPointerException e) {
								errorLog.error("please provide comments, its not provided in your update request ",e);
								MsgHeader messageHeader = new MsgHeader();
								MsgHeader.Error error = new MsgHeader().new Error();
								error.setCd("404");
								error.setCustomCode("Comment is null");
								error.setRsn("please provide comments, its not provided in your update request");
								messageHeader.setError(error);
								accountCreationResponse.setMsgHeader(messageHeader);
								errorLog.error("accountCreationResponse in createAccount(),AccountCreationRestService.java ",e);
							}

						}
					} else {
						errorLog.error("please provide recordId, its not provided in your update request ");
						MsgHeader messageHeader = new MsgHeader();
						MsgHeader.Error error = new MsgHeader().new Error();
						error.setCd("404");
						error.setCustomCode("Null record ID");
						error.setRsn("please provide recordId, its not provided in your update request"); 
						messageHeader.setError(error);
						accountCreationResponse.setMsgHeader(messageHeader);
						errorLog.error("accountCreationResponse in createAccount(),AccountCreationRestService.java "+accountCreationResponse);
					}

				}

				if (accountCreationResponse!=null) {
					infoLog.info("Response recieved in create Account service");
					debugLog.debug("accountCreationResponse  is : "+accountCreationResponse);
					return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					errorLog.error("No data from rmApplication ");
				}

			}
			else{
				errorLog.error("checkRequest is : "+checkRequest);
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn(checkRequest);
				msgHeader.setError(error);
				accountCreationResponse.setMsgHeader(msgHeader);
				errorLog.error("accountCreationResponse in createAccount(),AccountCreationRestService.java : "+accountCreationResponse);
				return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();
			}
		} catch (Exception e) {
			errorLog.error(" Sorry, there was an error while creating the account. Please try again later ",e);
			Error error = new MsgHeader().new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error while creating the account. Please try again later.");
			msgHeader.setError(error);
			accountCreationResponse.setMsgHeader(msgHeader);
			errorLog.error(" accountCreationResponse in createAccount(),AccountCreationRestService.java : ",e);
			return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();
		}
		infoLog.info("Exit from createAccount Service");
		debugLog.debug(" accountCreationResponse  : "+accountCreationResponse);
		return Response.ok(accountCreationResponse, MediaType.APPLICATION_JSON).build();

	}

	private String validateRequest(AccountCreationRequest accountCreationRequest) {

		// if (accountCreationRequest != null &&
		// accountCreationRequest.getData() != null) {
		if (accountCreationRequest != null && accountCreationRequest.getData() != null) {

			Data accountCreationData = accountCreationRequest.getData();
			infoLog.info(" accountCreationData in validateRequest(),AccountCreationRestService.java : "+accountCreationData);
			// accountCreationData ======== "+accountCreationData);
			// Validate Account Details
			String accountValidated = validateAccountDetails(accountCreationData);
			// accountValidated ===== "+accountValidated);
			if (!accountValidated.equalsIgnoreCase("Success")) {
				errorLog.error(" accountValidated is not equal to success in validateRequest(),AccountCreationRestService.java");
				return accountValidated;
			}
			// Validate Primary Applicant Details and Guardian Detail
			ApplicantDetails primaryApplicant = accountCreationRequest.getData().getPrimaryApplicantDetail();
			infoLog.info(" primaryApplicant in validateRequest(),AccountCreationRestService.java : "+primaryApplicant);
			// primaryApplicant ======= "+primaryApplicant);
			ApplicantDetails guardianPrimary = accountCreationRequest.getData().getGuardianDetail();
			infoLog.info(" guardianPrimary in validateRequest(),AccountCreationRestService.java : "+guardianPrimary);
			String primaryValidated = validateApplicant(accountCreationData, primaryApplicant, guardianPrimary,
					"Primary");
			infoLog.info(" primaryValidated in validateRequest(),AccountCreationRestService.java : "+primaryValidated);
			// primaryValidated ====== "+primaryValidated);
			if (!primaryValidated.equalsIgnoreCase("Success")) {
				errorLog.error(" primaryValidated is not equal to success in validateRequest(),AccountCreationRestService.java");
				return primaryValidated;
			}

			// Validate Joint holder details
			List<JointApplicants> jointApplicants = accountCreationRequest.getData().getJointApplicants();
			if (accountCreationData.getAccountDetails().getAccountType().equalsIgnoreCase("J")) {
				if (jointApplicants.size() == 0) {
					errorLog.error(" Account Category is joint but there are no joint holders in validateRequest(),AccountCreationRestService.java");
					return ("Account Category is joint but there are no joint holders");
				}
				else if (accountCreationData.getAccountDetails().getIsProxyRequired() && jointApplicants.size() > 0) {
					int proxyCount = 0;
					for (JointApplicants jointDetail : jointApplicants) {
						if(jointDetail.getJointApplicantDetail().getIsProxyHolder()!=null && jointDetail.getJointApplicantDetail().getIsProxyHolder())
						{
							proxyCount++;
						}
					}
					if(proxyCount==0)
					{
						errorLog.error("There should be at least one proxy holder applicant");
						return ("There should be at least one proxy holder applicant");
					}
					else if(proxyCount==jointApplicants.size())
					{
						errorLog.error("There should be at least one non proxy holder applicant.");
						return ("There should be at least one non proxy holder applicant");					
					}
				}
			}
			if (accountCreationData.getAccountDetails().getAccountType().equalsIgnoreCase("S") ) {
				if(!accountCreationData.getAccountDetails().getIsProxyRequired() && jointApplicants.size() > 0)
				{
					errorLog.error(" Account Category is sole but there are joint holders in validateRequest(),AccountCreationRestService.java");
					return ("Account Category is sole but there are joint holders");
				}
				else if (accountCreationData.getAccountDetails().getIsProxyRequired()) {
					if(jointApplicants.size() == 0)
					{
						errorLog.error("Details of proxy holder missing in validateRequest(),AccountCreationRestService.java");
						return ("Details of proxy holder missing");
					}
					else if(jointApplicants.size() > 0)
					{
						for (JointApplicants jointDetail : jointApplicants) {
							if(jointDetail.getJointApplicantDetail().getIsProxyHolder()==null || !jointDetail.getJointApplicantDetail().getIsProxyHolder())
							{
								errorLog.error(" Account Category is sole but there are joint holders in validateRequest(),AccountCreationRestService.java");
								return ("Account Category is sole but there are joint holders");
							}
						}
					}
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
			errorLog.error(" Invalid Request from Create Application in validateRequest(),AccountCreationRestService.java");
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
		
		Date currentDate = new Date();
		Calendar firstCalendar = Calendar.getInstance();
		firstCalendar.setTime(accountCreationData.getPrimaryApplicantDetail().getDob()); // set the time as the first
													// java.util.Date
		Calendar secondCalendar = Calendar.getInstance();
		secondCalendar.setTime(currentDate); // set the time as the second
												// java.util.Date
		int year = Calendar.YEAR;
		int day = Calendar.DAY_OF_YEAR;
		int age = secondCalendar.get(year) - firstCalendar.get(year);
		if (age > 0 && (secondCalendar.get(day) < firstCalendar.get(day))) {
			age--;
		}

		if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccount())
				|| accountCreationData.getAccountDetails().getAccount().length() > 6) {
			errorLog.error(" Error in account type  in validateAccountDetails(),AccountCreationRestService.java ::"
					+ CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccount()) + "   "
					+ accountCreationData.getAccountDetails().getAccount().length());
			return ("Error in account type  in validateAccountDetails(),AccountCreationRestService.java ::"
					+ CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccount()) + "   "
					+ accountCreationData.getAccountDetails().getAccount().length());
		}
		if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAccountType())
				|| accountCreationData.getAccountDetails().getAccountType().length() > 1) {
			errorLog.error(" Error in account category in validateAccountDetails(),AccountCreationRestService.java");
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
				errorLog.error(" Account Category is incorrect in validateAccountDetails(),AccountCreationRestService.java");
				return ("Account Category is incorrect");
			}
		}

		if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getIbOption())) {
			errorLog.error(" Error in Internet Banking Option in validateAccountDetails(),AccountCreationRestService.java");
			return ("Error in Internet Banking Option");
		}
					// Check for Statement delivery type
				
					if((age>18 && !CommonUtils.checkNullorBlank(accountCreationData.getPrimaryApplicantDetail().getCustomerCIF())) || (age<=18 && !CommonUtils.checkNullorBlank(accountCreationData.getGuardianDetail().getCustomerCIF())))
					{
						if (accountCreationData.getAccountDetails().getStmtDeliveryPo()) {
							if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtAddr1())
									|| accountCreationData.getAccountDetails().getStmtAddr1().length() > 105) {
								errorLog.error(" Error in Stmt Address 1 in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Stmt Address 1");
							}
							if (!accountCreationData.getAccountDetails().getStmtAddr2().isEmpty()
									&& accountCreationData.getAccountDetails().getStmtAddr2().length() > 105) {
								errorLog.error(" Error in Stmt Address 2 in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Stmt Address 2");
							}
							if (!accountCreationData.getAccountDetails().getStmtAddr3().isEmpty()
									&& accountCreationData.getAccountDetails().getStmtAddr3().length() > 105) {
								errorLog.error(" Error in Stmt Address 3 in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Stmt Address 3");
							}
							if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtCity())
									|| accountCreationData.getAccountDetails().getStmtCity().length() > 105) {
								errorLog.error(" Error in Stmt City in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Stmt City");
							}
							if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getStmtCountry())
									|| accountCreationData.getAccountDetails().getStmtCountry().length() > 105) {
								errorLog.error(" Error in Stmt Country in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Stmt Country");
							}
						} else
							if (!accountCreationData.getAccountDetails().getStmtDeliveryEstmt()) {
								errorLog.error(" Invalid value for Statement Delivery in validateAccountDetails(),AccountCreationRestService.java");
							return ("Invalid value for Statement Delivery");
						}
					}

					// Check for Internet banking
					if (accountCreationData.getAccountDetails().getNeedInternetBanking()) {
						if (!CommonUtils
								.checkNullorBlank(accountCreationData.getAccountDetails().getInternetBankingUn())
								|| accountCreationData.getAccountDetails().getInternetBankingUn().length() > 20) {
							errorLog.error(" Please enter a username for internet banking in validateAccountDetails(),AccountCreationRestService.java");
							return ("Please enter a username for internet banking");
						}
						
					}

					// Check if user has opted for transactions thru email
					if (accountCreationData.getAccountDetails().getOptTransactionsThruEmail()) {
						if (!CommonUtils.checkNullorBlank(accountCreationData.getAccountDetails().getAuthEmail1())
								|| accountCreationData.getAccountDetails().getAuthEmail1().length() > 255) {
							errorLog.error(" Error in Auth email 1 in validateAccountDetails(),AccountCreationRestService.java");
							return ("Error in Auth email 1");
						}
						if (!accountCreationData.getAccountDetails().getAuthEmail1().isEmpty()
								&& accountCreationData.getAccountDetails().getAuthEmail2().length() > 255) {
							errorLog.error(" Error in Auth email 2 in validateAccountDetails(),AccountCreationRestService.java");
							return ("Error in Auth email 2");
						}
						if (!accountCreationData.getAccountDetails().getAuthEmail1().isEmpty()
								&& accountCreationData.getAccountDetails().getAuthEmail2().length() > 255) {
							errorLog.error(" Error in Auth email 3 in validateAccountDetails(),AccountCreationRestService.java");
							return ("Error in Auth email 3");
						}
					}

					// Check if opted for call back services
					//if (accountCreationData.getAccountDetails().getOptCallBackServices()) {
						/*if (accountCreationData.getAccountDetails().getNomineeInfo().size() > 0) {
						int cntr = 0;
						for (NomineeInfo n : accountCreationData.getAccountDetails().getNomineeInfo()) {

							if (!CommonUtils.checkNullorBlank(n.getNomineeName()) && cntr == 0) {
								errorLog.error(" Error in Nominee name in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Nominee name");
							}
							if (!CommonUtils.checkNullorBlank(n.getNomineeId()) && cntr == 0) {
								errorLog.error(" Error in Nominee Id in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Nominee Id");
							}
							if (!CommonUtils.checkNullorBlank(n.getNomineeEmail()) && cntr == 0) {
								errorLog.error(" Error in Nominee Email in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Nominee Email");
							}
							if ((n.getNomineeCallbkNo()==null||"".equals(n.getNomineeCallbkNo())||n.getNomineeCallbkNo()==0L) && cntr == 0) {
								errorLog.error(" Error in Nominee Call bk No in validateAccountDetails(),AccountCreationRestService.java");
								return ("Error in Nominee Call bk No");
							}
							cntr++;
						}
					}*/
		infoLog.info("return Success");
		return ("Success");
	}

	private String validateApplicant(Data accountCreationData, ApplicantDetails applicant, ApplicantDetails guardian,
			String customerType) {

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
		int day = Calendar.DAY_OF_YEAR;
		int age = secondCalendar.get(year) - firstCalendar.get(year);
		infoLog.info(customerType +" : age in validateApplicant(),AccountCreationRestService.java at line 389 is : "+age);
		if (age > 0 && (secondCalendar.get(day) < firstCalendar.get(day))) {
			age--;
		}

		if (!CommonUtils.checkNullorBlank(applicant.getResidencyStatus())) {
			errorLog.error(customerType + " : Error in Primary Applicant Residency Status in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Primary Applicant Residency Status");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getTitle())) {
			errorLog.error(customerType + " : Error in Title in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Title");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getFirstName()) || applicant.getFirstName().length() > 105) {
			errorLog.error(customerType + " : Error in First Name in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in First Name");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getLastName()) || applicant.getLastName().length() > 105) {
			errorLog.error(customerType + " : Error in Last Name in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Last Name");
		}
		if (!applicant.getMaidenName().isEmpty() && applicant.getMaidenName().length() > 105) {
			errorLog.error(customerType + " : Error in Maiden Name in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Maiden Name");
		}
		if (applicant.getResidencyStatus().equals("RESIDENT") && !CommonUtils.checkNullorBlank(applicant.getNic())) {
			if (!CommonUtils.checkNullorBlank(applicant.getPassportNo())) {
				errorLog.error(customerType + " : Need NIC or Passport information for customer in validateApplicant(),AccountCreationRestService.java");
				return (customerType + ":Need NIC or Passport information for customer");
			}
			if (applicant.getPassportNo().length() > 20) {
				errorLog.error(customerType + " : Error in Passort No in validateApplicant(),AccountCreationRestService.java");
				return (customerType + ":Error in Passort No");
			}
		}
		if (applicant.getResidencyStatus().equals("NON_RES")
				&& (!CommonUtils.checkNullorBlank(applicant.getPassportNo())
						|| applicant.getPassportNo().length() > 20)) {
			errorLog.error(customerType + " : Error in Passport No for Non resident in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Passport No for Non resident");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getCountryBirth()) || applicant.getCountryBirth().length() > 3) {
			errorLog.error(customerType + " : Error in Birth Country in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Birth Country");
		}
		if (!CommonUtils.checkNullorBlank(applicant.getNationality()) || applicant.getNationality().length() > 3) {
			errorLog.error(customerType + " : Error in Nationality in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in Nationality");
		}
		
		if(!CommonUtils.checkNullorBlank(applicant.getCustomerCIF()) && age>18)
		{
			if (!CommonUtils.checkNullorBlank(applicant.getEmail()) || applicant.getEmail().length() > 255) {
				errorLog.error(customerType + " : Error in Email in validateApplicant(),AccountCreationRestService.java");
				return (customerType + ":Error in Email");
			}
		}
		if (applicant.getDob() == null) {
			errorLog.error(customerType + " : Error in DoB in validateApplicant(),AccountCreationRestService.java");
			return (customerType + ":Error in DoB");
		}
		if (applicant.getIsExistingCustomer()) {
			if (!CommonUtils.checkNullorBlank(applicant.getCustomerCIF()) || applicant.getCustomerCIF().length() > 9) {
				errorLog.error(customerType + " : Error in Customer CIF in validateApplicant(),AccountCreationRestService.java");
				return (customerType + ":Error in Customer CIF");
			}
		}

		if (age > 18) {
			if (!CommonUtils.checkNullorBlank(applicant.getMaritialStatus())
					|| applicant.getMaritialStatus().length() > 1) {
				errorLog.error(customerType + " : Error in Maritial Status in validateApplicant(),AccountCreationRestService.java");
				return (customerType + ":Error in Maritial Status");
			} else {
				String[] arr = { "S", "M", "D", "R", "P", "E" };
				int i;
				for (i = 0; i < arr.length; i++) {
					if (arr[i].equalsIgnoreCase(applicant.getMaritialStatus())) {
						infoLog.info(customerType + " I was here in mar status in validateApplicant(),AccountCreationRestService.java");
						break;
					}
				}
				if (i == arr.length) {
					errorLog.error(customerType + ":Maritial status is incorrect in validateApplicant(),AccountCreationRestService.java"+ " " + i);
					return (customerType + ":Maritial status is incorrect" + " " + i);
				}
			}
		}
		
		if(!CommonUtils.checkNullorBlank(applicant.getCustomerCIF()))
		{
			if (age > 18) {
				if (!CommonUtils.checkNullorBlank(applicant.getPermAddr1()) || applicant.getPermAddr1().length() > 105) {
					errorLog.error(customerType + ":Error in Perm Address 1 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Perm Address 1");
				}
				if (!applicant.getPermAddr2().isEmpty() && applicant.getPermAddr2().length() > 105) {
					errorLog.error(customerType + ":Error in Perm Address 2 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Perm Address 2");
				}
				if (!applicant.getPermAddr3().isEmpty() && applicant.getPermAddr3().length() > 105) {
					errorLog.error(customerType + ":Error in Perm Address 3 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Perm Address 3");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getPermCity()) || applicant.getPermCity().length() > 105) {
					errorLog.error(customerType + ":Error in Perm City in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Perm City");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getPermCountry()) || applicant.getPermCountry().length() > 4) {
					errorLog.error(customerType + ":Error in Perm Country in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Perm Country");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getMailAddr1()) || applicant.getMailAddr1().length() > 105) {
					errorLog.error(customerType + ":Error in Mail Address 1 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Mail Address 1");
				}
				if (!applicant.getMailAddr2().isEmpty() && applicant.getMailAddr2().length() > 105) {
					errorLog.error(customerType + ":Error in Mail Address 2 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Mail Address 2");
				}
				if (!applicant.getMailAddr3().isEmpty() && applicant.getMailAddr3().length() > 105) {
					errorLog.error(customerType + ":Error in Mail Address 3 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Mail Address 3");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getMailCity()) || applicant.getMailCity().length() > 105) {
					errorLog.error(customerType + ":Error in Mail City in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Mail City");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getMailCountry()) || applicant.getMailCountry().length() > 3) {
					errorLog.error(customerType + ":Error in Mail Country in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Mail Country");
				}
				/*if (applicant.getTelNoHome() == null) {
					errorLog.error(customerType + ":Error in Home Tel no in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Home Tel no");
				}
				if (applicant.getTelNoOff() == null) {
					errorLog.error(customerType + ":Error in Office Tel no in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Office Tel no");
				}*/
				if (applicant.getMobNo() == null && applicant.getTelNoHome() == null) {
					errorLog.error(customerType + ":Either Mobile No or Home Telephone No should be available in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Either Mobile No or Home Telephone No should be available");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getSex())) {
					errorLog.error(customerType + ":Error in Sex in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Sex");
				}
			
				if (!CommonUtils.checkNullorBlank(applicant.getEmploymentStatus())
						|| applicant.getEmploymentStatus().length() > 1) {
					errorLog.error(customerType + ":Error in Employment Status in validateApplicant(),AccountCreationRestService.java");
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
						errorLog.error(customerType + ":Employment status is incorrect in validateApplicant(),AccountCreationRestService.java");
						return (customerType + ":Employment status is incorrect");
					}
				}
	
				if (!CommonUtils.checkNullorBlank(applicant.getCurrentOccupation())
						&& (applicant.getEmploymentStatus().equalsIgnoreCase("F")
								|| applicant.getEmploymentStatus().equalsIgnoreCase("S"))) {
					errorLog.error(customerType + ":Error in Current Occupation in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Current Occupation");
				}
			}
	
			// If employed, check if user has entered employment details
			if ("F".equalsIgnoreCase(applicant.getEmploymentStatus())) {
				if (!CommonUtils.checkNullorBlank(applicant.getEmployerName())
						|| applicant.getEmployerName().length() > 105) {
					errorLog.error(customerType + ":Error in Employer Name in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Employer Name");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getEmployerAddr1())
						|| applicant.getEmployerAddr1().length() > 105) {
					errorLog.error(customerType + ":Error in Employer Address 1 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Employer Address 1");
				}
				if (!applicant.getEmployerAddr2().isEmpty() && applicant.getEmployerAddr2().length() > 105) {
					errorLog.error(customerType + ":Error in Employer Address 2 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Employer Address 2");
				}
				if (!applicant.getEmployerAddr3().isEmpty() && applicant.getEmployerAddr3().length() > 105) {
					errorLog.error(customerType + ":Error in Employer Address 3 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Employer Address 3");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getEmployerCity())
						|| applicant.getEmployerCity().length() > 105) {
					errorLog.error(customerType + ":Error in Employer City in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Employer City");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getEmployerCountry())
						|| applicant.getEmployerCountry().length() > 3) {
					errorLog.error(customerType + ":Error in Employer Country in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Employer Country");
				}
				if (!(applicant.getNoYearsService() > 0)) {
					errorLog.error(customerType + ":Error in No of Years if service should be more than 0 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in No of Years if service should be more than 0");
				}
				
				//Added by Avisha on 26/09 as asked by client
				if (!CommonUtils.checkNullorBlank(applicant.getBusinessSector())
						|| applicant.getBusinessSector().length() > 105) {
					errorLog.error(customerType + ":Error in Business Sector in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Business Sector");
				}
			}
	
			// If self-employed, check if user has entered details
			if ("S".equalsIgnoreCase(applicant.getEmploymentStatus())) {
				if (!CommonUtils.checkNullorBlank(applicant.getBusinessSector())
						|| applicant.getBusinessSector().length() > 105) {
					errorLog.error(customerType + ":Error in Business Sector in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Business Sector");
				}
	
				if (applicant.getDateStarted() == null) {
					errorLog.error(customerType + ":Error in Business Sector Start Date in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Business Sector Start Date");
				}
			}
	
			if (age > 18) {
				if (applicant.getNetMonthlyIncome() < 0) {
					errorLog.error(customerType + ":Error in Net Monthly Income in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Net Monthly Income");
				}
				if (applicant.getAnnualDepositTurnover() < 0) {
					errorLog.error(customerType + ":Error in Annual Deposit Turnover in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Annual Deposit Turnover");
				}
			}
			if (applicant.getiSUSCitizen() || applicant.getIsIncomeTaxableinUSA()) {
				if ((!CommonUtils.checkNullorBlank(applicant.getUsaSsn()) || applicant.getUsaSsn().length() > 11)) {
					errorLog.error(customerType + ":Error in SSN in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in SSN");
				}
			}
			if (applicant.getResidencyStatus().equals("NON_RES") && age > 18) {
				if (!CommonUtils.checkNullorBlank(applicant.getoAddr1()) || applicant.getoAddr1().length() > 105) {
					errorLog.error(customerType + ":Error in Overseas Address 1 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Overseas Address 1");
				}
				if (!applicant.getoAddr2().isEmpty() && applicant.getoAddr2().length() > 105) {
					errorLog.error(customerType + ":Error in Overseas Address 2 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Overseas Address 2");
				}
				if (!applicant.getoAddr3().isEmpty() && applicant.getoAddr3().length() > 105) {
					errorLog.error(customerType + ":Error in Overseas Address 3 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Overseas Address 3");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getoCity()) || applicant.getoCity().length() > 105) {
					errorLog.error(customerType + ":Error in Overseas City in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Overseas City");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getoCountry()) || applicant.getoCountry().length() > 3) {
					errorLog.error(customerType + ":Error in Overseas Country in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Overseas Country");
				}
				if (applicant.getWorkPermitExpDate() == null) {
					errorLog.error(customerType + ":Error in Work Permit Expiry Date in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in Work Permit Expiry Date");
				}
			}
			/*if (applicant.getIncomeOtherCountryTaxable()) {
				if (!CommonUtils.checkNullorBlank(applicant.getCrsTin1())) {
					errorLog.error(customerType + ":Error in CRS Tin1 in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in CRS Tin1");
				}
				if (!CommonUtils.checkNullorBlank(applicant.getCrsCountryResidence1())
						|| applicant.getCrsCountryResidence1().length() > 3) {
					errorLog.error(customerType + ":Error in CRS Country in validateApplicant(),AccountCreationRestService.java");
					return (customerType + ":Error in CRS Country");
				}
			}*/
		}
		infoLog.info(customerType +" : age in validateApplicant(),AccountCreationRestService.java at line 657 is : "+age);
		// Check if guardian details are correct.
		if (age <= 18 && !customerType.equalsIgnoreCase("Guardian")) {
			if (guardian == null) {
				errorLog.error(customerType + ":The customer is a minor. Please enter guardian details in validateApplicant(),AccountCreationRestService.java");
				return (customerType + ":The customer is a minor. Please enter guardian details.");
			}

			String guardianValidated = validateApplicant(accountCreationData, guardian, null, "Guardian");
			if (!guardianValidated.equalsIgnoreCase("Success")) {
				errorLog.error("guardianValidated is not equal to success in validateApplicant(),AccountCreationRestService.java");
				return guardianValidated;
			}
		}
		return ("Success");

	}

	public void sendEmails(AccountCreationRequest accountCreationRequest, AccountCreateResponse accountCreationResponse){
		
		String host = afrAsiaMailConfig.getMailhost();
		String port = afrAsiaMailConfig.getMailport();
		String mailFrom = afrAsiaMailConfig.getMailFrom();
		String password = afrAsiaMailConfig.getMailPassword();
		String smtpAuthRequired=afrAsiaMailConfig.getSmtpAuthRequired();
		String smtpAuthstarttls=afrAsiaMailConfig.getSmtpAuthRequired();
		String subject="Welcome to AfrAsia";
		
		infoLog.info("Mail Port" + port);
		infoLog.info("Host is:"+host);
		
		Data accountCreationData = accountCreationRequest.getData();
		String primApplicantName = accountCreationData.getPrimaryApplicantDetail().getFirstName();
		String toAddrClient = accountCreationData.getPrimaryApplicantDetail().getEmail();
		String rmName = "";
		String toAddrRM = "";
		

		RMDetails rmDetails = accountCreationService.getRMDetails(accountCreationData.getRmId());
		if(rmDetails!=null)
		{
			rmName=rmDetails.getRmName();
			toAddrRM=rmDetails.getRmEmailId();
		}
		
		infoLog.info("Ref No :"+accountCreationResponse.getData().getRefNo());
		
		String refNo = "";
		if(accountCreationResponse.getData().getRefNo()!=null)
		{
			refNo=accountCreationResponse.getData().getRefNo().toString();
		}
				
		String messageToClient="Dear "+primApplicantName+"," + "\n" + "\n" +
				"Welcome to AfrAsia Bank and thank you for choosing us as your banking partner. Your application is currently under process with application number "+refNo+". We shall update you as soon as your account is opened."+ "\n" +
				"In the meantime, we invite you to browse our website www.afrasiabank.com for a detailed overview of our banking solutions, and our pioneering rewards programme, AfrAsia XtraMiles."+ "\n" +
				"We remain at your disposal should you wish to discuss about your financial aspirations and how we can be of more relevance to you."+ "\n" +
				"Thank you for your trust and we hope that our team measures up to your expectations."+ "\n" + "\n" +
				"Kind regards," + "\n" + 

				"Relationship manager ("+rmName+")";

		String messageToRM="Dear "+rmName+"," + "\n" + "\n" +
				"The application for applicant "+primApplicantName+"["+refNo+"]"+" has been successfuly submitted and is under review."+ "\n" + "\n" +
				"Kind regards," + "\n" + 

				"AfrAsia Bank";

		debugLog.debug("host :: "+host+","+" port :: "+port+","+" mailFrom :: "+mailFrom+","+" password :: "+password+","
				+" smtpAuthRequired :: "+smtpAuthRequired+","+" smtpAuthstarttls :: "+smtpAuthstarttls+","+" subject :: "+subject
				+" accountCreationData :: "+accountCreationData+" refNo :: "+refNo+" rmName :: "+rmName+","
				+" messageToClient :: "+messageToClient+","+"messageToRM :: "+messageToRM);
		
		try {
			AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, toAddrClient, subject, messageToClient, smtpAuthRequired, smtpAuthstarttls);
			infoLog.info("Customer EMail sent success");
		} catch (MessagingException e) {
			errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
		} catch (IOException e) {
			errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
		} catch (NamingException e) {
			errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
		} catch (Exception e) {
			errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
		}
		
		
		try {
			AfrAsiaEmailUtility.sendEmail(host, port, mailFrom, password, toAddrRM, subject, messageToRM, smtpAuthRequired, smtpAuthstarttls);
			infoLog.info("RM EMail sent success");
		} catch (MessagingException e) {
			errorLog.error("MessagingException found in sendEmails(),AccountCreationRestService.java: ",e);
		} catch (IOException e) {
			errorLog.error("IOException found in sendEmails(),AccountCreationRestService.java: ",e);
		} catch (NamingException e) {
			errorLog.error("NamingException found in sendEmails(),AccountCreationRestService.java: ",e);
		} catch (Exception e) {
			errorLog.error("Exception found in sendEmails(),AccountCreationRestService.java : ",e);
		}
		
	}

	public void sendSMSToCustomer(AccountCreationRequest accountCreationRequest, AccountCreateResponse accountCreationResponse){
		String primApplicantName = accountCreationRequest.getData().getPrimaryApplicantDetail().getFirstName();
		String smsContent = "Dear "+primApplicantName+", thank you for your interest in AfrAsia Bank. "
				+ "Your application is currently under process with application number" 
				+ accountCreationResponse.getData().getRefNo() 
				+ ".We shall update you as soon as your account is opened. Regards, AfrAsia Bank Team";
		String mobNo = accountCreationRequest.getData().getPrimaryApplicantDetail().getMobNoCountryCode().toString()+accountCreationRequest.getData().getPrimaryApplicantDetail().getMobNo().toString();
		String url = "http://41.212.214.205:81/cgi-bin/BMP_SendTextMsg?"
				+ "UserName=afrasia1&PassWord=4fr4s14&UserData="
				+ smsContent
				+ "&Concatenated=0&SenderId=23052581818&Deferred=false&Number="
				+ mobNo
				+ "&Dsr=false";
		
		debugLog.debug("primApplicantName  :: "+primApplicantName+"smsContent  :: "+smsContent+
				"mobNo  :: "+mobNo+"url  :: "+url);
		try {
			AfrAsiaSMSUtility.sendSMS(url);
			infoLog.info("SMS sent success");
		}  catch (IOException e) {
			errorLog.error("IOException found .java : ",e);
		}	catch (Exception e) {
			errorLog.error("Exception found .java : ",e);
		}
	}	
}
