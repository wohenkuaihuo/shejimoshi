package com.baniao.decorate.shixian;

import com.baniao.decorate.Beverage;
//饮料的具体实现
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House blend coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
