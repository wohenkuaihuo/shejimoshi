package com.baniao.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
	
	ArrayList MenuItems;
	
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	
	public PancakeHouseMenu() {
		MenuItems = new ArrayList();
		addItem("蛋挞","",false,1.21);
		addItem("热狗","️",false,2.22);
		addItem("面包","🍞",false,3.41);
		addItem("鸭子","🦆",false,5.21);
		
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		MenuItems.add(menuItem);
	}
	
	
	public Iterator createIterator() {
		return new PancakeHouseIterator(MenuItems);
	}

}
