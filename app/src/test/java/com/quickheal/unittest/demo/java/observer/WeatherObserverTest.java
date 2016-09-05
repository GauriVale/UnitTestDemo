package com.quickheal.unittest.demo.java.observer;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

/**
 * Created by omkars on 05/09/16.
 */
public class WeatherObserverTest {

	//http://stefanbirkner.github.io/system-rules/#SystemErrAndOutRule
	@Rule
	public SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void testUpdatePrintsToSysOut() throws Exception {
		WeatherObserver observer = new WeatherObserver();

		observer.update(null, "Cloudy");

		assertThat("Weather is Cloudy\n", CoreMatchers.equalTo(systemOutRule.getLog()));
	}
}