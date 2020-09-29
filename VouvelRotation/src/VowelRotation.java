import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelRotation {

	/**
	 * In a given string rotate only rotate the vowels and nothing else
	 * ie: the first occurrence of vowel is swapped by the last occurrence of vowel
	 * @param args
	 */
	public static void main(String[] args) {
		//char[] input = "Bfagehijoeuukuk".toCharArray();
		char[] input = "JaeiouK".toCharArray();
		
		String reversed = new String(rotateVouvels(input));
		
		System.out.println(reversed);
	}
	
	public static char[] rotateVouvels(char[] input) {
		 Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
		 int i =0 ;
		 int j = input.length-1;
		 
		 while(i<j) {
			 for(;!vowels.contains(input[i]);i++);
			 for(;!vowels.contains(input[j]);j--);
			 swap(input,i,j);
			 i++;
			 j--;
			 
		 }
		 return input;
	}
	
	public static void swap(char[] inp , int i , int j) {
		if(i==j || inp[i] == inp[j])
			return;
		char temp = inp[j];
		inp[j]=inp[i];
		inp[i]=temp;
	}
	
}
