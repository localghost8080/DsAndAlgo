package com.sapient.birthdaycandles.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BirthdaySolutionTreeTest {

	BirthdaySolution solution = new BirthdaySolutionTree();

	@Test
	public void getNumberOfBlowsNull() {
		assertEquals(0, solution.getNumberOfBlows(null));
	}
	
	@Test
	public void getNumberOfBlowsBlank() {
		assertEquals(0, solution.getNumberOfBlows(new int[0]));
	}

	
	@Test
	public void getNumberOfBlowsPositive() {
		int[] candles = {8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7};
		assertEquals(4, solution.getNumberOfBlows(candles));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getNumberOfBlowsNegative() {
		int[] candles = {-8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7};
		solution.getNumberOfBlows(candles);
	}
}
