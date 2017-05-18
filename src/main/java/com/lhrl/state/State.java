package com.lhrl.state;

/**
 * ״̬�ӿ�
 * @author liu lang
 *
 * 2016��11��30������11:32:39
 */
public interface State {

	/**
	 * Ԥ������
	 */
	void bookRoom();
	
	/**
	 * �˶�����
	 */
	void unsubscribeRoom();
	
	/**
	 * ��ס
	 */
	void checkInRoom();
	
	/**
	 * �˷�
	 */
	void checkOutRoom();
}
