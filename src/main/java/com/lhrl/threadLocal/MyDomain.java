package com.lhrl.threadLocal;

public class MyDomain {

	public void doWork(){
		for (int i = 0; i < 5; i++) {
			System.out.println("δ�����ķ�����:"+Thread.currentThread().getName());
		}
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("�����ķ�����:"+Thread.currentThread().getName());
			}
		}
	}
}
