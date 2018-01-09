package com.codility.lessons.l02arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayToStreamTest {
	
	ArrayToStream a2s = new ArrayToStream();

	@Test
	void test() {
		int[] a1 = new int[] {1, 2, 3, 4};
		int[] a2 = a2s.doubleIntArray(a1);
		assertTrue(Arrays.equals(a2, new int[]{2, 4, 6, 8}));
		assertTrue(Arrays.equals(a1, new int[]{1, 2, 3, 4})); //original array is immutable
	}
	
	@Test
	void testFindTheHigherValueSorted() {
		int[] a1 = new int[] {1, 2, 3, 4};
 		assertTrue(4 == a2s.findHigherSorted(a1).orElse(-1));
	}
	
	@Test
	void testFindTheHigherValueUnSorted() {
		int[] a1 = new int[] {1, 13, 9, 4};
 		assertTrue(13 == a2s.findHigherSorted(a1).orElse(-1));
	}	

}
