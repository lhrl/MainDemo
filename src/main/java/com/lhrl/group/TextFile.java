package com.lhrl.group;

public class TextFile extends File{

	public TextFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("����ͼ���ļ����ļ�����"+super.getName());
	}

}
