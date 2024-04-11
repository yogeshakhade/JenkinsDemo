package com.seleniumParameter;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Ex1 {
	
	@Test
	public void testAnnotation() {
		System.out.println("Hi..");
	}
	@BeforeTest
	public void testBefore() {
		System.out.println("BeforeTest");

	}
	@AfterTest
	public void testAfter() {
		System.out.println("AfterTest");

	}
	
	@Test
	public void testAssertions() {
		String str1=new String("Java");
		String str2=new String("Java");
		int v1=8;
		int v2=0;
		//assertEquals("Failed...",str1,str2);
		assertTrue(v1>v2);
	}
}