package com.sapient.birthdaycandles.solution;

import com.sapient.birthdaycandles.algorithm.sort.CenterPivotQuickSort;
import com.sapient.birthdaycandles.algorithm.sort.InplaceSort;

public class BirthDaySolutionSorting implements BirthdaySolution {

	/**
	 * Approach : sort the list and iterate over sorted list to get unique elements in the list.
	 * 
	 * A different answer could be to use a hashset and count unique elements in hashset , this is more efficient but not chosen to implement  
	 * as JDK libraries are unavailable and it difficult to implement hash collision avoidance with efficient memory utilization in given time.
	 * 
	 * Complexity Max(O nlogn , n) == O(nLogn) + O(n)
	 * 
	 * @param candles
	 * @return blows required
	 */
	
	InplaceSort sortAlgo = new CenterPivotQuickSort();
	
	public int getNumberOfBlows(int[] candles) {
		
		if(candles == null || candles.length ==0) {
			return 0;
		}
		int[] input = candles.clone(); // Defensive copy
		for(int val : input) {
			if(val <0) {
				throw new IllegalArgumentException("Found negative length candle length");
			}
		}
		sortAlgo.sort(input);
		
		int count = 0;
		int prev = Integer.MIN_VALUE;
		
		for(int val : input) {
			if(val!=prev) {
				count++;
			}
			prev=val;
		}
		
		return count;
		
	}
	
}
