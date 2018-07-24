package com.baniao.abstrFactoryMethod.shixian;

import com.baniao.abstrFactoryMethod.jiekou.NotebookComputer;
import com.baniao.abstrFactoryMethod.jiekou.PersonalComputer;

public class PersonalComputerB extends PersonalComputer {
@Override
public void doUse() {
	System.out.println("这是个人计算机的功能B");
}
}
