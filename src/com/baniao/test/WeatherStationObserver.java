package com.baniao.test;

import com.baniao.observer.Observer;
import com.baniao.observer.Subject;
import com.baniao.observer.shixian.CurrentConditionsDisplay;
import com.baniao.observer.shixian.WeatherData;

//观察者模式测试
public class WeatherStationObserver {

	public static void main(String[] args) {
		WeatherData s =  new WeatherData();
		Observer o = new CurrentConditionsDisplay(s);
		
		s.setMeasurements(12.31f, 24.21f, 11.21f);
		
	}

}
