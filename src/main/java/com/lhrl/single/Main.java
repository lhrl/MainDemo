package com.lhrl.single;

public class Main {

	public static void main(String[] args) {
		Product product1=Product.getInstance();
		Product product2=Product.getInstance();
		
		System.out.println(product1);
		System.out.println(product2);
	}
}
