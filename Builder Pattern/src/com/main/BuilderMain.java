package com.main;

import com.builder.ChineseMealBuilder;
import com.director.MealDirector;
import com.product.Meal;

public class BuilderMain {

	public static void main(String[] args) {
		MealDirector director = new MealDirector(new ChineseMealBuilder());
		director.makeMeal();
		Meal m = director.getMeal();
		System.out.println(m);
		
	}
}
