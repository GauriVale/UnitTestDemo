package com.quickheal.androidunittestdemo;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.quickheal.unittest.demo.android.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Gauri.Vale on 7/4/2016.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

	@Rule
	public ActivityTestRule<MainActivity> activityTestRule;

	@Before
	public void setUp() {
		activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class, false, false);
	}

	@Test
	public void checkViewContent() {
		activityTestRule.launchActivity(new Intent());
		Espresso.onView(ViewMatchers.withId(R.id.tvTitle)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
	}

	@Test
	public void checkButtonClick() {
		activityTestRule.launchActivity(new Intent());
		Espresso.onView(ViewMatchers.withId(R.id.btnClickHere)).perform(ViewActions.click());
		Espresso.onView(ViewMatchers.withId(R.id.tvTitle)).check(ViewAssertions.matches(ViewMatchers.withText("Button is clicked!!!")));
	}

	@Test
	public void checkViewRender() {
		activityTestRule.launchActivity(new Intent());
		Espresso.onView(ViewMatchers.withId(R.id.tvTitle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
	}

}
