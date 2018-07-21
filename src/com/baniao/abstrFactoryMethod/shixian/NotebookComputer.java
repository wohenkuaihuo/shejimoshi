package com.baniao.abstrFactoryMethod.shixian;

import com.baniao.abstrFactoryMethod.jiekou.Computer;

public class NotebookComputer extends Computer {
@Override
public void doUse() {
	System.out.println("这是个人笔记本的功能");
}
}
