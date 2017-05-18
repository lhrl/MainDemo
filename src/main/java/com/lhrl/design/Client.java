package com.lhrl.design;

/**
 * 外观模式
 * @author liu lang
 *
 * 2016年11月29日下午5:27:28
 */
public class Client {

	public static void main(String[] args) {
		WatchTvSwitchFacade watchTvSwitchFacade=new WatchTvSwitchFacade(new Television(),new Ligth(), new Screen(), new AirCondition());
		watchTvSwitchFacade.open();
		System.out.println("------------------------------------");
		watchTvSwitchFacade.close();
		
	}
}
