package com.sapient.birthdaycandles.main;

import com.sapient.birthdaycandles.solution.BirthdaySolution;
import com.sapient.birthdaycandles.solution.BirthdaySolutionTree;

public class BirthdayCandlesApplication {

	public static void main(String[] args) {
		int[] candles = {8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7};
		
		BirthdaySolution solution = new BirthdaySolutionTree();
		System.out.println("number of blows = "+ solution.getNumberOfBlows(candles));
		
	}
	
}
