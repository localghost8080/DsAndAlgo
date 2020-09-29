
public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] list1 = {1,3,5,7,9,11,13};
		int[] list2 = {2,4,6,8,10,15,17,21,25};
		
		int[] mergedList = mergeSortedArrays(list1 ,list2);
		for(int i:mergedList) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] mergeSortedArrays(int[] list1 , int[] list2) {
		
		int[] mergedList = new int[list1.length+list2.length];
		int i=0;
		int j=0;
		int k=0;
		while( i < list1.length && j< list2.length) {
			if(list1[i]<list2[j] ) {
				mergedList[k++]=list1[i++];
			}else {
				mergedList[k++]=list2[j++];
			}
		}
		for(;j<list2.length;j++) {
			mergedList[k++]=list2[j];
		}
		for(;i<list1.length;i++) {
			mergedList[k++]=list1[i];
		}
		return mergedList;
	}
	
}
