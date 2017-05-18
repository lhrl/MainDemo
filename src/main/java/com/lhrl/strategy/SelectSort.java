package com.lhrl.strategy;

/**
 * ѡ������
 * @author liu lang
 *
 * 2016��11��30������5:30:24
 */
public class SelectSort implements Sort{

	@Override
	public int[] sort(int[] arrs) {
		int length=arrs.length;
		int temp;
		for(int i=0;i<length;i++){
			temp=arrs[i];
			int j;
			int smallestlocation=i;
			for(j=i+1;j<length;j++){
				if(arrs[j]<temp){
					temp=arrs[j];
					smallestlocation=j;
				}
			}
			arrs[smallestlocation]=arrs[i];
			arrs[i]=temp;
		}
		System.out.println("ѡ������");
		return arrs;
	}

}
