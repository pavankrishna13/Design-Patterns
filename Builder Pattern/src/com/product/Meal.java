package com.product;

public class Meal {
	
	private String drink;
	private String mainCourse;
	private String desert;
	
	public Meal() {
		super();
	}
	
	public Meal(String drink, String mainCourse, String desert) {
		super();
		this.drink = drink;
		this.mainCourse = mainCourse;
		this.desert = desert;
	}

	@Override
	public String toString() {
		return "Meal [drink=" + drink + ", mainCourse=" + mainCourse + ", desert=" + desert + "]";
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	public String getDesert() {
		return desert;
	}

	public void setDesert(String desert) {
		this.desert = desert;
	}
	

}
