package com.lhrl.extend;

public class Person {

	protected int a=4;
	private int b=5;
	
	public Person(){
		System.out.println("����Ĺ��캯��");
	}
	public int getValue(){
		System.out.println(this.getClass().getName());
		return this.b;
	}
}
