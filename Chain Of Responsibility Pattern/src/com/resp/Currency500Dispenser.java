package com.resp;

public class Currency500Dispenser implements CurrencyDispenser {

	CurrencyDispenser nextDispenser;
	
	@Override
	public void setNextDispenser(CurrencyDispenser next) {
		nextDispenser = next;
	}

	@Override
	public void dispense(Currency currency) {
		int amount = currency.getAmount();
		
		if(amount >= 500) {
			int num = amount/500;
			int balance = amount%500;
			
			System.out.println("Dispensing " + num + " 500 notes");
			
			if(balance != 0) {
				nextDispenser.dispense(new Currency(balance));
			}
		} else {
			nextDispenser.dispense(currency);
		}
		
	}

}
