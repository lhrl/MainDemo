package com.lhrl.design;


public class WatchTvSwitchFacade {

	private Television television;
	private Ligth ligth;
	private Screen screen;
	private AirCondition airCondition;
	
	
	public WatchTvSwitchFacade(Television television, Ligth ligth,
			Screen screen, AirCondition airCondition) {
		this.television = television;
		this.ligth = ligth;
		this.screen = screen;
		this.airCondition = airCondition;
	}
	/**
	 * һ������
	 */
	public void open(){
		television.open();
		ligth.open();
		airCondition.open();
		screen.open();
	}
	
	/**
	 * һ���ر�
	 */
	public void close(){
		television.close();
		ligth.close();
		airCondition.close();
		screen.close();
	}
}
