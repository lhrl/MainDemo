package com.lhrl.state;

public class FreeTimeState implements State{

	private Room hotelMangement;
	
	public FreeTimeState(Room hotelMangement) {
		this.hotelMangement=hotelMangement;
	}
	@Override
	public void bookRoom() {
		System.out.println("你已经成功预定...");
		hotelMangement.setState(hotelMangement.getBookedState());//状态变成预定
	}

	@Override
	public void checkInRoom() {
		System.out.println("你已经成功入住了...");
		hotelMangement.setState(hotelMangement.getCheckInState());//状态变成入住
		
	}
	
	@Override
	public void unsubscribeRoom() {
		
		
	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub
		
	}

}
