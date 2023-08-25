package com.maven.junitmavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


 public class JunitLifeCycle {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("connect to the database");
	}
	@Before
	public void before() {
		System.out.println("Load the schema");
	}
	@After
	public void afterEach() {
		System.out.println("drop the schema");
	}
	@AfterClass
	public static void afterAll() {
		System.out.println("Disconnect from the database");
	}
	@Test(timeout=1000)
	public void testOne() {
		System.out.println("Test one");
	}
	@Test
	public void testTwo() {
		System.out.println("Test two");
	}

}
