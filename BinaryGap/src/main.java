import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		main m = new main();
		System.out.println(m.solution(32));

	}
	
	public int solution(int N) {
        String binaryRepresentation = Integer.toBinaryString(N);
        System.out.println(binaryRepresentation);
        Pattern p = Pattern.compile("(0)+");
        Matcher m = p.matcher(binaryRepresentation);
        int maxLen = 0;
            while (m.find()){
                int groupLen = m.group().length();
                if(groupLen>maxLen){
                    maxLen = groupLen;
                }
            }
        return maxLen;
    }

}
