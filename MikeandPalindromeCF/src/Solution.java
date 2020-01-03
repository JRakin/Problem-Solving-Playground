import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 30, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String text = scan.next();
		System.out.println(isPalindrome(text) ? "YES":"NO");

	}
	static boolean isPalindrome(String text) {
		
		int count = 0;
		
		for(int i = 0; i < text.length()/2; i++) {
			if(text.charAt(i) != text.charAt(text.length()-i-1)) {
				count++;
				
			}
		}
		if(text.length() % 2 != 0 && count == 0) {
			return (count == 0);
		}else {
			return (count == 1);
		}
	}

}
