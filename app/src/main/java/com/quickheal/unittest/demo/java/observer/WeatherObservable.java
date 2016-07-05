package com.quickheal.unittest.demo.java.observer;

import java.util.Observable;

/**
 * Created by Gauri.Vale on 7/5/2016.
 */
public class WeatherObservable extends Observable {
	private String weather;

	public WeatherObservable(String weather) {
		this.weather = weather;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
		setChanged();
		notifyObservers();
	}

}
