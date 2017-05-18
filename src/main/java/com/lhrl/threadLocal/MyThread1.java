package com.lhrl.threadLocal;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"在运行");
		}
	}

	
	
	public static void main(String[] args) {
		MyThread1 myThread=new MyThread1();
		myThread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"在运行");
		}
	}
}
