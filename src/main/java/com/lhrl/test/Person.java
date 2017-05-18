package com.lhrl.test;

import java.util.Date;

public class Person {

	private int age;
	
	private boolean isOk;
	
	private String name;
	
	public  void show(){
		int i=10;
		System.out.println(age+","+isOk+","+name+","+i);
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void modify(Person p){
		Person p1=p;
		p1.setName("后面修改的名字");
	}

	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		age=100;
		this.age = age;
	}


	public void modifyDate(Date d){
		d=null;
		System.out.println("当前的时间："+d);
	}

	public static void main(String[] args) {
		int age=10;
		Person p=new Person();
		p.setName("初始名字");
		System.out.println(p.getName());
		p.modify(p);
		System.out.println(p.getName());
		System.out.println("当前的名字："+age);
		p.setAge(age);
		System.out.println("修改后的名字:"+age);
		
		Date d=new Date();
		System.out.println("修改前"+d);
		p.modifyDate(d);
		System.out.println("修改后"+d);
		
	
	}
}
