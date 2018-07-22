package com.baniao.strategy.shixian;

import com.baniao.strategy.jiekou.QuackBehavior;

//定义一个安静的鸭子
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println("<<silence>>");
		
	}

}
