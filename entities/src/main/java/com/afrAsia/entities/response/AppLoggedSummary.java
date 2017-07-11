package com.afrAsia.entities.response;

import java.io.Serializable;

public class AppLoggedSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	private int logged;

	private int opened;

	private int underProcessing;

	private int rejected;

	public int getLogged() {
		return logged;
	}

	public void setLogged(int logged) {
		this.logged = logged;
	}

	public int getOpened() {
		return opened;
	}

	public void setOpened(int opened) {
		this.opened = opened;
	}

	public int getUnderProcessing() {
		return underProcessing;
	}

	public void setUnderProcessing(int underProcessing) {
		this.underProcessing = underProcessing;
	}

	public int getRejected() {
		return rejected;
	}

	public void setRejected(int rejected) {
		this.rejected = rejected;
	}

	@Override
	public String toString() {
		return "AppLoggedSummary [logged=" + logged + ", opened=" + opened + ", underProcessing=" + underProcessing
				+ ", rejected=" + rejected + "]";
	}

}
