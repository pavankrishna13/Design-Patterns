package com.adapter;

public class TempClassAdapter extends CelsiusReporter implements TempAdapter {

	public TempClassAdapter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTempInF() {
		double tempInC = super.getTempC();
		return cToF(tempInC);
	}

	@Override
	public void setTempInF(double tempInF) {
		double tempInC = fToC(tempInF);
		super.setTempC(tempInC);
	}

	@Override
	public double getTempInC() {
		return super.getTempC();
	}

	@Override
	public void setTempInC(double tempInC) {
		super.setTempC(tempInC);
	}
	
	private double cToF(double tempInC) {
		return (tempInC*9d/5d) + 32d;
	}
	
	private double fToC(double tempInF) {
		return ((tempInF - 32d) * 5d)/9d;
	}

}
