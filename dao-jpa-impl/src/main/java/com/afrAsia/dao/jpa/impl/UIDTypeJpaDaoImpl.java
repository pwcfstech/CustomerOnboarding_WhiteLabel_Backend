package com.afrAsia.dao.jpa.impl;


import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.UIDTypeJpaDAO;
import com.afrAsia.entities.masters.UIDType;

public class UIDTypeJpaDaoImpl extends BaseJpaDAOImpl<String, UIDType>implements UIDTypeJpaDAO{

	public List<UIDType> getUIDType() {
		String queryString = " from UIDType";
		Query query = getEntityManager().createQuery(queryString);
		return (List<UIDType>) query.getResultList();
		
	}

}
