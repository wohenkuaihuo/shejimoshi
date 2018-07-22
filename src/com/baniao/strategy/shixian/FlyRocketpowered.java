package com.baniao.strategy.shixian;

import com.baniao.strategy.jiekou.FlyBehavior;

//定义一个具有火箭动力的鸭子
public class FlyRocketpowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");

	}

}
