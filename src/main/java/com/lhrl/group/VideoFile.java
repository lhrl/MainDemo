package com.lhrl.group;

public class VideoFile extends File{

	public VideoFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("����Ӱ���ļ�,�ļ���:"+super.getName());
	}

}
