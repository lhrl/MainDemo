package com.lhrl.threadLocal;

public class Thread1 extends Thread{

	private Domain domain;
	
	public Thread1(Domain domain){
		this.domain=domain;
	}
	
	public void run(){
		domain.addNum("a");
	}
}
