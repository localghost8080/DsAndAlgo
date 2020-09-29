package com.sapient.birthdaycandles.algorithm.sort;

public class CenterPivotQuickSort implements InplaceSort {

	/**
	 * Returns the sorted list inplace using quicksort 
	 * Complexity O(nLogn)
	 */
	public int[] sort(int [] input) {
		if(input==null || input.length == 0) {
			return input;
		}
		quicksort(input,0,input.length-1);
		return input;
	}

	// Sort Inplace Using QuickSort	
	private  void quicksort(int[] input , int low , int high) {
		int pi = partition(input ,  low , high);
		if(pi-1>low) quicksort(input,low, pi-1);
		if(high>pi+1) quicksort(input,pi+1,high);
	}

	//Partition by center pivot
	private  int partition(int[] input , int i , int j) {
		int pi = (j+i)/2;
		int pivot = input[pi];
		while(i<j) {
			for(;(input[i]<=pivot && i<pi) ;i++ );
			for(;(input[j]>=pivot && j>pi );j--);
			swap(input , i , j);
			if(j==pi) {
				pi =i;
			}
			else if(i==pi) {
				pi=j;
			}
		}
		return pi;
	}

	//Swap elements
	private  void swap(int[] input , int i , int j) {
		if(i == j||input[i] == input[j])
				return; // nothing to swap
		int temp = input[i];
		input[i]=input[j];
		input[j]=temp;
	}
}
