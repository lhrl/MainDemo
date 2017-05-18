package com.lhrl.Iterator;

import java.util.ArrayList;
import java.util.List;

public class TvChanneMenu implements TelevisionMenu{
	
	private List<MenuItem> menuItemList; 

	public TvChanneMenu() {
		menuItemList=new ArrayList<MenuItem>();
		addItem(1, "CCTV-1", "this is CCTV-1");
		addItem(2, "CCTV-2", "this is CCTV-2");
		addItem(3, "CCTV-3", "this is CCTV-3");
		addItem(4, "CCTV-4", "this is CCTV-4");
		addItem(5, "CCTV-5", "this is CCTV-5");
		
	}
	
	/**
	 * 将电视节目频道节目添加到菜单集合中
	 */
	@Override
	public void addItem(int channe, String name, String description) {
		MenuItem menuItem=new MenuItem(name, description, channe);
		menuItemList.add(menuItem);
	}
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	
	
}
