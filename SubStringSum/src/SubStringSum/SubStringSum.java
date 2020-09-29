package SubStringSum;

public class SubStringSum {

	/**
	 * For a given string sum all subsets and find the sum of all subsets.
	 * 
	 * Approach : Sliding window .
	 * @param args
	 */
	
	public static void main(String[] args) {
		String number = "972698438521";
		System.out.println("Sum of substring ::"+getSum(number));
	}
	
	public static int getSum(String number) {
		
		int window = 1;
		Long sum =0l;
		while(window <= number.length()) {
			//int division = number.length()/window;
			int windowStart = 0;
			while(window+windowStart<=number.length()) {
				 String s = number.substring(windowStart,window+windowStart);
				 Long num = Long.parseLong(s);
				 sum = sum + num;
				 windowStart++;
				 System.out.println(s);
			}
			window++;
		}
		sum = sum%1000000007;
		return (sum.intValue());
	}
	
}
