package com.afrAsia.dao.jpa;

import com.afrAsia.dao.UpdateCifOrShortnameDAO;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;

public interface UpdateCifOrShortnameJpaDao extends UpdateCifOrShortnameDAO {
	
	public void updateCifAndShortname(MobApplicantPersonalDetail mobApplicantPersonalDetail);
	public void updateCif(MobApplicantPersonalDetail mobApplicantPersonalDetail);
	public void updateShortname(MobApplicantPersonalDetail mobApplicantPersonalDetail);
}
