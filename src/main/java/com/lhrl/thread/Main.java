package com.lhrl.thread;

/**
 * ģ����̵߳Ļ���
 * @author liu lang
 *
 * 2016��11��29������10:11:51
 */
public class Main {
	/**
	 * ��һ�ַ�ʽ���̳�Thread ����run����  thread.start();
	 * @param args
	 */
	public static void main1(String[] args) {
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		thread1.start();
		thread2.start();
	}
	
	/**
	 * �ڶ��ַ�ʽ���̳�Runable�ӿ� ʵ��run����  ����һ��thread  thread.start();
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1=new Thread(new Run1());
		Thread thread2=new Thread(new Run2());
		thread1.start();
		thread2.start();
	}
}
