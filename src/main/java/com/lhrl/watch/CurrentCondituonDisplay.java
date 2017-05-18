package com.lhrl.watch;
/**
 * �����
 * @author liu lang
 *
 * 2016��11��25������10:57:33
 */
public class CurrentCondituonDisplay implements Observer,DisplayElement{

	private float tempterature;
	private float pressure;
	private float humidity;
	private Subject weatherData;
	@Override
	public void display() {
		System.out.println("Current conditions:"+tempterature+","+pressure+","+humidity);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity=humidity;
		this.pressure=pressure;
		this.tempterature=temp;
		display();
	}
	
	/**
	 * ��ǰ��ʾ�Ĳ����
	 * @param subject
	 */
	public CurrentCondituonDisplay(Subject subject) {
		this.weatherData=subject;
		this.weatherData.registerObserver(this);
	}

}
