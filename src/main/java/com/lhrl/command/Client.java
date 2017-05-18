package com.lhrl.command;

/**
 * ����ģʽ
 * @author liu lang
 *
 * 2016��11��29������4:54:54
 */
public class Client {

	public static void main(String[] args) {
		Controller controller=new Controller(new OpenTvCommand(), new CloseTvCommand(), new ChannelTvCommand());
		
		controller.open();
		
		controller.close();
		
		controller.changeChannel();
	}
}
