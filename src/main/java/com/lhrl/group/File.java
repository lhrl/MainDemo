package com.lhrl.group;

public abstract class File {

	public String name;
	
	public File(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void display();
}
