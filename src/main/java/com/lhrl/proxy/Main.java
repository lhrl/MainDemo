package com.lhrl.proxy;

/**
 * 代理模式
 * @author liu lang
 *
 * 2016年12月1日下午6:14:48
 */
public class Main {

	public static void main(String[] args) {
		BeautifulGirl girl=new BeautifulGirl("小小");
		HerChum herChum=new HerChum(girl);
		herChum.giveBook();
		herChum.giveFlowers();
		herChum.giveChocolate();
	}
}
