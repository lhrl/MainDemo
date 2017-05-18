package com.lhrl.threadLocal;

public class Thread2 extends Thread{

	private Domain domain;
	
	public Thread2(Domain domain){
		this.domain=domain;
	}
	
	public void run(){
		domain.addNum("b");
	}
}
