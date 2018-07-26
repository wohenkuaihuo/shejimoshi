package com.baniao.singleton;

//饿汉模式
public class Singleton_ehan {
	private Singleton_ehan() {
		
	}
	private static Singleton_ehan uniqueInstance = new Singleton_ehan();
	public static Singleton_ehan getIntance() {
		
		return uniqueInstance;
				
	}
}
