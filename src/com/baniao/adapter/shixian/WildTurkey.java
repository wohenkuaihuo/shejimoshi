package com.baniao.adapter.shixian;

import com.baniao.adapter.jiekou.Turkey;

//实现火鸡的实现
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
