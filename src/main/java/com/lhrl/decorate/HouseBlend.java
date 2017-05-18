package com.lhrl.decorate;

public class HouseBlend extends Beverage{

	@Override
	public double cost() {
		return 0.89;
	}
	
	public HouseBlend() {
		description="HouseBlend";
	}

}
