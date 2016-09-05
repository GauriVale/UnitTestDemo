package com.quickheal.androidunittestdemo;

import com.quickheal.unittest.demo.java.MathsUtil;

import junit.framework.Assert;

import org.junit.Test;

public class MathsUtilTest {

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;

		int result = MathsUtil.add(a, b);

		Assert.assertEquals(5, result);
	}
	
	@Test
	public void testSubtract() {
		int a = 5;
		int b = 2;

		int result = MathsUtil.subtract(a, b);

		Assert.assertEquals(3, result);
	}
	
}
