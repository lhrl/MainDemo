package com.lhrl.watch;


/**
 * Ŀ�����
 * @author liu lang
 *
 * 2016��11��25������10:36:24
 */
public interface Subject {
	
	/**
	 * ע��۲���
	 * @param observer
	 */
	void registerObserver(Observer observer);
	
	/**
	 * ɾ���۲���
	 * @param observer
	 */
	void deleteObserver(Observer observer);
	
	/**
	 * ��Ŀ��������ı�ʱ  ���ô˷��� ֪ͨ���еĹ۲���
	 */
	void notifyObserver();
}
