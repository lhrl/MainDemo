package com.lhrl.threadLocal;

public class Domain {

	private int num;
	//synchronized�Ƕ�����  ����ͬһ������Ķ���߳� ֻ��ͬһ��ʱ���ֻ��һ���߳̿��Խ���
	public  void addNum(String userName) {

		try {
			if ("a".equals(userName)) {
				num = 100;
				System.out.println("a get num");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b get num");
			}
			System.out.println(userName+" num is " + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		Domain domain=new Domain();
		Domain domain1=new Domain();
		Thread1 thread1=new Thread1(domain);
		Thread2 thread2=new Thread2(domain1);
		thread1.start();
		thread2.start();
	}
}
