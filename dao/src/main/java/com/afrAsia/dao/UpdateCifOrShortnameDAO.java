package com.afrAsia.dao;

import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;

public interface UpdateCifOrShortnameDAO {
	
	public void updateCifAndShortname(MobApplicantPersonalDetail mobApplicantPersonalDetail);
	public void updateCif(MobApplicantPersonalDetail mobApplicantPersonalDetail);
	public void updateShortname(MobApplicantPersonalDetail mobApplicantPersonalDetail);
}
