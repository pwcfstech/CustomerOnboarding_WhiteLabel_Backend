package com.afrAsia.entities.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "auth_item")
@EntityListeners(EntityListener.class)
@NamedQueries({ @NamedQuery(name = AuthItem.QUERY_FIND_AUTH_ITEMS_BY_NAME_LIST, query = "SELECT a FROM AuthItem a WHERE a.name IN :nameList"), })
public class AuthItem implements Serializable
{

    private static final long serialVersionUID = 1L;

    public static final String QUERY_FIND_AUTH_ITEMS_BY_NAME_LIST = "findAuthItemsByNameList";

    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "description")
    private String description;

    @Column(name = "rule_name")
    private String ruleName;

    @Column(name = "data")
    private String data;

    @Column(name = "group_code")
    private String groupCode;

    @Column(name = "created_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Column(name = "updated_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    @Column(name = "created_by", nullable = true)
    private String createdBy;

    @Column(name = "updated_by", nullable = true)
    private String updatedBy;

    public Date getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime()
    {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getRuleName()
    {
        return ruleName;
    }

    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getGroupCode()
    {
        return groupCode;
    }

    public void setGroupCode(String groupCode)
    {
        this.groupCode = groupCode;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((groupCode == null) ? 0 : groupCode.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((ruleName == null) ? 0 : ruleName.hashCode());
        result = prime * result + type;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        AuthItem other = (AuthItem) obj;
        if (data == null)
        {
            if (other.data != null)
                return false;
        }
        else if (!data.equals(other.data))
            return false;
        if (description == null)
        {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (groupCode == null)
        {
            if (other.groupCode != null)
                return false;
        }
        else if (!groupCode.equals(other.groupCode))
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (ruleName == null)
        {
            if (other.ruleName != null)
                return false;
        }
        else if (!ruleName.equals(other.ruleName))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "AuthItem [name=" + name + ", type=" + type + ", description=" + description + ", ruleName=" + ruleName + ", data=" + data + ", groupCode=" + groupCode + "]";
    }

}
