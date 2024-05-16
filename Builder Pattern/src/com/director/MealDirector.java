package com.director;

import com.builder.ChineseMealBuilder;
import com.builder.MealBuilder;
import com.product.Meal;

public class MealDirector {
	
	private MealBuilder builder;


	public MealDirector(MealBuilder builder) {
		super();
		this.builder = builder;
	}

	public void makeMeal() {
		builder.buildDrink();
		builder.buildMainCourse();
		builder.builDesert();
	}
	
	public Meal getMeal() {
		return builder.getMeal();
	}

}
