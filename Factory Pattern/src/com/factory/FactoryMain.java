package com.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Details for India");
		Currency c1 = CurrencyFactory.getCurrency("India");
		System.out.println(c1.getSymbol());
		System.out.println(c1.getDollarValue());
		
		System.out.println("Details for Singapore");
		Currency c2 = CurrencyFactory.getCurrency("Singapore");
		System.out.println(c2.getSymbol());
		System.out.println(c2.getDollarValue());
		
		System.out.println("Details for Japan");
		Currency c3 = CurrencyFactory.getCurrency("Japan");
		System.out.println(c3.getSymbol());
		System.out.println(c3.getDollarValue());
		
		System.out.println("Details for China");
		Currency c4 = CurrencyFactory.getCurrency("China");
		System.out.println(c4.getSymbol());
		System.out.println(c4.getDollarValue());
	}

}
