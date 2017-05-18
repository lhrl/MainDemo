package com.lhrl.extend;

public class Person {

	protected int a=4;
	private int b=5;
	
	public Person(){
		System.out.println("父类的构造函数");
	}
	public int getValue(){
		System.out.println(this.getClass().getName());
		return this.b;
	}
}
