package com.lhrl.state;

public class BookedState implements State{

	private Room hotelManage;
	
	public BookedState(Room hotelManage) {
		this.hotelManage=hotelManage;
	}
	@Override
	public void bookRoom() {
		System.out.println("�����Ѿ���Ԥ����.....");
		
	}

	@Override
	public void unsubscribeRoom() {
		System.out.println("�˶��ɹ�����ӭ�´ι���....");
		hotelManage.setState(hotelManage.getFreeTimestate());//״̬��ɿ���״̬
		
	}

	@Override
	public void checkInRoom() {
		System.out.println("��ס�ɹ�....");
		hotelManage.setState(hotelManage.getCheckInState());
		
	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub
		
	}

}
