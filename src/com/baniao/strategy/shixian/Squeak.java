package com.baniao.strategy.shixian;

import com.baniao.strategy.jiekou.QuackBehavior;

//定义一个吱吱叫的鸭子
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println("Squeak");
	}

}
