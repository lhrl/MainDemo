package com.lhrl.command;

/**
 * 命令模式
 * @author liu lang
 *
 * 2016年11月29日下午4:54:54
 */
public class Client {

	public static void main(String[] args) {
		Controller controller=new Controller(new OpenTvCommand(), new CloseTvCommand(), new ChannelTvCommand());
		
		controller.open();
		
		controller.close();
		
		controller.changeChannel();
	}
}
