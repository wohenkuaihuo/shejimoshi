package com.baniao.adapter.shixian;

import com.baniao.adapter.jiekou.Duck;
import com.baniao.adapter.jiekou.Turkey;

//火鸡适配器
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0;i<5;i++) {
			turkey.fly();
		}
	}

}
