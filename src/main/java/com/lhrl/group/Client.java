package com.lhrl.group;

public class Client {

	public static void main(String[] args) {
		Folder folder=new Folder("���ļ���");
		TextFile textFile=new TextFile("a.text");
		ImageFile imageFile=new ImageFile("b.jpg");
		Folder folder2=new Folder("c�ļ���");
		folder.add(textFile);
		folder.add(imageFile);
		folder.add(folder2);
		
		//��c�ļ���������ļ�
		TextFile textFile2=new TextFile("a-1.text");
		ImageFile imageFile2=new ImageFile("a-1.jpg");
		VideoFile videoFile=new VideoFile("a-1.rmvb");
		folder2.add(imageFile2);
		folder2.add(videoFile);
		folder2.add(textFile2);
		
		//�����ļ�
		folder.display();
		System.out.println("-------------------------------");
		folder2.remove(videoFile);
		folder2.display();
	}
}
