package com.baniao.decorate;
//定义一个原型用来被装饰
public abstract class Beverage {

	protected String description = "Unknown Beveragge";
	public String getDescription() {
		return description;
	}
	//用来被装饰的抽象方法
	public abstract double cost();
}
