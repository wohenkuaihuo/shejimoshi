package com.baniao.decorate.shixian;

import com.baniao.decorate.Beverage;

//饮料的具体实现
public class DarkRost extends Beverage {

public DarkRost() {
	description = "DarkRoast";
}
	@Override
	public double cost() {
		return 2.99;
	}

}
