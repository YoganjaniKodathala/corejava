package com.maven.junitmavenproject;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition {
	public int add(int a, int b) {
		return a+b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	@Test
	public void addTest() {
		assertEquals(4,add(2,2));
	}
	@Test
	public void mulTest() {
		assertEquals(6,mul(3,2));
	}
	@Test
	public void divisionTest() {
		assertEquals(9,division(18,2));
	}

	public String evenodd() {
		int num = 12;
		if(num%2==0) {
			return "even";
	}else {
		return "odd";
	}
}
	//evenodd
	@Test
	public void evenOddTest1() {
		assertEquals("even",evenodd());
	}
	
}