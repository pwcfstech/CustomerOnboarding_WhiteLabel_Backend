package com.afrAsia.entities.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Base parent entity.
 * 
 * @author nyalfernandes
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", nullable = false)
    private Date createdTime;
    
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_time", nullable = true)
    private Date updatedTime;
    
    @Column(name = "updated_by", nullable = true)
    private String updatedBy;

    public Long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public Date getUpdatedTime()
    {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        BaseEntity other = (BaseEntity) obj;
        if (id == null)
        {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
