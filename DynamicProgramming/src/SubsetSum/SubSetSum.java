package SubsetSum;

import java.util.stream.IntStream;

/**
 * Check if given sum is possible to create with array of integers
 * @author samrat
 *
 */
public class SubSetSum {

	public static void main(String[] args) {
		int[] elements = {10,3,4,5,1};
		int sum = 17;
		int[][] result =  buildMatrix(elements, sum);
		IntStream.range(0, sum+1).forEach(i-> System.out.print(""+i+", "));
		System.out.println("");
		
		for(int[] row : result) {
			IntStream.of(row).forEach(i-> System.out.print(""+i+", "));
			System.out.println("");
		}
		
		System.out.println("Is Sum Possible ?  "+(result[elements.length-1][sum]>0));
	}
	
	public static int[][] buildMatrix(int[] elements , int sum){
		
		int[][]matrix = new int[elements.length][sum+1];
		
		for(int row = 0 ; row < elements.length ; row ++) {
			for(int col = 0 ; col < sum+1 ; col ++) {
				/* For first row only*/
				if(row == 0 && col != 0 ) {
					matrix[row][col] = elements[row] == col ? 1 : 0;  
				}
				/*For all other rows and columns*/
				else {
					if(col == 0) {
						matrix[row][col] = 1;
					}
					else if(matrix[row-1][col]>0) {
						matrix[row][col] = 1; 
					}
					else {
						if(col<elements[row]) {
							matrix[row][col] =0;
						}
						else {
							int index =  col - elements[row];
							matrix[row][col] = matrix[row -1][index] > 0 ? 1:0;
						}
					}
				}
			}
		}
		return matrix;
	}
	
	/*
	 * public static int[] getSolution(int[][] matrix) { int row = matrix.length;
	 * int col = matrix[0].length;
	 * 
	 * }
	 */
	
}
