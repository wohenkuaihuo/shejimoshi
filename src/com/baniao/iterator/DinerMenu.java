package com.baniao.iterator;

import java.util.Iterator;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("蛋挞","蛋挞",false,1.21);
		addItem("热狗","🌭️",false,2.22);
		addItem("面包","🍞",false,3.41);
		addItem("鸭子","🦆",false,5.21);
		
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		if(numberOfItems>=MAX_ITEMS) {
			System.out.println("sorry,menu is full!can't add item to menu");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems+1;
		}
	}
	
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
