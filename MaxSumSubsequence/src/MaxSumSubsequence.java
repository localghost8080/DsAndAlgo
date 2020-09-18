/**
 * Write a program to calculate the max contiguous sum of array elements , divide and conquer approach
 * @author samrat
 *
 */
public class MaxSumSubsequence {
	
	public static int[] input = {-1,11,-3,7,-5,-2,3};
	
	public static void main(String[] args) {
		System.out.println("Max subsequence of given array :: "+maxSubsequenceSum(input));
	}
	
	static int maxSubsequenceRec(int[] A , int left , int right) {
		if (left==right ) {
			return input[left]>0?input[left]:0;
		}
		int maxLeftBorderSum =0;
		int maxRightBorderSum =0;
		int leftBorderSum=0;
		int rightBorderSum=0;
		int mid = left +(right-left)/2;
		int maxLeftSum = maxSubsequenceRec(input , left , mid);
		int maxRightSum = maxSubsequenceRec(input , mid+1 , right);
		for (int i = mid ;i>=left ; i--) {
			leftBorderSum+=input[i];
			maxLeftBorderSum = (leftBorderSum>maxLeftBorderSum)?leftBorderSum:maxLeftBorderSum;
		}
		
		for (int j = mid+1 ;j<=right ; j++) {
			rightBorderSum+=input[j];
			maxRightBorderSum = (rightBorderSum>maxRightBorderSum)?rightBorderSum:maxRightBorderSum;
		}
		
		return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum+maxRightBorderSum);
		
	}
	
	static int maxSubsequenceSum(int[] input) {
		return input!=null && input.length>0 ? maxSubsequenceRec(input,0,input.length-1):0;
	}

}
