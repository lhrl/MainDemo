package com.lhrl.template;

public abstract  class CoffeeBeverage {

	/**
	 * ǰ��׼��
	 */
	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
		
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boiling water...");
	}
	
	 void pourInCup(){
		 System.out.println("Pouring into Cup...");
	 }
	 
	 public boolean customerWantsCondiments(){
		 return true;
	 }
}
