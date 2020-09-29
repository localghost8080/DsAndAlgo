import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShootingBoogeys {

	public static void main(String[] args) {
		List<Integer> distance = List.of(4,3,1);
		List<Integer> speed = List.of(1,1,1);  
				//List.of(1,2,1);
				//List.of(5,2,1);
		
		System.out.println("Get Maximum Seconds for defence ::"+getMaximumSeconds(distance,speed));
	}
	
	/**
	 * Approach - For every turn calculate the bogey to eliminate based on its approach vector . 
	 * @param dist
	 * @param spd
	 * @return
	 */
	
	public static int getMaximumSeconds(List<Integer> dist, List<Integer> spd) {
		
		int totalBogeys = dist.size();
		
		if(dist==null || spd == null || dist.size() != spd.size())
			throw new IllegalArgumentException("invalid input.");

		dist = new ArrayList<>(dist); // defensive cloning
		spd = new ArrayList<>(spd); // defensive cloning
	
		int count=0;
		List<Integer> relativeDist = null; 
		for(int i=0;i<totalBogeys;i++) {
			// Calculate the distance the the bogey will be from the base at the start of next turn.
			relativeDist = new ArrayList<Integer>();
			for(int j=0;j<dist.size();j++) {
				relativeDist.add(dist.get(j)-spd.get(j));
			}
			
			int smallestNonNegIndex=0;
			int smallestNonNeg=Integer.MAX_VALUE;
			int candiates =0;
			// Find the smallest closest bogey and number of bogeys which can hit in the next turn
			
			for(int j=0;j<relativeDist.size();j++) {
				if(relativeDist.get(j)>=0 && relativeDist.get(j) < smallestNonNeg) {
					smallestNonNeg = relativeDist.get(j);
					smallestNonNegIndex=j;
				}
				if(relativeDist.get(j)<=0) {
					candiates++;
				}
			}
			if(relativeDist.size()>0 && smallestNonNeg>=0) {
				
				if(count == dist.size() || candiates>1) {
					break;
				}
				count++;
				relativeDist.remove(smallestNonNegIndex);
				spd.remove(smallestNonNegIndex);
				dist = relativeDist;
			}
		}
		
		return (count+1<totalBogeys)?count+1 : totalBogeys;
	}
	
	

}
