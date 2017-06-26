package com.afrAsia.service.impl;

import java.util.Collection;

import javax.transaction.Transactional;

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
        
        userDAO.persist(u);
    }

    public Collection<User> fetchUsers()
    {
        return userDAO.findAll();
    }

}
