package com.lhrl.strategy;

/**
 * ð������
 * @author liu lang
 *
 * 2016��11��30������5:22:10
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
		System.out.println("ð������");
		return arrs;
	}

}
