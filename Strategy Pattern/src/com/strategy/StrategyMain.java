package com.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item(11, "Laptop", 45000));
		cart.addItem(new Item(22, "Pendrive", 2000));
		cart.addItem(new Item(11, "Headphones", 5000));
		
		System.out.println("Total cost of cart : " + cart.calculateCost());
		
		PaymentStrategy paymentStrategy = new CashOnDeilveryStrategy();
		cart.pay(paymentStrategy);
		
		paymentStrategy = new CreditCardPaymentStrategy("kumar", "1111 2222 3333", "333");
		cart.pay(paymentStrategy);

	}

}
