package quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort_CenterPivot {

	static int swaps =0;
	static int stackHeight =0;
	static int stackMaxcount=0;
	public static void main(String[] args) {
//		int[] arr = {7,12,2,9,3,8,20,11,-1,5};
		int[] arr = {8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7}; 
			//{10,98,7,6,5,4,3,2,1,0};
		//int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int[] arr = {102,40,30,163,151,38,47,172,145,50,25,159,112,154,9,87,1,181,54,119,
//				70,86,133,99,181,31,101,62,89,39,179,188,22,180,165,34,199,46,17,38,
//				46,70,154,1,1,38,126,74,106,64,87,169,182,53,64,168,39,190,139,194,
//				17,22,113,7,106,189,177,117,113,54,92,104,13,42,194,144,179,144,108,
//				179,1,50,92,34,34,141,19,70,111,142,144,162,180,151,40,25,199,119,28,
//				138,106,187,159,192,89,38,110,199,139,34,107,120,172,2,70,14,145,63,
//				173,151,88,162,169,101,92,165,156,19,53,3,131,162,119,110,169,189,187,
//				45,142,163,39,9,113,28,27,139,67,31,101,199,101,56,192,64,34,19,162,
//				9,114,168,17,89,113,176,31,114,105,187,178,81,117,126,178,125,19,45,7,
//				163,116,165,187,91,172,156,114,47,93,95,142,53,79,91,165,24,151,168,
//				192,172,87,92,28};
//		int[] arr={200,199,198,197,196,195,194,193,192,191,190,189,188,187,186,185,184,183,182,181,180,
//				179,178,177,176,175,174,173,172,171,170,169,168,167,166,165,164,163,162,161,160,159,
//				158,157,156,155,154,153,152,151,150,149,148,147,146,145,144,143,142,141,140,139,138,
//				137,136,135,134,133,132,131,130,129,128,127,126,125,124,123,122,121,120,119,118,117,
//				116,115,114,113,112,111,110,109,108,107,106,105,104,103,102,101,100,99,98,97,96,95,94,
//				93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,
//				65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,
//				37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,
//				9,8,7,6,5,4,3,2,1,0};
		
		
		
		quicksort(arr);
		for(int p :arr)
			System.out.print(p+" ");
		System.out.println("\nSwaps:: "+swaps);
		System.out.println("stackMaxcount count:: "+stackMaxcount);
		System.out.println("Stack height [should be 0 ] count:: "+stackHeight);
	}
	
	public static void quicksort(int[] input ) {
		quicksort(input,0,input.length-1);
	}
	
	public static void quicksort(int[] input , int low , int high) {
		stackHeight++;   // To calculate levels of the split
		if (stackMaxcount<stackHeight) {
			stackMaxcount=stackHeight;
		}
		int pi = partition(input ,  low , high);
		if(pi-1>low) quicksort(input,low, pi-1);
		if(high>pi+1) quicksort(input,pi+1,high);
		stackHeight--;
	}

	//Partition by center pivot
	public static int partition(int[] input , int i , int j) {
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

	public static void swap(int[] input , int i , int j) {
		if(i == j||input[i] == input[j])
				return; // nothing to swap
		int temp = input[i];
		input[i]=input[j];
		input[j]=temp;
		swaps++;
	}

}
