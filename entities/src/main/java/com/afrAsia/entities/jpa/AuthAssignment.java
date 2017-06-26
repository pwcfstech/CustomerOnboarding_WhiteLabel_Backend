package com.afrAsia.entities.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "auth_assignment")
// @EntityListeners(EntryAuditEntityListener.class)
@NamedQueries({ @NamedQuery(name = AuthAssignment.QUERY_FIND_BY_USER_ID, query = "SELECT a FROM AuthAssignment a where a.user = :userId"),
        @NamedQuery(name = AuthAssignment.QUERY_FIND_AUTH_ITEMS_BY_USER_ID, query = "SELECT a FROM AuthAssignment a JOIN FETCH a.authItem WHERE a.user IN :userIdList"),
        @NamedQuery(name = AuthAssignment.QUERY_FIND_AUTH_ITEM_NAME_BY_USER_ID, query = "SELECT a.authItem.name FROM AuthAssignment a WHERE a.user = :userId") })
public class AuthAssignment implements Serializable
{

    public static final String QUERY_FIND_BY_USER_ID = "findAuthAssignmentByUserId";
    public static final String QUERY_FIND_AUTH_ITEMS_BY_USER_ID = "findAuthItemsAssignmentByUserId";
    public static final String QUERY_FIND_AUTH_ITEM_NAME_BY_USER_ID = "SELECT a.authItem.name FROM AuthAssignment a WHERE a.user = :userId";
    public static final String QUERY_FIND_USER_IDS_BY_ROLES = "SELECT user FROM AuthAssignment a WHERE a.authItem.name IN :roles";

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_name", referencedColumnName = "name")
    private AuthItem authItem;

    @Id
    @Column(name = "user_id", nullable = false)
    private String user;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    public String getCreatedBy()
    {
        return createdBy;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }

    public Date getUpdatedTime()
    {
        return updatedTime;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public void setUpdatedTime(Date updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    public AuthItem getAuthItem()
    {
        return authItem;
    }

    public void setAuthItem(AuthItem authItem)
    {
        this.authItem = authItem;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((authItem == null) ? 0 : authItem.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AuthAssignment other = (AuthAssignment) obj;
        if (authItem == null)
        {
            if (other.authItem != null)
                return false;
        }
        else if (!authItem.equals(other.authItem))
            return false;
        if (user == null)
        {
            if (other.user != null)
                return false;
        }
        else if (!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "AuthAssignment [" + (authItem != null ? "authItem=" + authItem + ", " : "") + (user != null ? "user=" + user : "") + "]";
    }

}
