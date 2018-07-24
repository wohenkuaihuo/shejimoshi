package com.baniao.test;

import com.baniao.decorate.Beverage;
import com.baniao.decorate.shixian.DarkRost;
import com.baniao.decorate.shixian.Espresso;
import com.baniao.decorate.shixian.HouseBlend;
import com.baniao.decorate.shixian.Mocha;
import com.baniao.decorate.shixian.Soy;
import com.baniao.decorate.shixian.Whip;

//测试装饰器模式
public class DecorateStarbuzzCoffee {

	public static void main(String[] args) {

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		Beverage beverage2 = new DarkRost();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()+"$"+beverage3.cost());
		
		double a = 1.99;
		double b= 0.20;
		double c = 0.20;
		System.out.println(a+b+c+b);
		
		
		
	}

}
