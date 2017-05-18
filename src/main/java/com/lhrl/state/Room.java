package com.lhrl.state;

public class Room {

	private State freeTimestate;//����״̬
	private State checkInState;//��ס״̬
	private State bookedState;//Ԥ��״̬
	
	private State state;
	
	
	public Room() {
		freeTimestate=new FreeTimeState(this);
		checkInState=new CheckInState(this);
		bookedState=new BookedState(this);
		state=freeTimestate;
	}
	
	/**
	 * Ԥ������
	 */
	public void bookRoom(){
		state.bookRoom();
	}
	
	/**
	 * �˶�����
	 */
	public void unsubscribeRoom(){
		state.unsubscribeRoom();
	}
	
	/**
	 * ��ס����
	 */
	public void checkInRoom(){
		state.checkInRoom();
	}
	
	/**
	 * �˷�
	 */
	public void checkOutRoom(){
		state.checkOutRoom();
	}

	
	
	@Override
	public String toString() {
		return "�÷����״̬�ǣ�"+getState().getClass().getName();
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
