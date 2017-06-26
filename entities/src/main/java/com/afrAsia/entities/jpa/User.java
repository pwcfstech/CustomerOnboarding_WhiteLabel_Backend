package com.afrAsia.entities.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

/**
 * User entity
 * @author nyalfernandes
 *
 */
@Entity
@Table(name = "user")
@EntityListeners(value={EntityListener.class})
public class User extends BaseEntity
{ 

    private static final long serialVersionUID = 1L;
    
    @Column(name = "name")
    private String name;
    
    public User() {}

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "User [" + (name != null ? "name=" + name : "") + "]";
    }
    
    
    
}
