package com.lhrl.serializable;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5066205833391879285L;

	private String name;
	
	private int age;
	
	private String sex;
	
	private String hobby;
	

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String say(){
		return "这是后续加入的内容 啦啦";
	}
	
	public String hello(){
		return "hello";
	}
}
