package com.baniao.observer;

//定义主题接口
public interface Subject {
	//注册观察者
	public void registerObserver(Observer o);
	//删除观察者
	public void removeObserver(Observer o);
	//通知观察者消息
	public void notifyObserver();
}
