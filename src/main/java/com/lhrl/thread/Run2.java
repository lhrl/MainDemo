package com.lhrl.thread;

public class Run2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我说第【2】个线程:"+i);
		}
	}

}
