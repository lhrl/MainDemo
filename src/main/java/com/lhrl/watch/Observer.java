package com.lhrl.watch;

/**
 * 观察者
 * @author liu lang
 *
 * 2016年11月25日上午10:34:08
 */
public interface Observer {

	void update(float temp,float humidity,float pressure);
}
