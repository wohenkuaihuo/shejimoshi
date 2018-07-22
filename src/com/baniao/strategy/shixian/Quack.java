package com.baniao.strategy.shixian;

import com.baniao.strategy.jiekou.QuackBehavior;

//定义一个呱呱叫的鸭子
public class Quack implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println("Quack");
	}

}
