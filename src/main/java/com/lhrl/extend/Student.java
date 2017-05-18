package com.lhrl.extend;

public class Student extends Person{

	private int b=10;
	public int test(){
		System.out.println(this.getClass().getName());
		return this.getValue();
	}
	public Student(){
		super();
		System.out.println("子类的构造函数");
	}
	public static void main(String[] args) {
		System.out.println(new Student().test());
		System.out.println(new Person().getValue());
	}
}
