package com.lhrl.strategy;

public class Arrayhandler {

	private Sort sortObj;

	public int[] sort(int[] arrs){
		sortObj.sort(arrs);
		return arrs;
	}
	public void setSortObj(Sort sortObj) {
		this.sortObj = sortObj;
	}
	
	
}
