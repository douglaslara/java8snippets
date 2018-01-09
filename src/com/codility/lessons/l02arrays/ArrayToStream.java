package com.codility.lessons.l02arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayToStream {
	public int[] doubleIntArray(int[] ar) {
		return Arrays.stream(ar).map(n -> n *2).toArray();
	}

	public OptionalInt findHigherSorted(int[] a1) {
		return Arrays.stream(a1).max();
	}
}
