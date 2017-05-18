package com.lhrl.strategy;

/**
 * 选择排序
 * @author liu lang
 *
 * 2016年11月30日下午5:30:24
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
		System.out.println("选择排序");
		return arrs;
	}

}
