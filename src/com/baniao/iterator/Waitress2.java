package com.baniao.iterator;

import java.util.Iterator;

public class Waitress2 {
	PancakeHouseMenu2 pancakeHouseMenu2 ;
	DinerMenu dinerMenu;
	
	public Waitress2(PancakeHouseMenu2 pancakeHouseMenu2,DinerMenu dinerMenu) {
		this.pancakeHouseMenu2 = pancakeHouseMenu2;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu2.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n-------\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName()+" "+menuItem.getPrice()+" "+menuItem.getDescription());
			
		}
		
	}
	
	

}
