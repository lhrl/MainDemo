package com.lhrl.strategy;

/**
 * Ã°ÅİÅÅĞò
 * @author liu lang
 *
 * 2016Äê11ÔÂ30ÈÕÏÂÎç5:22:10
 */
public class BubbleSort implements Sort{

	@Override
	public int[] sort(int[] arrs) {
		int length=arrs.length;
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				int temp;
				if(arrs[i]>arrs[j]){
					temp=arrs[j];
					arrs[j]=arrs[i];
					arrs[i]=temp;
				}
			}
		}
		System.out.println("Ã°ÅİÅÅĞò");
		return arrs;
	}

}
