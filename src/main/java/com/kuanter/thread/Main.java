package com.kuanter.thread;

public class Main {

	public static void main(String[] args) throws Exception {
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<500;i++) {
					System.out.println("��һ���߳�");
					
					Student.LOCAL_USERNAME.set("admin");
					System.out.println("��ȡ����:"+Student.LOCAL_USERNAME.get());
				}
			}
		});
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<500;i++) {
					System.out.println("�ڶ����̵߳�ֵ"+Student.LOCAL_USERNAME.get());
				}
			}
		});
		thread1.start();
		thread2.start();
	}
}
