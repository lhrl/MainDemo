package com.lhrl.command;

public class CloseTvCommand implements Command{

	private Television tv;
	
	public CloseTvCommand() {
		tv=new Television();
	}
	@Override
	public void excute() {
		tv.close();
	}

}
