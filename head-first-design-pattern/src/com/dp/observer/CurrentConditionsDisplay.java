package com.dp.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Condition : " + temperature + " F degrees , " + humidity + " % humidity");

	}

	@Override
	public void update(float tmp, float humidity, float pressure) {
		this.temperature = tmp;
		this.humidity = humidity;

		display();
	}

}
