package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Set;

public class PendingAction implements Serializable {

	private static final long serialVersionUID = 1L;

	// private List<Apps> apps;

	private Set<Apps> apps;

	public Set<Apps> getApps() {
		return apps;
	}

	public void setApps(Set<Apps> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "PendingAction [apps=" + apps + "]";
	}

}
