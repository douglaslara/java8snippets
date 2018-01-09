package com.codify.guidewire;

public class IterationsLesson {
	
	public int lessonOne(int number) {
		
		String bin = Integer.toBinaryString(number);
		int gap = countZeroGaps(bin);
		
		return gap;
		
	}

	private int countZeroGaps(String bin) {
		int majorGap = 0;
		int actualGap = 0;
		char[] binArr = bin.toCharArray();
		for(int i = 0; i < bin.length(); i++) {
			if(binArr[i] == '1') {
				majorGap = Integer.max(majorGap, actualGap);
				actualGap = 0;
			}
			else
				actualGap++;
		}
		
		return majorGap;
	}

}
