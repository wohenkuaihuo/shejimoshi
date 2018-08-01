package com.baniao.test;

import com.baniao.iterator.DinerMenu;
import com.baniao.iterator.PancakeHouseMenu;
import com.baniao.iterator.Waitress;

public class IteratorMenutestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
		waitress.printMenu();
	}

}
