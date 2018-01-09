package com.codify.guidewire;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class IterationsLessonTest {
	
	IterationsLesson it = new IterationsLesson();

	@Test
	void testLessonOne_PositiveSmallGap() {
		assertTrue(it.lessonOne(5) == 1);
	}
	
	@Test
	void testLessonOne_NoGap() {
		assertTrue(it.lessonOne(15) == 0);
	}
	
	@Test
	void testLessonOne_OneGapGreater() {
		assertTrue(it.lessonOne(529) == 4);
	}
	
	@Test
	void testLessonOne_IdenticalsGaps() {
		assertTrue(it.lessonOne(2184) == 3);
	}	
	
	@Test
	void testLessonOne_One() {
		assertTrue(it.lessonOne(1) == 0);
	}	
	
	@Test
	void testLessonOne_GapInTheEnd() {
		assertTrue(it.lessonOne(4) == 0);
	}		
}
