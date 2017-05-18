package com.lhrl.factory;

public class PepperontPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("prepare PepperontPizza");
		
	}

	@Override
	public void bake() {
		System.out.println("bake PepperontPizza");
		
	}

	@Override
	public void cut() {
		System.out.println("cut PepperontPizza");
	}

	@Override
	public void box() {
		System.out.println("box PepperontPizza");
		
	}

}
