package com.afrAsia.service.impl;


import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.UpdateCifOrShortnameDAO;
import com.afrAsia.entities.request.UpdateCifOrShortnameRequest;
import com.afrAsia.entities.response.UpdateCifOrShortnameResponse;
import com.afrAsia.entities.response.UpdateCifOrShortnameResponse.Data;
import com.afrAsia.entities.transactions.MainTableCompositePK;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.service.UpdateCifOrShortnameService;

public class UpdateCifOrShortnameServiceImpl implements UpdateCifOrShortnameService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private UpdateCifOrShortnameDAO updateCifOrShortnameDAO;

	
	public UpdateCifOrShortnameDAO getUpdateCifOrShortnameDAO() {
		return updateCifOrShortnameDAO;
	}

	public void setUpdateCifOrShortnameDAO(UpdateCifOrShortnameDAO updateCifOrShortnameDAO) {
		this.updateCifOrShortnameDAO = updateCifOrShortnameDAO;
	}


	@Override
	public String toString() {
		return "UpdateCifOrShortnameServiceImpl [updateCifOrShortnameDAO=" + updateCifOrShortnameDAO + "]";
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public UpdateCifOrShortnameResponse updateCifOrShortname(UpdateCifOrShortnameRequest updateCifOrShortnameRequest) {
		Data data = new UpdateCifOrShortnameResponse().new Data();
		UpdateCifOrShortnameResponse updateCifOrShortnameResponse=new UpdateCifOrShortnameResponse();
		MobApplicantPersonalDetail mobApplicantPersonalDetail = new MobApplicantPersonalDetail();
		mobApplicantPersonalDetail.setCustCif(updateCifOrShortnameRequest.getData().getCif());
		mobApplicantPersonalDetail.setShortName(updateCifOrShortnameRequest.getData().getShortname());
		mobApplicantPersonalDetail.setId(new MainTableCompositePK());
		mobApplicantPersonalDetail.getId().setId(updateCifOrShortnameRequest.getData().getRefId());
		mobApplicantPersonalDetail.getId().setApplicantId(updateCifOrShortnameRequest.getData().getApplicantId());

		if(mobApplicantPersonalDetail.getCustCif()!=null && !"".equals(mobApplicantPersonalDetail.getCustCif()))
		{
			if(mobApplicantPersonalDetail.getShortName()!=null && !"".equals(mobApplicantPersonalDetail.getShortName()))
			{
					updateCifOrShortnameDAO.updateCifAndShortname(mobApplicantPersonalDetail);			
			}
			else
			{
				updateCifOrShortnameDAO.updateCif(mobApplicantPersonalDetail);
			}
		}
		else if(mobApplicantPersonalDetail.getShortName()!=null && !"".equals(mobApplicantPersonalDetail.getShortName()))
		{
			updateCifOrShortnameDAO.updateShortname(mobApplicantPersonalDetail);
		}
		data.setSuccess("Y");
		updateCifOrShortnameResponse.setData(data);
		debugLog.debug(" updateCifOrShortnameResponse is : "+updateCifOrShortnameResponse.toString());
		return updateCifOrShortnameResponse;
	}


	
}