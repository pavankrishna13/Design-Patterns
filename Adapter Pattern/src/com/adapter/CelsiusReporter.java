package com.adapter;

public class CelsiusReporter {
	private double tempC;
	
	public CelsiusReporter() {
		
	}

	public CelsiusReporter(double tempC) {
		super();
		this.tempC = tempC;
	}

	public double getTempC() {
		return tempC;
	}

	public void setTempC(double tempC) {
		this.tempC = tempC;
	}
	
	
}
