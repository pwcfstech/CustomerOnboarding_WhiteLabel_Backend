package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

public class PendingAction implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Apps> apps;

	public List<Apps> getApps() {
		return apps;
	}

	public void setApps(List<Apps> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "PendingAction [apps=" + apps + "]";
	}

}
