package com.lhrl.watch;


/**
 * 目标对象
 * @author liu lang
 *
 * 2016年11月25日上午10:36:24
 */
public interface Subject {
	
	/**
	 * 注册观察者
	 * @param observer
	 */
	void registerObserver(Observer observer);
	
	/**
	 * 删除观察者
	 * @param observer
	 */
	void deleteObserver(Observer observer);
	
	/**
	 * 当目标对象发生改变时  调用此方法 通知所有的观察者
	 */
	void notifyObserver();
}
