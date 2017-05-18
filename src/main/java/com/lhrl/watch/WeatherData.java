package com.lhrl.watch;

import java.util.ArrayList;
import java.util.List;

/**
 * weather
 * @author liu lang
 *
 * 2016��11��25������10:44:24
 */
public class WeatherData implements Subject{
	
	private List<Observer>Observers;//�۲����б�
	private float tempterature;
	private float pressure;
	private float humidity;

	public WeatherData() {
		Observers=new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer observer) {
		Observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		int i=Observers.indexOf(observer);
		if(i>=0){
			Observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : Observers) {
			observer.update(tempterature, humidity, pressure);
		}
	}
	
	/**
	 * �����仯
	 * @param tempterature
	 * @param pressure
	 * @param humidity
	 */
	public  void setWeatherData(float tempterature,float pressure,float humidity){
		this.tempterature=tempterature;
		this.pressure=pressure;
		this.humidity=humidity;
		notifyObserver();
	}
	
}
