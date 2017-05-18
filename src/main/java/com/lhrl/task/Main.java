package com.lhrl.task;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ��������
 * @author liu lang
 *
 * 2016��11��29������9:22:26
 */
public class Main {

	/**
	 * ��һ��  ��ͨ��thread  ͨ��Sleep�����ﵽ��ʱ��Ч��
	 * @param args
	 */
	public static void main1(String[] args) {
		
		final long timeInterval=5000; //5��ִ��һ��
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("���ڽ��е�����....");
					try {
						Thread.sleep(timeInterval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
		
	}
	
	/*
	 * �ڶ��֣�ʹ��Timer��TimerTask
	 */
	public static void main2(String[] args) {
		TimerTask timerTask=new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("���ڽ��е�����...");
			}
		};
		
		Timer timer=new Timer();
		long delay=2000;
		long intevalPeriod=1*5000;
		timer.schedule(timerTask, delay,intevalPeriod);
		
	}
	
	/**
	 * �����ַ�ʽ��ʹ��ScheduledExecutorService  ����������Ķ�ʱ����ʵ�ַ�ʽ
	 * @param args
	 */
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =Executors.newSingleThreadScheduledExecutor();
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("���ڽ��е�����....");
			}
		};
		
		scheduledExecutorService.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}
}
