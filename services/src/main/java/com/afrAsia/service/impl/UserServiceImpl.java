package com.afrAsia.service.impl;

import java.util.Collection;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.afrAsia.dao.UserDAO;
import com.afrAsia.entities.jpa.User;
import com.afrAsia.service.UserService;

/**
 * Concrete implementation of {@link UserService}
 * 
 * @author nyalfernandes
 *
 */
public class UserServiceImpl implements UserService
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

    private UserDAO userDAO;

    public UserDAO getUserDAO()
    {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    @Transactional
    public void saveUser(String name)
    {
        User u = new User();
        u.setName(name);
        debugLog.debug("user is saved ");
        userDAO.persist(u);
    }

    public Collection<User> fetchUsers()
    {
    	debugLog.debug("user is fetched ");
        return userDAO.findAll();
    }
}
