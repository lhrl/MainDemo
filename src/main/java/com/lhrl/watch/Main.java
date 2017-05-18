package com.lhrl.watch;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentCondituonDisplay condituonDisplay=new CurrentCondituonDisplay(weatherData);
		weatherData.setWeatherData(80, 60, 32.5f);
		weatherData.setWeatherData(81, 65, 32.5f);
		weatherData.setWeatherData(82, 67, 32.5f);
	}
}
