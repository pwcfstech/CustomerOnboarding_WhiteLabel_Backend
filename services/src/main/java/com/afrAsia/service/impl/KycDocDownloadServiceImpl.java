package com.afrAsia.service.impl;

import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.entities.transactions.MobApplicantKycDocuments;


import org.springframework.transaction.annotation.Transactional;
import com.afrAsia.service.KycDocDownloadService;

public class KycDocDownloadServiceImpl implements KycDocDownloadService {
	ApplicationDetailsJpaDAO applicationDetailsDAO;

	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
		return applicationDetailsDAO;
	}

	public void setapplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public String getKycDocPath(Long appRefId, Long applicantId, String docId) {
		MobApplicantKycDocuments mobApplicantKycDoc = applicationDetailsDAO.getKycDocumentDetails(appRefId,applicantId,docId);
		System.out.println("KYC Table entry::" + mobApplicantKycDoc + "doc url" + mobApplicantKycDoc.getDocUrl());
		return mobApplicantKycDoc.getDocUrl();
	  	
	}
}