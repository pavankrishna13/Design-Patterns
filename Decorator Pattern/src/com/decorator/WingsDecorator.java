package com.decorator;

public class WingsDecorator extends AbstractDecorator {
	
	public WingsDecorator(LivingThing livingThing) {
		super(livingThing);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		livingThing.describe();
		System.out.println("I have wings");
		fly();
	}
	
	public void fly() {
		System.out.println("I can fly");
	}
	

}
