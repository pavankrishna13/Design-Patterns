package com.resp;

public interface CurrencyDispenser {

	void setNextDispenser(CurrencyDispenser next);
	void dispense(Currency currency);
}
