package com.lhrl.test;

public class TwoTuple<A,B> {

	public  final A first;
	
	public final B second;

	public TwoTuple(A first, B second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public static TwoTuple<String, Integer>tupTest(){
		return new TwoTuple<String, Integer>("hello", 1);
	}
	
	public static void main(String[] args) {
		System.out.println(TwoTuple.tupTest().first);
	}
	
}
