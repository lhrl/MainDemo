package com.lhrl.threadLocal;

public class MyThread3 extends Thread{

	static{
		System.out.println("��̬��Ĵ�ӡ��"+Thread.currentThread().getName());
	}
	
	public MyThread3(){
		System.out.println("���췽���Ĵ�ӡ:"+Thread.currentThread().getName());
	}
	
	public void run(){
		System.out.println("run����ִ����"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyThread3 myThread3=new MyThread3();
		myThread3.start();
		MyThread3 myThread32=new MyThread3();
		myThread32.start();
	}
}
