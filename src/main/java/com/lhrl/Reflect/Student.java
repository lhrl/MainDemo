package com.lhrl.Reflect;

public class Student {

	private String name="����";
	
	private int age;
	
	
	private String gender;
	
	public String hobby;
	
	
	public void say(){
		System.out.println("hello  student");
	}
	
	public Student() {
	}

	public Student(String name, int age, String gender, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String hello(String str){
		return "hello"+str;
	}
	
}
