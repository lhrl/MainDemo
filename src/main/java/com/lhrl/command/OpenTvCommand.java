package com.lhrl.command;

public class OpenTvCommand implements Command{
	
	private Television tv;
	
	public OpenTvCommand() {
		this.tv=new Television();
	}
	@Override
	public void excute() {
		tv.open();
	}

}
