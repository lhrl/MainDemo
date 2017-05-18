package com.lhrl.command;

public class ChannelTvCommand implements Command{
	
	private Television tv;
	
	public ChannelTvCommand() {
		tv=new Television();
	}
	@Override
	public void excute() {
		tv.changeChannel();
	}

}
