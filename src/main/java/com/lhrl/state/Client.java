package com.lhrl.state;

public class Client {

	public static void main(String[] args) {
		Room[] rooms=new Room[2];
		for (int i = 0; i < rooms.length; i++) {
			rooms[i]=new Room();
		}
		
		//��һ�䷿
		rooms[0].bookRoom();
		rooms[0].checkInRoom();
		rooms[0].bookRoom();
		System.out.println(rooms[0]);
		System.out.println("--------------------------------");
		
		//�ڶ��䷿
		rooms[1].checkInRoom();
		rooms[1].bookRoom();
		rooms[1].checkInRoom();
		rooms[1].bookRoom();
		System.out.println(rooms[1]);
	}
}
