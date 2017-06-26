package com.afrAsia.service;

import java.util.Collection;

import com.afrAsia.entities.jpa.User;

/**
 * Service methods for the {@link User} entity.
 * @author nyalfernandes
 *
 */
public interface UserService
{
    public void saveUser(String name);
    
    public Collection<User> fetchUsers();
}
