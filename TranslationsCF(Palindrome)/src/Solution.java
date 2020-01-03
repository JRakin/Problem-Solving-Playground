import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 28, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		System.out.println(translation(s1,s2));

	}
	
	static String translation(String s1, String s2) {
		
		boolean isPalindrome = true;
		
		if(s1.length() != s2.length()) {
			return "NO";
		}
		
		for(int i = 0, j = s1.length()-1; i < s1.length() && j >=0; i++) {
			
			if(s1.charAt(i) != s2.charAt(j)) {
				isPalindrome = false;
				break;
			}
			j--;
			
		}
		
		if(isPalindrome) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
