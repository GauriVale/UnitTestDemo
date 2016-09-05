package com.quickheal.unittest.demo.java.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Gauri.Vale on 7/5/2016.
 */
public class WeatherObserver implements Observer {

	@Override
	public void update(Observable observable, Object data) {
		System.out.println("Weather is " + data);
	}
}
