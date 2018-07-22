package com.baniao.strategy;

import com.baniao.strategy.jiekou.FlyBehavior;
import com.baniao.strategy.jiekou.QuackBehavior;

//抽象鸭子类，用于具体实现的鸭子继承
public abstract class Duck {
	//定义需要使用的策略
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	public abstract void display();
	//添加策略所要使用的方法
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	//公共的方法
	public void swim() {
		System.out.println("All ducks float,even decoys");
	}
	//在运行期间动态设置鸭子的行为
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
