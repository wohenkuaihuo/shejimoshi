package com.baniao.observer.shixian;

import java.util.ArrayList;

import com.baniao.observer.Observer;
import com.baniao.observer.Subject;

//主题发布的具体实现
public class WeatherData implements Subject {
	//定义观察者List
	private ArrayList<Observer> Observers;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {
		Observers = new ArrayList<Observer>();
	}
	//注册观察者对象
	@Override
	public void registerObserver(Observer o) {
		Observers.add(o);
	}
	//删除观察者对象
	@Override
	public void removeObserver(Observer o) {
		Observers.remove(o);
	}
	
	public boolean setChanged() {
		return true;
	}
	//通知观察者信息
	@Override
	public void notifyObserver() {
		for(int i=0;i<Observers.size();i++) {
			Observer o = Observers.get(i);
			o.update(temperature, humidity, pressure);
		}

	}
	//状态改变时，通知观察者
	public void measurementsChanged() {
		if(setChanged()) notifyObserver();
	}
	
	public void setMeasurements(float temperature,float hunidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
