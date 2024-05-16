package com.resp;

public class Currency200Dispenser implements CurrencyDispenser {
	
	CurrencyDispenser nextDispenser;

	@Override
	public void setNextDispenser(CurrencyDispenser next) {
		nextDispenser = next;
		
	}

	@Override
	public void dispense(Currency currency) {
		
		int amount = currency.getAmount();
		
		if(amount >= 200) {
			int num = amount/200;
			int balance = amount%200;
			
			System.out.println("Dispensing " + num + " 200 notes");
			
			if(balance != 0) {
				nextDispenser.dispense(new Currency(balance));
			}
		} else {
			nextDispenser.dispense(currency);
		}
		
	}

}
