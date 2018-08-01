package com.baniao.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public Object next() {
		MenuItem menuItem = items[position];
		position = position+1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if(position >= items.length||items[position] == null) {
			return false;
		}else {
			return true;
		}
	}

}
