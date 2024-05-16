package com.observer;

public class DisplayObserver implements Observer {

	@Override
	public void notifyChange(int number) {
		System.out.println("Number value changed to " + number);
	}

}
