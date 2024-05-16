package com.factory;

import com.product.Engine;
import com.product.ToyotaEngine;
import com.product.Transmission;
import com.product.ToyotaTransmission;

public class ToyotaFactory extends CarFactory {

	@Override
	public Engine getEngine() {
		return new ToyotaEngine();
	}

	@Override
	public Transmission getTransmission() {
		return new ToyotaTransmission();
	}

}
