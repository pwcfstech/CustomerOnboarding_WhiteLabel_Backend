package com.afrAsia.entities.response;

import java.io.Serializable;

public class AverageProductivity implements Serializable {

	private static final long serialVersionUID = 1L;

	private double avgMonthly;

	private double avgQuarterly;

	private double avgHalfYearly;

	private double avgYearly;

	public double getAvgMonthly() {
		return avgMonthly;
	}

	public void setAvgMonthly(double avgMonthly) {
		this.avgMonthly = avgMonthly;
	}

	public double getAvgQuarterly() {
		return avgQuarterly;
	}

	public void setAvgQuarterly(double avgQuarterly) {
		this.avgQuarterly = avgQuarterly;
	}

	public double getAvgHalfYearly() {
		return avgHalfYearly;
	}

	public void setAvgHalfYearly(double avgHalfYearly) {
		this.avgHalfYearly = avgHalfYearly;
	}

	public double getAvgYearly() {
		return avgYearly;
	}

	public void setAvgYearly(double avgYearly) {
		this.avgYearly = avgYearly;
	}

	@Override
	public String toString() {
		return "AverageProductivity [avgMonthly=" + avgMonthly + ", avgQuarterly=" + avgQuarterly + ", avgHalfYearly="
				+ avgHalfYearly + ", avgYearly=" + avgYearly + "]";
	}

}
