package com.lhrl.group;

public class ImageFile extends File{

	public ImageFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("����ͼ���ļ�,�ļ�����"+super.getName());
	}

}
