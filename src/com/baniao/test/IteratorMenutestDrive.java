package com.baniao.test;

import com.baniao.iterator.DinerMenu;
import com.baniao.iterator.PancakeHouseMenu;
import com.baniao.iterator.PancakeHouseMenu2;
import com.baniao.iterator.Waitress;
import com.baniao.iterator.Waitress2;

public class IteratorMenutestDrive {

	public static void main(String[] args) {
		//白箱聚集
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		//黑箱聚集
		PancakeHouseMenu2 pancakeHouseMenu2 = new PancakeHouseMenu2();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress2 waitress2 = new Waitress2(pancakeHouseMenu2,dinerMenu);
		waitress2.printMenu();
	}

}
