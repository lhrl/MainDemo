package com.lhrl.Iterator;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		TvChanneMenu tvChanneMenu=new TvChanneMenu();
		List<MenuItem>menuItemList=tvChanneMenu.getMenuItemList();
		for (MenuItem menuItem : menuItemList) {
			System.out.println(menuItem.getName());
		}
		System.out.println("------------------------------------------------");
		FilmMenu filmMenu=new FilmMenu();
		MenuItem[] menuItems=filmMenu.getMenuItems();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem.getName());
		}
	}
}
