package com.lhrl.group;

public class TextFile extends File{

	public TextFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("这是图像文件，文件名："+super.getName());
	}

}
