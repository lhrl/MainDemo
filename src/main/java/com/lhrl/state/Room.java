package com.lhrl.state;

public class Room {

	private State freeTimestate;//空闲状态
	private State checkInState;//入住状态
	private State bookedState;//预定状态
	
	private State state;
	
	
	public Room() {
		freeTimestate=new FreeTimeState(this);
		checkInState=new CheckInState(this);
		bookedState=new BookedState(this);
		state=freeTimestate;
	}
	
	/**
	 * 预定房间
	 */
	public void bookRoom(){
		state.bookRoom();
	}
	
	/**
	 * 退订房间
	 */
	public void unsubscribeRoom(){
		state.unsubscribeRoom();
	}
	
	/**
	 * 入住房间
	 */
	public void checkInRoom(){
		state.checkInRoom();
	}
	
	/**
	 * 退房
	 */
	public void checkOutRoom(){
		state.checkOutRoom();
	}

	
	
	@Override
	public String toString() {
		return "该房间的状态是："+getState().getClass().getName();
	}

	public State getFreeTimestate() {
		return freeTimestate;
	}

	public void setFreeTimestate(State freeTimestate) {
		this.freeTimestate = freeTimestate;
	}

	public State getCheckInState() {
		return checkInState;
	}

	public void setCheckInState(State checkInState) {
		this.checkInState = checkInState;
	}

	public State getBookedState() {
		return bookedState;
	}

	public void setBookedState(State bookedState) {
		this.bookedState = bookedState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
	
	
}
