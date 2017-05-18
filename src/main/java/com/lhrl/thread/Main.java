package com.lhrl.thread;

/**
 * 模拟多线程的环境
 * @author liu lang
 *
 * 2016年11月29日上午10:11:51
 */
public class Main {
	/**
	 * 第一种方式：继承Thread 重载run方法  thread.start();
	 * @param args
	 */
	public static void main1(String[] args) {
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		thread1.start();
		thread2.start();
	}
	
	/**
	 * 第二种方式：继承Runable接口 实现run方法  构造一个thread  thread.start();
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1=new Thread(new Run1());
		Thread thread2=new Thread(new Run2());
		thread1.start();
		thread2.start();
	}
}
