package com.lhrl.state;

public class CheckInState implements State{

	private Room hotelManage;
	
	public CheckInState(Room hotelManage) {
		this.hotelManage=hotelManage;
	}
	@Override
	public void bookRoom() {
		System.out.println("�÷����Ѿ���ס...");
		
	}

	@Override
	public void unsubscribeRoom() {
		
		
	}

	@Override
	public void checkInRoom() {
		System.out.println("�÷����Ѿ���ס...");
		
	}

	@Override
	public void checkOutRoom() {
		System.out.println("�˷��ɹ�....");
		hotelManage.setState(hotelManage.getFreeTimestate());//״̬�����
		
	}

}
