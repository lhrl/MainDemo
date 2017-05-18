package com.lhrl.Iterator;

import java.util.Iterator;
import java.util.List;

public class TvChanneMenuIterator implements Iterator<MenuItem>{

	private List<MenuItem>menuItems;
	int position=0;
	
	public TvChanneMenuIterator(List<MenuItem>menuItems) {
		this.menuItems=menuItems;
	}
	@Override
	public boolean hasNext() {
		if(position>menuItems.size()-1||menuItems.get(position)==null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem=menuItems.get(position);
		position++;
		return menuItem;
	}

}
