package com.baniao.strategy.shixian;

import com.baniao.strategy.jiekou.FlyBehavior;

//定义一个不会飞的策略
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println("I can't fly");
	}

}
