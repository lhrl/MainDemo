package com.lhrl.adapter;

public class DogAdapter implements Robat{

	private Dog dog;
	
	public DogAdapter(Dog dog) {
		this.dog=dog;
	}
	@Override
	public void cry() {
		dog.wang();
		
	}

	@Override
	public void move() {
		dog.run();
	}

}
