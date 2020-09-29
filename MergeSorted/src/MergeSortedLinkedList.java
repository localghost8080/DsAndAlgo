
public class MergeSortedLinkedList {

	public static ListNode toList(int[] input) {
		ListNode node = new ListNode();
		ListNode header = node;
		for (int i =0 ; i<input.length;i++) {
			node.data=input[i];
			if(i<input.length-1) {
				node.next= new ListNode();
				node = node.next;
			}
		}
		return header;
	}
	
	public static void main(String[] args) {
		int[] list1 = {1,3,5,7,9};
		int[] list2 = {2,4,6,8,10,11,12,13};
		
		ListNode a = toList(list1);
		ListNode b = toList(list2);
		ListNode merged = mergeSorted(a, b);
		ListNode ptr= merged; 
		while(ptr != null) {
			System.out.print(ptr.data + ",");
			ptr = ptr.next;
		}
	}
	
	public static ListNode mergeSorted(ListNode a, ListNode b) {
		ListNode result = null;
		if (a == null)
			return b;
			
		if (b == null)
			return a;
		
		if(a.data <= b.data) {
			result = a;
			result.next = mergeSorted(a.next, b);
		}else {
			result = b;
			result.next = mergeSorted(b.next, a);
		}
		
		return result;
	}
	
}
