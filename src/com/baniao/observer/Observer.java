package com.baniao.observer;

//定义观察者接口
public interface Observer {
	//当主题推送消息时，更新主题信息
	public void update(float temperature,float humidity,float pressure);

}
