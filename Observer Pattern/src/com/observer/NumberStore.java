package com.observer;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
	
	int number = 100;
	
	List<Observer> list = new ArrayList<>();
	
	public void register(Observer observer) {
		list.add(observer);
	}
	
	public void deRegister(Observer observer) {
		list.remove(observer);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		notifyObservers(number);
	}

	private void notifyObservers(int number) {
		for(Observer o : list) {
			o.notifyChange(number);
		}
	}

	
}
