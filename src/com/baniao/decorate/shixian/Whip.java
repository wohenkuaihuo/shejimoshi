package com.baniao.decorate.shixian;

import com.baniao.decorate.Beverage;
import com.baniao.decorate.CondimentDecorator;
//装饰者
public class Whip extends CondimentDecorator {
Beverage beverage;
public Whip(Beverage beverage) {
	this.beverage = beverage;
}
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Whip";
	}

	@Override
	public double cost() {
		
		return 0.20 +beverage.cost();
	}

}
