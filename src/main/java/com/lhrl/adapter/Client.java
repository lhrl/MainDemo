package com.lhrl.adapter;

/**
 * ������ģʽ
 * @author liu lang
 *
 * 2016��11��29������5:03:46
 */
public class Client {

	public static void main(String[] args) {
		Robat robat=new DogAdapter(new Dog());
		robat.cry();
		robat.move();
	}
}
