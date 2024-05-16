package com.proxy;

public class ComplexProxy {
	
	Complex complex;

	public void display() {
		if(complex == null) {
			complex = new Complex();
		}
		complex.display();
	}
}
