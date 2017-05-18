package com.lhrl.test;

public class Teacher {

	private String name;
	
	private String course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Teacher(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	
}
