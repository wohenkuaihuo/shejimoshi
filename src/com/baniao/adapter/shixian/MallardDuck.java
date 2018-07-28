package com.baniao.adapter.shixian;

import com.baniao.adapter.jiekou.Duck;
//绿头鸭的实现
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
