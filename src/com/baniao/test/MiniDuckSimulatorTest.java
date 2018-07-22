package com.baniao.test;

import com.baniao.strategy.Duck;
import com.baniao.strategy.category.ModelDuck;
import com.baniao.strategy.shixian.FlyRocketpowered;
import com.baniao.strategy.shixian.Quack;

public class MiniDuckSimulatorTest {

	public static void main(String[] args) {

		Duck duck =  new ModelDuck();
		duck.setFlyBehavior(new FlyRocketpowered());
		duck.setQuackBehavior(new Quack());
		
		duck.performFly();
		duck.performQuack();
		duck.display();
	}

}
