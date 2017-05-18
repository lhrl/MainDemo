package com.lhrl.threadLocal;

public class MyThread4 extends Thread{

	@Override
	public void run() {
		System.out.println("begin:"+System.currentTimeMillis());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end:"+System.currentTimeMillis());
	}

	
	public static void main(String[] args) {
		MyThread4 myThread4=new MyThread4();
		myThread4.start();
		
		
	}
}
