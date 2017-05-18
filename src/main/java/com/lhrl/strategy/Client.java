package com.lhrl.strategy;
/**
 * 策略模式
 * @author liu lang
 *
 * 2016年11月30日下午5:33:49
 */
public class Client {

	public static void main(String[] args) {
		int[] arrs={1,9,4,5,15,11,6,2,8,3,10,7};
		int[] result;
		Arrayhandler arrayhandler=new Arrayhandler();
		arrayhandler.setSortObj(new BubbleSort());
		result=arrayhandler.sort(arrs);
		for (int i : result) {
			System.out.print(i+",");
		}
	}
}
