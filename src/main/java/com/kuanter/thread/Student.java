package com.kuanter.thread;

public class Student {

	public static final ThreadLocal<String> LOCAL_USERNAME = new ThreadLocal<String>();
	 
	private String name;
	
	private int age;

	public String getName() {
		return LOCAL_USERNAME.get();
	}

	public void setName(String name) {
		LOCAL_USERNAME.set(name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
