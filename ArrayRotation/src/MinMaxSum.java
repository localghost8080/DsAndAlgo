
public class MinMaxSum {

	
	/*
	 * Given five positive integers, find the minimum and maximum values
	 * that can be calculated by summing exactly four of the five integers.
	 * Then print the respective minimum and maximum values as a single 
	 * line of two space-separated long integers.
	 */
	
	// Min Max Sum 
	
	static void miniMaxSum(int[] arr) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i=0 ; i < arr.length ; i++){
            int[] rotated = ArrayRotation2.rotate(arr,1);
            long sum = (long)rotated[0]+(long)rotated[1]+(long)rotated[2]+(long)rotated[3];
            max = (sum>max)?sum : max;
            min = (sum<min)?sum : min;
        }
        System.out.println(min+" "+max);

    }
	
	public static void main(String[] args) {
		int[] input= {396285104, 573261094, 759641832, 819230764, 364801279};
		// Expected output = 2093989309 2548418794
		miniMaxSum(input);
		
		
	}
}
