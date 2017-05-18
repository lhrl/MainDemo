package com.lhrl.state;

public class FreeTimeState implements State{

	private Room hotelMangement;
	
	public FreeTimeState(Room hotelMangement) {
		this.hotelMangement=hotelMangement;
	}
	@Override
	public void bookRoom() {
		System.out.println("���Ѿ��ɹ�Ԥ��...");
		hotelMangement.setState(hotelMangement.getBookedState());//״̬���Ԥ��
	}

	@Override
	public void checkInRoom() {
		System.out.println("���Ѿ��ɹ���ס��...");
		hotelMangement.setState(hotelMangement.getCheckInState());//״̬�����ס
		
	}
	
	@Override
	public void unsubscribeRoom() {
		
		
	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub
		
	}

}
