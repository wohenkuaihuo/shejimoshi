package com.baniao.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {
	
	ArrayList MenuItems;
	int psiostion=0;

	public PancakeHouseIterator(ArrayList MenuItems) {
		this.MenuItems = MenuItems;
	}
	@Override
	public boolean hasNext() {
		if(psiostion+1+1<MenuItems.size()) {
			
			
			return true;
		}
		
		return false;
		
	}

	@Override
	public Object next() {
		psiostion = psiostion+1;
		MenuItem menuItem = (MenuItem) MenuItems.get(psiostion);
		
		return menuItem;
	}

}
