package com.lhrl;

public class HashImpl extends Hash{

	@Override
	public void sing() {
		System.out.println("����");
	}

	
	public static void main(String[] args) {
		HashImpl hashImpl=new HashImpl();
		hashImpl.say();
		hashImpl.sing();
	}
}
