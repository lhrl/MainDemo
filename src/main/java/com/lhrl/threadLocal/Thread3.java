package com.lhrl.threadLocal;

public class Thread3 extends Thread{

	private MyDomain myDomain;
	
	public Thread3(MyDomain myDomain){
		this.myDomain=myDomain;
	}
	
	public void run(){
		myDomain.doWork();
	}
	
	
	
	public static void main(String[] args) {
		MyDomain myDomain =new MyDomain();
		Thread3 thread3=new Thread3(myDomain);
		Thread3 thread4=new Thread3(myDomain);
		thread3.start();
		thread4.start();
	}
}
