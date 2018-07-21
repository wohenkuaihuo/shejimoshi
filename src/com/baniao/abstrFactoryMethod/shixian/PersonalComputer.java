package com.baniao.abstrFactoryMethod.shixian;

import com.baniao.abstrFactoryMethod.jiekou.Computer;

public class PersonalComputer extends Computer {
@Override
public void doUse() {
	System.out.println("这是个人计算机的功能");
}
}
