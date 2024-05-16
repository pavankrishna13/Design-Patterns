package com.decorator;

public abstract class AbstractDecorator implements LivingThing {
	
	LivingThing livingThing;

	public AbstractDecorator(LivingThing livingThing) {
		super();
		this.livingThing = livingThing;
	}

	public LivingThing getLivingThing() {
		return livingThing;
	}

	public void setLivingThing(LivingThing livingThing) {
		this.livingThing = livingThing;
	}

	
}
