package com.codify.guidewire.novo;

import java.util.Arrays;

public class Codility {
	
	public int solution(int[] A) {
		Arrays.sort(A);
		int sol = 1;
		boolean found = false;
		int pos = -1;
		for(int i = 0; ((i < A.length) && !found); i++) {
			pos = Arrays.binarySearch(A, sol);
			if(pos < 0) {
				break;
			}
			else {
				sol++;
			}
		}
		return sol;
	}

}
