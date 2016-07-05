package com.quickheal.androidunittestdemo;

import com.quickheal.unittest.demo.java.MathsUtil;

import junit.framework.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsUtilTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		MathsUtil mathsUtil = new MathsUtil(2, 3);
		int result = mathsUtil.add();
		Assert.assertEquals(5, result);
	}
	
	@Test
	public void testSubtract() {
		
	}
	
}
