package com.baniao.decorate.shixian;

import com.baniao.decorate.Beverage;
import com.baniao.decorate.CondimentDecorator;
//装饰者
public class Soy extends CondimentDecorator {
Beverage beverage;
public Soy(Beverage beverage) {
	this.beverage = beverage;
}
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		
		return 0.20 +beverage.cost();
	}

}
