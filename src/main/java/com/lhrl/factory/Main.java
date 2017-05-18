package com.lhrl.factory;

public class Main {

	public static void main(String[] args) {
		Pizza pizza=PizzaFactory.createPizza(PizzaType.valueOf("CLAM"));
		pizza.prepare();
	}
}
