package com.main;

import com.product.*;
import com.factory.*;

public class FactoryMain {

	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getCarFactory("Maruti");
		
		Engine engine = carFactory.getEngine();
		Transmission transmission = carFactory.getTransmission();
		
		engine.makeEngine();
		transmission.makeTransmission();
	}

}
