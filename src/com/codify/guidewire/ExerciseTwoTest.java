package com.codify.guidewire;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class ExerciseTwoTest {
	
	@Test
	void test10Itens() {
		int sol = ExerciseTwo.solution(new int[] {2, 4, 4, 6, 2, 4, 4, 8, 2, 2});
		System.out.println(sol);
		int sol2 = ExerciseTwo.solution2(new int[] {2, 4, 4, 6, 2, 4, 4, 8, 2, 2});
		System.out.println(sol2);
		System.out.println("----");
		assertTrue(sol == sol2);
	}
	
	@Test
	void test20Itens() {
		int[] itens = new int[] {2, 4, 4, 6, 2, 14, 4, 8, 2, 22, 2, 4, 4, 6, 2, 14, 4, 8, 2, 22};
		int sol = ExerciseTwo.solution(itens);
		System.out.println(sol);
		int sol2 = ExerciseTwo.solution2(itens);
		System.out.println(sol2);
		System.out.println("----");
		assertTrue(sol == sol2);
	}
	
	@Test
	void test30Itens() {
		int[] itens = new int[] {2, 4, 4, 6, 2, 14, 4, 8, 2, 22, 
				2, 4, 4, 6, 2, 14, 4, 8, 2, 2,
				2, 4, 4, 6, 2, 14, 4, 2, 2, 2};
		int sol = ExerciseTwo.solution(itens);
		System.out.println(sol);
		int sol2 = ExerciseTwo.solution2(itens);
		System.out.println(sol2);
		System.out.println("----");
		assertTrue(sol == sol2);

	}		
	
	@Test
	void test50000Itens() {
		int[] itens = new int[50000];
		for(int i = 0; i < 50000; i++) 
			itens[i] = (int)(Math.random() * 100);
		
		Date start = new Date();
		int sol = ExerciseTwo.solution(itens);
		Date finish = new Date();
		System.out.println(sol + " - Time: " + (finish.getTime() - start.getTime()));
		
		start = new Date();
		int sol2 = ExerciseTwo.solution2(itens);
		finish = new Date();
		System.out.println(sol2 + " - Time: " + (finish.getTime() - start.getTime()));
		
		start = new Date();
		int sol3 = ExerciseTwo.solution2(itens);
		finish = new Date();
		System.out.println(sol3 + " - Time: " + (finish.getTime() - start.getTime()));
		System.out.println("----");
		
		assertTrue((sol == sol2) && (sol2 == sol3));

	}	
	

}
