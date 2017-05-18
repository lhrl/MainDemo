package com.lhrl.strategy;

/**
 * 插入排序
 * @author liu lang
 *
 * 2016年11月30日下午5:23:57
 */
public class InsertionSort implements Sort{

	@Override
	public int[] sort(int[] arrs) {
		int length=arrs.length;
		for(int i=0;i<length;i++){
			int j;
			int temp=arrs[i];
			for(j=i;j>0;j--){
				if(arrs[j-1]>temp){
					arrs[j]=arrs[j-1];
				}else{
					break;
				}
			}
			arrs[j]=temp;
		}
		System.out.println("插入排序");
		return arrs;
	}

}
