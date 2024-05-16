package com.decorator;

public class LegDecorator extends AbstractDecorator {

	public LegDecorator(LivingThing livingThing) {
		super(livingThing);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		livingThing.describe();
		System.out.println("I have legs");
		walk();
	}
	
	public void walk() {
		System.out.println("I can walk");
	}
	
	

}
