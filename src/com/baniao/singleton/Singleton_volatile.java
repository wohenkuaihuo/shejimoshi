package com.baniao.singleton;

//双重检查加锁模式
public class Singleton_volatile {
	private Singleton_volatile() {
		
	}
	//volatile关键字确保当unique变量被初始化成singleton对象时，多个线程正确的处理uniqueInstance变量
	private volatile static Singleton_volatile uniqueInstance;
	
	public static Singleton_volatile getIntance() {
		//如果实例不存在，就进入同步区块，只有第一次才会彻底执行这里的代码
		if(uniqueInstance == null) {
			synchronized (Singleton_volatile.class) {
				//进入区块后，再检查一次，如果仍是null，才创建实例。
				if(uniqueInstance ==null) {
					uniqueInstance = new Singleton_volatile();
				}
			}
		}
		return uniqueInstance;
				
	}
}
