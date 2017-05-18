package com.lhrl.adapter;

/**
 * 适配器模式
 * @author liu lang
 *
 * 2016年11月29日下午5:03:46
 */
public class Client {

	public static void main(String[] args) {
		Robat robat=new DogAdapter(new Dog());
		robat.cry();
		robat.move();
	}
}
