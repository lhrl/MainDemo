package com.lhrl.design;

/**
 * ���ģʽ
 * @author liu lang
 *
 * 2016��11��29������5:27:28
 */
public class Client {

	public static void main(String[] args) {
		WatchTvSwitchFacade watchTvSwitchFacade=new WatchTvSwitchFacade(new Television(),new Ligth(), new Screen(), new AirCondition());
		watchTvSwitchFacade.open();
		System.out.println("------------------------------------");
		watchTvSwitchFacade.close();
		
	}
}
