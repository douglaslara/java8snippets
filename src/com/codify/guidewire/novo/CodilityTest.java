package com.codify.guidewire.novo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodilityTest {
	
	Codility app = new Codility();

	@Test
	void testArrayOfOne() {
		int sol = app.solution(new int[] {1});
		assertTrue(sol == 2);
	}

	@Test
	void testArrayOfOne2() {
		int sol = app.solution(new int[] {2});
		assertTrue(sol == 1);
	}
	
}
