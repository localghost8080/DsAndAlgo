
// O(n) space O(1)
public class ArrayRotation2 {

	static int arr[] = {0,1,2,3,4,5,6};
	
	public static void main(String[] args) {
		
		int result[] = rotate(arr,5);
		for(int i:result) {
			System.out.print(i+" ");
		}
		

		
	}
	public static int[] rotate(int[] input , int k) {
		
		k = input!=null && k>input.length?(k%input.length):k;
		if(input == null || input.length ==0 ||  k<=0 ) {
			return input ;
		}
		reverse(input,0,input.length-1);
		reverse(input, 0, k-1);
		reverse(input, k, input.length-1);
		return input;
	}
	
	static int[] reverse(int[] input , int from , int to) {
		int temp ;
		while(from<=((to+from)/2) && to>from) {
			temp = input[to];
			input[to]=input[from];
			input[from]=temp;
			from++;
			to--;
		}
		return input;
		
	}
	
	
}
