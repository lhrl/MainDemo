package com.lhrl.Iterator;

public class MenuItem {

	private String name;
	
	private String description;
	
	private int channe;
	
	
	public MenuItem(String name, String description, int channe) {
		this.name = name;
		this.description = description;
		this.channe = channe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getChanne() {
		return channe;
	}

	public void setChanne(int channe) {
		this.channe = channe;
	}
	
	
}
