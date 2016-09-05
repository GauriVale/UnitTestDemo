package com.quickheal.unittest.demo.java.observer;

import java.util.Observable;

/**
 * Created by Gauri.Vale on 7/5/2016.
 */
public class WeatherObservable extends Observable {

	public void setWeather(String weather) {
		setChanged();
		notifyObservers(weather);
	}
}
