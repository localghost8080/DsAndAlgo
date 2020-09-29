package com.sapient.birthdaycandles.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sapient.birthdaycandles.algorithm.sort.CenterPivotQuickSort;

public class CenterPivotQuickSortTest {

	CenterPivotQuickSort sort = new CenterPivotQuickSort();
	
	@Test
	public void sortNegativeIntegers() {
		int[] actual = {-5,-7,-1,-6};
		int[] input = actual.clone();
		int [] expected =  {-7,-6,-5,-1};
		sort.sort(input);
		assertArrayEquals(expected, input);
	}
	
	
	@Test
	public void sortPositiveIntegers() {
		int[] actual = {5,7,1,6};
		int[] input = actual.clone();
		int [] expected =  {1,5,6,7};
		sort.sort(input);
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void sortMixIntegers() {
		int[] actual = {5,7,0,-1,6};
		int[] input = actual.clone();
		int [] expected =  {-1,0,5,6,7};
		sort.sort(input);
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void sortNull() {
		int[] actual = null;
		sort.sort(actual);
		assertNull(actual);
	}
	
	@Test
	public void sortNone() {
		int[] actual = {};
		sort.sort(actual);
		assertEquals(actual, actual);
	}
	

}
