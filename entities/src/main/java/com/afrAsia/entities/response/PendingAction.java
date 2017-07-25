package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class PendingAction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<Apps> apps;

	/**
	 * @return the apps
	 */
	public Set<Apps> getApps() {
		return apps;
	}

	/**
	 * @param apps
	 *            the apps to set
	 */
	public void setApps(Set<Apps> apps) {
		this.apps = apps;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PendingAction [apps=" + apps + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apps == null) ? 0 : apps.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PendingAction other = (PendingAction) obj;
		if (apps == null) {
			if (other.apps != null)
				return false;
		} else if (!apps.equals(other.apps))
			return false;
		return true;
	}

}
