package com.strategy;

public class Item {

	int itemCode;
	String name;
	double price;
	
	public Item(int itemCode, String name, double price) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.price = price;
	}

	public int getItemCode() {
		return itemCode;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
}
