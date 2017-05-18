package com.lhrl.threadLocal;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"������");
		}
		
	}

	
	public static void main(String[] args) {
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.start();
		System.out.println(thread.getState());
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()+"������");
				}
				
			}
		}).start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"������");
		}
		System.out.println(thread.getState());
	}
}
