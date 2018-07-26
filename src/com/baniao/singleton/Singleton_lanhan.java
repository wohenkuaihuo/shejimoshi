package com.baniao.singleton;

//懒	汉模式
public class Singleton_lanhan {
	private Singleton_lanhan() {
		
	}
	private static Singleton_lanhan uniqueInstance ;
	public static Singleton_lanhan getIntance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton_lanhan();
		}
		return uniqueInstance;
				
	}
}
