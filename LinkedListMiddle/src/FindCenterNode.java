
public class FindCenterNode {


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

	/**
	 * Find center node of a Linked list in one pass
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list2 = {1,2,3,4,5,6,7};//,6,8};//,10,11,12,13,14};

		ListNode b = toList(list2);
		ListNode centerNode =  findCenter(b); 
		System.out.print(centerNode.data);
	}
	
   public static ListNode findCenter(ListNode ll) {
	   
	   ListNode slowptr=ll;
	   ListNode fastptr=ll;
	   
	   
	   while( fastptr != null && fastptr.next!=null) {
			fastptr = (fastptr != null	&& fastptr.next != null)? fastptr.next.next:null;
		   if(fastptr!=null) {
			   slowptr = slowptr.next;
		   }
	   }
	   return slowptr;
	   
	   
   }
	
}
