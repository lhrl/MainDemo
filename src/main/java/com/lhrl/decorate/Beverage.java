package com.lhrl.decorate;

/**
 * ���ϳ�����
 * @author liu lang
 *
 * 2016��11��25������2:51:02
 */
public abstract class Beverage {

	protected String description="Unknown  Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}
