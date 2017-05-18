package com.lhrl.threadLocal;

public class MyRunThread extends Thread{

	private  volatile boolean isRunning=true;

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public void run(){
		System.out.println("进入run了");
		while(isRunning){
			
		}
		System.out.println("线程被停止了");
	}
	
	public static void main(String[] args) {
		try {
			MyRunThread myRunThread=new MyRunThread();
			myRunThread.start();
			Thread.sleep(2000);
			myRunThread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (Exception e) {
		}
	}
}
