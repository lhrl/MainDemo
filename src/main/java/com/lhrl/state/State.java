package com.lhrl.state;

/**
 * 状态接口
 * @author liu lang
 *
 * 2016年11月30日上午11:32:39
 */
public interface State {

	/**
	 * 预定房间
	 */
	void bookRoom();
	
	/**
	 * 退订房间
	 */
	void unsubscribeRoom();
	
	/**
	 * 入住
	 */
	void checkInRoom();
	
	/**
	 * 退房
	 */
	void checkOutRoom();
}
