package com.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		LivingThing lt = new Animal();
		lt.describe();
		
		System.out.println("After adding legs decorator ");
		LegDecorator ld = new LegDecorator(lt);
		ld.describe();

		
		System.out.println("After adding wings decorator ");
		WingsDecorator wd = new WingsDecorator(ld);
		wd.describe();
	}

}
