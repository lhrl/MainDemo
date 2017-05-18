package com.lhrl.threadLocal;

public class MyDomain {

	public void doWork(){
		for (int i = 0; i < 5; i++) {
			System.out.println("未锁定的方法块:"+Thread.currentThread().getName());
		}
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("锁定的方法块:"+Thread.currentThread().getName());
			}
		}
	}
}
