package com.baniao.observer.shixian;

import com.baniao.observer.DisplayElement;
import com.baniao.observer.Observer;
import com.baniao.observer.Subject;
//观察者具体实现
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;//温度
	private float humidity;//湿度
	private Subject weatherData;//发布者的引用
	
	//实例化观察者
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);//注册当前观察者
	}
	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+"F degress and "+humidity+"% humdity");
	}
	
	//更新订阅者推送过来的消息
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();

	}

}
