package com.lhrl.factory;

public class PizzaFactory {

	public static Pizza createPizza(PizzaType pizzaType){
		switch (pizzaType) {
		case CHEESE:
			return new CheesePizza();
		case CLAM:
			return  new ClamPizza();
		case PEPPERONI:
			return new PepperontPizza();
		case VEGGIE:
			return new VeggiePizza();
		default:
			throw new  RuntimeException("Unsupport UserType:" + pizzaType.name());
		}
	}
}
