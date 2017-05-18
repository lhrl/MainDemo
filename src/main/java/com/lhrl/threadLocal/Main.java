package com.lhrl.threadLocal;

public class Main {

	
	public static void main(String[] args) throws Exception {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(Thread.currentThread().getName()+"运行");
				}
				
			}
		});
		thread.start();
		thread.join();
		System.out.println("我想等子线程执行完毕后再执行 我做到了");
	}
}
