package com.lhrl.single;

/**
 * ����ģʽ
 * @author liu lang
 *
 * 2016��11��29������4:13:00
 */
public class Product {

	private static Product product;
	/**
	 * ���캯��˽�л�  ����޷�����
	 */
	private Product(){
		
	}
	/**
	 * �ṩ����������ȡ�ö���
	 * @return
	 */
	public static synchronized Product getInstance(){
		if(product==null){
			product=new Product();
		}
		return product;
	}
	
}
