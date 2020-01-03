import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 18, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			String word = scan.next();
			
			System.out.println(findLength(word));
		}

	}
	static String findLength(String word) {
		
		int length = 0;
		
		for(int i = 1; i < word.length(); i++) {
			
			length += (word.charAt(i) - word.charAt(i-1) + 26) % 26;
		}
		
		length += word.length();
		
		if(length < word.length() * 11) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
