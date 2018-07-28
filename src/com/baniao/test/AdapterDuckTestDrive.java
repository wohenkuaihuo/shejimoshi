package com.baniao.test;

import com.baniao.adapter.jiekou.Duck;
import com.baniao.adapter.shixian.MallardDuck;
import com.baniao.adapter.shixian.TurkeyAdapter;
import com.baniao.adapter.shixian.WildTurkey;
//适配器测试类
public class AdapterDuckTestDrive {
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();//实例化一个鸭子对象
		WildTurkey turkey  = new WildTurkey();//实例化一个火鸡对象
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);//火鸡适配器
		
		testDuck(duck);
		testDuck(turkeyAdapter);
		
	}

}
