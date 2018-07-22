package com.baniao.strategy.category;

import com.baniao.strategy.Duck;
import com.baniao.strategy.jiekou.FlyBehavior;

//定义一个模型鸭子
public class ModelDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("I'm flying with Rocket!");

	}

}
