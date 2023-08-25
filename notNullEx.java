package com.maven.junitmavenproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class notNullEx {
	int a[]= {1,3,6};
	int b[]= {1,3,6};
	
	String s="Welcome to maven";
	
	
	@Test
	public void test() {
assertArrayEquals(a, b);
	}
	@Test
	public void test1() {
assertNotNull(s);
	}

}
