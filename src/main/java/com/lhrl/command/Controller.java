package com.lhrl.command;

public class Controller {
	
	private Command openCommand;
	private Command closeCommand;
	private Command changeCommand;
	
	
	public Controller(Command openCommand, Command closeCommand,
			Command changeCommand) {
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}
	
	/**
	 * 打开电视
	 */
	public void open(){
		openCommand.excute();
	}
	
	/**
	 * 关闭电视
	 */
	public void close(){
		closeCommand.excute();
	}
	
	/**
	 * 换频道
	 */
	public void changeChannel(){
		changeCommand.excute();
	}
	
}
