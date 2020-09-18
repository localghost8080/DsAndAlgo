
public class ArrayRotation {

	int arr[] = {1,2,3,4,5};
	
	public static void main(String[] args) {
		
		ArrayRotation ar = new ArrayRotation();
		int[] returnArr =ar.rotate(ar.arr, 4);
		String str = "";
		for(int i: returnArr) {
			str = str +i+" ";
		}
		System.out.println(str);
	}
	
	public int[] rotate (int[] A , int K) {
		if(A.length==0)
			return A;
		int[] returnArr = new int[A.length];
		int size = A.length;
		int trueSteps = size<K?K%size:K;
		if (trueSteps == 0) 
				return A;

		int pointer = size-trueSteps;
		
		int i = pointer ;
		int returnIndex = 0;
		do {
			returnArr[returnIndex] = A[i];
			i=i<size-1?++i:0;
			returnIndex++;
		}while(i!=pointer);
		return returnArr;
	}

}
