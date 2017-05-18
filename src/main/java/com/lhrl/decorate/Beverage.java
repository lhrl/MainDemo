package com.lhrl.decorate;

/**
 * 饮料抽象类
 * @author liu lang
 *
 * 2016年11月25日下午2:51:02
 */
public abstract class Beverage {

	protected String description="Unknown  Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}
