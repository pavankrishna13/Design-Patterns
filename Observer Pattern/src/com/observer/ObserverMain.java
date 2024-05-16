package com.observer;

public class ObserverMain {

	public static void main(String[] args) {
		NumberStore ns = new NumberStore();
		Observer ob1 = new DisplayObserver();
		ns.register(ob1);
		
		ns.setNumber(250);
		ns.setNumber(350);
		ns.setNumber(550);

	}

}
