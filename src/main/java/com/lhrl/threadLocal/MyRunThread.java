package com.lhrl.threadLocal;

public class MyRunThread extends Thread{

	private  volatile boolean isRunning=true;

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public void run(){
		System.out.println("����run��");
		while(isRunning){
			
		}
		System.out.println("�̱߳�ֹͣ��");
	}
	
	public static void main(String[] args) {
		try {
			MyRunThread myRunThread=new MyRunThread();
			myRunThread.start();
			Thread.sleep(2000);
			myRunThread.setRunning(false);
			System.out.println("�Ѿ���ֵΪfalse");
		} catch (Exception e) {
		}
	}
}
