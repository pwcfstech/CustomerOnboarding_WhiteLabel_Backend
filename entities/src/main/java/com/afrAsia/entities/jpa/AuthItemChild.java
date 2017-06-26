package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "auth_item_child")
@EntityListeners(EntityListener.class)
public class AuthItemChild implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "parent")
    private String parent;

    @Id
    @Column(name = "child")
    private String child;

    public String getParent()
    {
        return parent;
    }

    public void setParent(String parent)
    {
        this.parent = parent;
    }

    public String getChild()
    {
        return child;
    }

    public void setChild(String child)
    {
        this.child = child;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((child == null) ? 0 : child.hashCode());
        result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
        AuthItemChild other = (AuthItemChild) obj;
        if (child == null)
        {
            if (other.child != null)
                return false;
        }
        else if (!child.equals(other.child))
            return false;
        if (parent == null)
        {
            if (other.parent != null)
                return false;
        }
        else if (!parent.equals(other.parent))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "AuthItemChild [" + (parent != null ? "parent=" + parent + ", " : "") + (child != null ? "child=" + child : "") + "]";
    }
    
    

}
