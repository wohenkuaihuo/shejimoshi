package com.baniao.decorate.shixian;

import com.baniao.decorate.Beverage;

//饮料的具体实现
public class Espresso extends Beverage {

public Espresso() {
	description = "Espresso";
}
	@Override
	public double cost() {
		return 1.99;
	}

}
