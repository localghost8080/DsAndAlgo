/**
 * WAP to find the middle element of an unsorted array , in O(n)
 * middle element : if the array were to be sorted , this element would be in the middle of the sorted list.
 * @author samrat
 *
 */
public class ArrayCenterFinder {

	public static void main(String[] args) {
		int[] input1 = {-1,3,17,12,5,-2,20,200};
		System.out.println("The middle of the tree is :" +getMiddle(input1));
		
	}
	
	public static int getMiddle(int[] input) {
		MaxHeap maxHeap = new MaxHeap(input.length*2);
		for(int i: input) {
			maxHeap.insert(i);
		}
		maxHeap.print();
		int i =0;
		int root =0;
		while(i<=input.length/2) {
			root=maxHeap.extractMax();
			i++;
		}
		return root;
		
	}
}


