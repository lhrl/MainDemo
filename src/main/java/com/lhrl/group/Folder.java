package com.lhrl.group;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

	private List<File>fileList;

	public Folder(String name) {
		super(name);
		fileList=new ArrayList<File>();
	}

	@Override
	public void display() {
		for (File file : fileList) {
			file.display();
		}
	}
	
	public void add(File file){
		fileList.add(file);
	}
	
	public void remove(File file){
		fileList.remove(file);
	}

}
