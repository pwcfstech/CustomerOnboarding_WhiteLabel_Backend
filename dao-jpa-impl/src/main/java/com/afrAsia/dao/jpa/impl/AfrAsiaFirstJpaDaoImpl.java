package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AfrAsiaFirstJpaDAO;
import com.afrAsia.entities.masters.AfrAsiaFirst;

public class AfrAsiaFirstJpaDaoImpl extends BaseJpaDAOImpl<String, AfrAsiaFirst> implements AfrAsiaFirstJpaDAO{

	public List<AfrAsiaFirst> getAfrAsiaFirst(){
		String queryString = "from AfrAsiaFirst ";
		Query query = getEntityManager().createQuery(queryString);
		List<AfrAsiaFirst> listOfAfrAsiaFirst = query.getResultList();
		return listOfAfrAsiaFirst;
	}

}
