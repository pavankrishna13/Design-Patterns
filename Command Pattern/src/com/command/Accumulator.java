package com.command;

public class Accumulator {
	
	int val;

	public Accumulator() {
		super();
		this.val = 10;
	}
	
	public void addOneValue(Integer val1) {
		this.val += val1;
	}
	
	public void addTwoValues(Integer val1, Integer val2) {
		this.val += val1 + val2;
	}

	public int getVal() {
		return val;
	}
	

}
