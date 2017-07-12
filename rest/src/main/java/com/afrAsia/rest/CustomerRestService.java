package com.afrAsia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.afrAsia.dao.CountryDao;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.response.MastersResponse;
import com.afrAsia.entities.response.MastersResponse.AccountClass;
import com.afrAsia.entities.response.MastersResponse.Category;
import com.afrAsia.entities.response.MastersResponse.Country;
import com.afrAsia.entities.response.MastersResponse.Employment;
import com.afrAsia.entities.response.MastersResponse.MaritalStatus;
import com.afrAsia.entities.response.MastersResponse.Prefix;
import com.afrAsia.entities.response.MastersResponse.RMDetails;
import com.afrAsia.entities.response.MastersResponse.UIDType;

@Component
@Path("{version}")
public class CustomerRestService {

	//private MastersService mastersService;

	/*public MastersService getMastersService() {
		return mastersService;
	}

	public void setMastersService(MastersService mastersService) {
		this.mastersService = mastersService;
	}*/

	@GET
	@Path("/masters")
	@Produces(MediaType.APPLICATION_XML)
	public String getMastersDetails() {
//public Response getMastersDetails() {
		MastersResponse mastersResponse = new MastersResponse();
		MsgHeader msgHeader = new MsgHeader();
		//CountryDao mastersJpaDAOImpl = new MastersJpaDAOImpl();
		
		

		MastersResponse.Country country = mastersResponse.new Country();
		MastersResponse.AccountClass accountClass = mastersResponse.new AccountClass();
		MastersResponse.Category category = mastersResponse.new Category();
		MastersResponse.Employment employment = mastersResponse.new Employment();
		MastersResponse.MaritalStatus maritalStatus = mastersResponse.new MaritalStatus();
		MastersResponse.Prefix prefix = mastersResponse.new Prefix();
		MastersResponse.RMDetails rmDetails = mastersResponse.new RMDetails();
		MastersResponse.UIDType uidType = mastersResponse.new UIDType();

		/*country = (Country) mastersService.getCountry();
		accountClass = (AccountClass) mastersService.getAccountClass();
		category = (Category) mastersService.getCategory();
		employment = (Employment) mastersService.getEmployment();
		maritalStatus = (MaritalStatus) mastersService.getMaritalStatus();
		prefix = (Prefix) mastersService.getPrefix();
		rmDetails = (RMDetails) mastersService.getRMDetails();
		uidType = (UIDType) mastersService.getUIDType();

		// mastersResponse.setMsgHeader(msgHeader);
		mastersResponse.setAccountClass(accountClass);
		mastersResponse.setCategory(category);
		mastersResponse.setCountry(country);
		mastersResponse.setEmployment(employment);
		mastersResponse.setMaritalStatus(maritalStatus);
		mastersResponse.setPrefix(prefix);
		mastersResponse.setRmDetails(rmDetails);
		mastersResponse.setUidType(uidType);*/
		//return Response.ok(mastersResponse, MediaType.APPLICATION_JSON).build();
		return "HI";
	}

}
