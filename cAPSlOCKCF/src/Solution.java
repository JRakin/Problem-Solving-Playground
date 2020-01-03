import java.util.Scanner;


/**
 * @author Rakin
 *
 * Jul 27, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String word = scan.next();
		StringBuilder sb = new StringBuilder(word);
		System.out.println(newString(sb));

	}
	static String newString(StringBuilder word) {
		
		int count = 0;
		
		for(int i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) >= 65 && word.charAt(i) <= 90) {
				count++;
			}
		}
		
		boolean isLower = false;
		
		if(word.charAt(0) >= 'a') {
			isLower = true;
		}
		boolean isCapital = true;
		 
		 for(int i = 1; i < word.length(); i++) {
			 if(!Character.isUpperCase(word.charAt(i))) {
				 isCapital = false;
				 break;
				 
			 }
		 }
		
		if(count == word.length()) {
			return word.toString().toLowerCase();
		}
		else if(isLower && isCapital) {
			return (word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()).toString();
		}
		else {
			return word.toString();
		}
	}

}
