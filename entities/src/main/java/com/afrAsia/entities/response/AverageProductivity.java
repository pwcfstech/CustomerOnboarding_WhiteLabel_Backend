package com.afrAsia.entities.response;

import java.io.Serializable;

public class AverageProductivity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private float avgMonthly;
	
	private float avgQuarterly;
	
	private float avgHalfYear;
	
	private float avgYearly;

	public float getAvgMonthly() {
		return avgMonthly;
	}

	public void setAvgMonthly(float avgMonthly) {
		this.avgMonthly = avgMonthly;
	}

	public float getAvgQuarterly() {
		return avgQuarterly;
	}

	public void setAvgQuarterly(float avgQuarterly) {
		this.avgQuarterly = avgQuarterly;
	}

	public float getAvgHalfYear() {
		return avgHalfYear;
	}

	public void setAvgHalfYear(float avgHalfYear) {
		this.avgHalfYear = avgHalfYear;
	}

	public float getAvgYearly() {
		return avgYearly;
	}

	public void setAvgYearly(float avgYearly) {
		this.avgYearly = avgYearly;
	}

	@Override
	public String toString() {
		return "AverageProductivity [avgMonthly=" + avgMonthly + ", avgQuarterly=" + avgQuarterly + ", avgHalfYear="
				+ avgHalfYear + ", avgYearly=" + avgYearly + "]";
	}
	
}
