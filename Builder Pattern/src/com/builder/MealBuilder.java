package com.builder;

import com.product.Meal;

public interface MealBuilder {
	
	void buildDrink();
	
	void buildMainCourse();
	
	void builDesert();
	
	Meal getMeal();

}
