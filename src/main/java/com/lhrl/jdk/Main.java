package com.lhrl.jdk;

public class Main {

	public static void main(String[] args) {
		Color[] colors=Color.values();
		System.out.println("ö���������£�");
		for (Color color : colors) {
			System.out.println(color+"---");
		}
		
		Color color=Color.valueOf("YELLOW");
		System.out.println(color);
		
	}
}
