package com.lhrl.threadLocal;

public class MyThread3 extends Thread{

	static{
		System.out.println("静态块的打印："+Thread.currentThread().getName());
	}
	
	public MyThread3(){
		System.out.println("构造方法的打印:"+Thread.currentThread().getName());
	}
	
	public void run(){
		System.out.println("run方法执行了"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyThread3 myThread3=new MyThread3();
		myThread3.start();
		MyThread3 myThread32=new MyThread3();
		myThread32.start();
	}
}
