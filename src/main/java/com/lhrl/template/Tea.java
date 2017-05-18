package com.lhrl.template;

public class Tea extends CoffeeBeverage{

	@Override
	void brew() {
		  System.out.println("Steeping the tea...");
	}

	@Override
	void addCondiments() {
		  System.out.println("Adding Lemon...");
	}

}
