package com.baniao.strategy.shixian;

import com.baniao.strategy.jiekou.FlyBehavior;

//定义一个会飞的策略
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");

	}

}
