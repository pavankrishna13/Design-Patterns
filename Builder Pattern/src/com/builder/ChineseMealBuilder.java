package com.builder;

import com.product.Meal;

public class ChineseMealBuilder implements MealBuilder {
	
	Meal meal;

	public ChineseMealBuilder() {
		meal = new Meal();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Chinese Drink");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("Spicy noodles");
	}

	@Override
	public void builDesert() {
		
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
