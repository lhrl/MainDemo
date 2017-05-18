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
	 * �򿪵���
	 */
	public void open(){
		openCommand.excute();
	}
	
	/**
	 * �رյ���
	 */
	public void close(){
		closeCommand.excute();
	}
	
	/**
	 * ��Ƶ��
	 */
	public void changeChannel(){
		changeCommand.excute();
	}
	
}
