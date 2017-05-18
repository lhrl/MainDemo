package com.lhrl.thread;

public class Thread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("第一个线程："+i);
		}
	}

	
}
