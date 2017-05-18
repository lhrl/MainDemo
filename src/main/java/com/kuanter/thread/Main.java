package com.kuanter.thread;

public class Main {

	public static void main(String[] args) throws Exception {
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<500;i++) {
					System.out.println("第一个线程");
					
					Student.LOCAL_USERNAME.set("admin");
					System.out.println("获取到了:"+Student.LOCAL_USERNAME.get());
				}
			}
		});
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<500;i++) {
					System.out.println("第二个线程的值"+Student.LOCAL_USERNAME.get());
				}
			}
		});
		thread1.start();
		thread2.start();
	}
}
