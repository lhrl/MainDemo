package com.lhrl.state;

public class CheckInState implements State{

	private Room hotelManage;
	
	public CheckInState(Room hotelManage) {
		this.hotelManage=hotelManage;
	}
	@Override
	public void bookRoom() {
		System.out.println("该房间已经入住...");
		
	}

	@Override
	public void unsubscribeRoom() {
		
		
	}

	@Override
	public void checkInRoom() {
		System.out.println("该房间已经入住...");
		
	}

	@Override
	public void checkOutRoom() {
		System.out.println("退房成功....");
		hotelManage.setState(hotelManage.getFreeTimestate());//状态变空闲
		
	}

}
