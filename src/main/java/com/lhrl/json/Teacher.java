package com.lhrl.json;

import java.util.List;

public class Teacher {

	private String name;
	
	private int age;
	
	private DisplayData displayData;

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

	
	public DisplayData getDisplayData() {
		return displayData;
	}

	public void setDisplayData(DisplayData displayData) {
		this.displayData = displayData;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", displayData="
				+ displayData + "]";
	}

	
	
	
	
	
}
