package com.strategy;

public class CashOnDeilveryStrategy implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Paying the amount : " + amount + " with cash on delivery");
	}

}
