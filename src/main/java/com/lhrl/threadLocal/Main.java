package com.lhrl.threadLocal;

public class Main {

	
	public static void main(String[] args) throws Exception {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(Thread.currentThread().getName()+"����");
				}
				
			}
		});
		thread.start();
		thread.join();
		System.out.println("��������߳�ִ����Ϻ���ִ�� ��������");
	}
}
