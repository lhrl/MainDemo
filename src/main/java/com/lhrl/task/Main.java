package com.lhrl.task;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 调度任务
 * @author liu lang
 *
 * 2016年11月29日上午9:22:26
 */
public class Main {

	/**
	 * 第一种  普通的thread  通过Sleep方法达到定时的效果
	 * @param args
	 */
	public static void main1(String[] args) {
		
		final long timeInterval=5000; //5秒执行一次
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("正在进行的任务....");
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
	 * 第二种：使用Timer和TimerTask
	 */
	public static void main2(String[] args) {
		TimerTask timerTask=new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("正在进行的任务...");
			}
		};
		
		Timer timer=new Timer();
		long delay=2000;
		long intevalPeriod=1*5000;
		timer.schedule(timerTask, delay,intevalPeriod);
		
	}
	
	/**
	 * 第三种方式：使用ScheduledExecutorService  这是最理想的定时任务实现方式
	 * @param args
	 */
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =Executors.newSingleThreadScheduledExecutor();
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("正在进行的任务....");
			}
		};
		
		scheduledExecutorService.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}
}
