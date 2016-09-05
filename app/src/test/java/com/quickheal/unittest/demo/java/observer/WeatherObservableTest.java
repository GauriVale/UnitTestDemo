package com.quickheal.unittest.demo.java.observer;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by omkars on 05/09/16.
 */
public class WeatherObservableTest {
	
	@Test
	public void testSetWeatherInvokesObserver() throws Exception {
		WeatherObservable observable = new WeatherObservable();
		WeatherObserver observer = Mockito.mock(WeatherObserver.class);

		observable.addObserver(observer);
		observable.setWeather("Cloudy");

		Mockito.verify(observer, Mockito.times(1)).update(observable, "Cloudy");
	}
}