package com.lhrl.proxy;

/**
 * ����ģʽ
 * @author liu lang
 *
 * 2016��12��1������6:14:48
 */
public class Main {

	public static void main(String[] args) {
		BeautifulGirl girl=new BeautifulGirl("СС");
		HerChum herChum=new HerChum(girl);
		herChum.giveBook();
		herChum.giveFlowers();
		herChum.giveChocolate();
	}
}
