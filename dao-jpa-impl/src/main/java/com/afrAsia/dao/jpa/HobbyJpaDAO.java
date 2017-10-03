package com.afrAsia.dao.jpa;

import java.util.Collection;

import com.afrAsia.dao.HobbyDao;
import com.afrAsia.entities.masters.Hobby;

public interface HobbyJpaDAO extends HobbyDao {

	public Collection<Hobby> getHobby();

}
