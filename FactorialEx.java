package com.maven.junitmavenproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactorialEx {
	public int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	@Test
	public void FactorialExTest() {
		assertEquals(24,fact(4));
	}
	//using True or False
public class evenoddP{
	
	public boolean isEvenNumber(int number) {
		boolean result = false;
		if(number%2 == 0);{
			result = true;
		}
		return result;
	}
	@Test
	public void evenNumberTest() {
		evenoddP e = new evenoddP();
		assertTrue(e.isEvenNumber(24));
	}
		
}
}
