package com.afrAsia.entities.response;

import java.io.Serializable;

public class PendingAction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Apps apps;

	public Apps getApps() {
		return apps;
	}

	public void setApps(Apps apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "PendingAction [apps=" + apps + "]";
	}

}
