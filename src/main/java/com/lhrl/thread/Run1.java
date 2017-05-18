package com.lhrl.thread;

public class Run1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是第【1】线程："+i);
		}
		
	}

}
