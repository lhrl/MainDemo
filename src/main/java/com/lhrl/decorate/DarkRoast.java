package com.lhrl.decorate;

public class DarkRoast extends Beverage{

	@Override
	public double cost() {
		return 0.75;
	}

	public DarkRoast() {
		description="DarkRoast";
	}
}
