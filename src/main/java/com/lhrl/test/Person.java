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
		p1.setName("�����޸ĵ�����");
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
		System.out.println("��ǰ��ʱ�䣺"+d);
	}

	public static void main(String[] args) {
		int age=10;
		Person p=new Person();
		p.setName("��ʼ����");
		System.out.println(p.getName());
		p.modify(p);
		System.out.println(p.getName());
		System.out.println("��ǰ�����֣�"+age);
		p.setAge(age);
		System.out.println("�޸ĺ������:"+age);
		
		Date d=new Date();
		System.out.println("�޸�ǰ"+d);
		p.modifyDate(d);
		System.out.println("�޸ĺ�"+d);
		
	
	}
}
