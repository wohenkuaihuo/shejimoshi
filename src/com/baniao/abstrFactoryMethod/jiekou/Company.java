package com.baniao.abstrFactoryMethod.jiekou;

//抽象工厂类
public interface Company {
	//构建生产电脑方法
	public Computer buildComputer(String parameter);
	//构建生产电话方法
	public TelePhone buildTelePhone(String parameter);
	

}
