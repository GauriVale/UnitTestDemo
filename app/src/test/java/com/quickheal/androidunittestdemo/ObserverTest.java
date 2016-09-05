package com.quickheal.androidunittestdemo;

import com.quickheal.unittest.demo.java.observer.WeatherObservable;
import com.quickheal.unittest.demo.java.observer.WeatherObserver;

import org.junit.Test;

/**
 * Created by Gauri.Vale on 7/5/2016.
 */
public class ObserverTest {

	@Test
	public void testObserver() {
		WeatherObservable observable = new WeatherObservable();
		WeatherObserver observer = new WeatherObserver();
		observable.addObserver(observer);
		observable.setWeather("Bright and sunny...Let's play cricket!!");
		observable.setWeather("Raining Heavily!..Let's have hot Pakodas!!");
	}
}
