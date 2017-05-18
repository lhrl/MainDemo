package com.lhrl.factory;

public class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("prepare cheesePizza");
	}

	@Override
	public void bake() {
		System.out.println("bake cheesePizza");
	}

	@Override
	public void cut() {
		System.out.println("cut cheesePizza");
	}

	@Override
	public void box() {
		System.out.println("box cheesePizza");
	}

}
