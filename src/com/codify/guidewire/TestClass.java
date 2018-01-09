package com.codify.guidewire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	void test() {
	    int result = CodilitySample.main("15", "DUP", "3", "+", "DUP", "+");
		System.out.println(result);
		assertEquals(36, result);
	}

}

