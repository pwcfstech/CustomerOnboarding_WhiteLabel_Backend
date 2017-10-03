package com.afrAsia.dao.jpa.impl;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.UpdateCifOrShortnameJpaDao;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;

public class UpdateCifOrShortnameJpaDaoImpl extends BaseJpaDAOImpl<String, MobApplicantPersonalDetail>implements UpdateCifOrShortnameJpaDao {

	public void updateCifAndShortname(MobApplicantPersonalDetail mobApplicantPersonalDetail) {
		String queryString = "UPDATE MobApplicantPersonalDetail s SET s.custCif =:custCif, s.shortName =:shortname where s.id.applicantId =:applicantId and s.id.id =:id";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("applicantId", mobApplicantPersonalDetail.getId().getApplicantId());
		query.setParameter("id", mobApplicantPersonalDetail.getId().getId());
		query.setParameter("shortname", mobApplicantPersonalDetail.getShortName());
		query.setParameter("custCif", mobApplicantPersonalDetail.getCustCif());
		query.executeUpdate();
	}

	public void updateCif(MobApplicantPersonalDetail mobApplicantPersonalDetail) {
		String queryString = "UPDATE MobApplicantPersonalDetail s SET s.custCif =:custCif where s.id.applicantId =:applicantId and s.id.id =:id";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("applicantId", mobApplicantPersonalDetail.getId().getApplicantId());
		query.setParameter("id", mobApplicantPersonalDetail.getId().getId());
		query.setParameter("custCif", mobApplicantPersonalDetail.getCustCif());
		query.executeUpdate();
	}

	public void updateShortname(MobApplicantPersonalDetail mobApplicantPersonalDetail) {
		String queryString = "UPDATE MobApplicantPersonalDetail s SET s.shortName =:shortname where s.id.applicantId =:applicantId and s.id.id =:id";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("applicantId", mobApplicantPersonalDetail.getId().getApplicantId());
		query.setParameter("id", mobApplicantPersonalDetail.getId().getId());
		query.setParameter("shortname", mobApplicantPersonalDetail.getShortName());
		query.executeUpdate();		
	}
	
}
