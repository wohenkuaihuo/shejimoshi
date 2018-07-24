package com.baniao.decorate.shixian;

import com.baniao.decorate.Beverage;
import com.baniao.decorate.CondimentDecorator;
//装饰者
public class Mocha extends CondimentDecorator {
Beverage beverage;
public Mocha(Beverage beverage) {
	this.beverage = beverage;
}
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		
		return 0.20 +beverage.cost();
	}

}
