package com.builder;

import com.product.Meal;

public class IndianMealBuilder implements MealBuilder {
	
	Meal meal;

	public IndianMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Indian Drink");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("Indian main course");
	}

	@Override
	public void builDesert() {
		meal.setDesert("Indian Desert");
		
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
