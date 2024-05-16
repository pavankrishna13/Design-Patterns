package com.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> cart = new ArrayList<>();
	
	public void addItem(Item item) {
		this.cart.add(item);
	}
	
	public void removeItem(Item item) {
		this.cart.remove(item);
	}
	
	public double calculateCost() {
		double totalCost = 0d;
		for(Item item : cart) {
			totalCost += item.getPrice();
		}
		return totalCost;
	}

	public void pay(PaymentStrategy method) {
		double cost = calculateCost();
		method.pay(cost);
	}
 }
