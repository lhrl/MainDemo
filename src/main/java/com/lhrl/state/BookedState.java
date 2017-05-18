package com.lhrl.state;

public class BookedState implements State{

	private Room hotelManage;
	
	public BookedState(Room hotelManage) {
		this.hotelManage=hotelManage;
	}
	@Override
	public void bookRoom() {
		System.out.println("房间已经给预定了.....");
		
	}

	@Override
	public void unsubscribeRoom() {
		System.out.println("退订成功，欢迎下次光临....");
		hotelManage.setState(hotelManage.getFreeTimestate());//状态变成空闲状态
		
	}

	@Override
	public void checkInRoom() {
		System.out.println("入住成功....");
		hotelManage.setState(hotelManage.getCheckInState());
		
	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub
		
	}

}
