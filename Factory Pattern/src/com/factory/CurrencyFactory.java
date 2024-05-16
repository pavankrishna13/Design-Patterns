package com.factory;

public class CurrencyFactory {
	
	public static Currency getCurrency(String country) {
		switch(country.toLowerCase()) {
		case "india" : return new Rupee();
		//break;
		
		case "singapore" : return new SGDollar();
		//break;
		
		case "japan" : return new JapaneseYen();
		//break;
		
		default:
			throw new IllegalArgumentException("No currenc found");
		}
	}

	static private class Rupee implements Currency {

		@Override
		public String getSymbol() {
			// TODO Auto-generated method stub
			return "Rs";
		}

		@Override
		public double getDollarValue() {
			// TODO Auto-generated method stub
			return 83.4d;
		}
		
	}
	
	static private class SGDollar implements Currency {

		@Override
		public String getSymbol() {
			// TODO Auto-generated method stub
			return "SGD";
		}

		@Override
		public double getDollarValue() {
			// TODO Auto-generated method stub
			return 3.2d;
		}
		
	}
	
	static private class JapaneseYen implements Currency {

		@Override
		public String getSymbol() {
			// TODO Auto-generated method stub
			return "Yen";
		}

		@Override
		public double getDollarValue() {
			// TODO Auto-generated method stub
			return 1.8d;
		}
		
	}
	
}
