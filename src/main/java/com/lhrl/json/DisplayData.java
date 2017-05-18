package com.lhrl.json;

import java.util.List;

public class DisplayData {

	private List<List<Student>>listStudent;

	public List<List<Student>> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<List<Student>> listStudent) {
		this.listStudent = listStudent;
	}

	@Override
	public String toString() {
		return "DisplayData [listStudent=" + listStudent + "]";
	}

	

	
	
	
}
