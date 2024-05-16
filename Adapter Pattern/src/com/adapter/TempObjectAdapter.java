package com.adapter;

public class TempObjectAdapter implements TempAdapter {

	CelsiusReporter reporter;

	public TempObjectAdapter() {
		super();
		this.reporter = new CelsiusReporter();
	}

	@Override
	public double getTempInF() {
		return cToF(reporter.getTempC());
	}

	@Override
	public void setTempInF(double tempInF) {
		double tempInC = fToC(tempInF);
		reporter.setTempC(tempInC);
	}

	@Override
	public double getTempInC() {
		return reporter.getTempC();
	}

	@Override
	public void setTempInC(double tempInC) {
		reporter.setTempC(tempInC);
	}
	
	private double cToF(double tempInC) {
		return (tempInC*9d/5d) + 32d;
	}
	
	private double fToC(double tempInF) {
		return ((tempInF - 32d) * 5d)/9d;
	}
	
	
}
