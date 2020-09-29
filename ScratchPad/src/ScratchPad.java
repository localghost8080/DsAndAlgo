import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ScratchPad {

//	public static void main(String[] args) {
//		String[] cities = {"Bangalore","Pune", "San Fransisco" , "New York City"};
//		Arrays.sort(cities , new MySort());
//		Arrays.stream(cities).forEach(System.out::println);
//		System.out.println(Arrays.binarySearch(cities, "New York City"));
//	}
//	
//	static class MySort implements Comparator<String>{
//
//		@Override
//		public int compare(String a, String b) {
//			return b.compareTo(a);
//		}
//	}
	
//	public static void main(String[] args) {
//		HashMap<String, String> myHashmap = new HashMap<String, String>();
//		System.out.println(myHashmap.size());
//		
//		myHashmap.put(null, null);
//		System.out.println(myHashmap.size());
//	}
//	
	
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b.compareTo(a));
				
		pq.add(1);
		pq.add(5);
		pq.add(5);
		pq.add(5);
		
		int count = 1;
		Integer max = Integer.MIN_VALUE;
		for(Integer val : pq) {
			if(val == max) {
				count++;
			}
			max = (val>=max)?val:max;
		}
		System.out.println(count);
		
	}
	
}
