package com.lhrl.single;

/**
 * 单例模式
 * @author liu lang
 *
 * 2016年11月29日下午4:13:00
 */
public class Product {

	private static Product product;
	/**
	 * 构造函数私有化  外界无法创建
	 */
	private Product(){
		
	}
	/**
	 * 提供方法供外界获取该对象
	 * @return
	 */
	public static synchronized Product getInstance(){
		if(product==null){
			product=new Product();
		}
		return product;
	}
	
}
