import java.util.Scanner;

/**
 * @author Rakin
 *11:18:42 PM
 * Apr 10, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			String str = scan.next();
			System.out.println(hackerrankString(str));
		}

	}
	static String hackerrankString(String str) {
		
		String str1 = "hackerrank";
		int count = 0;
		if(str.length() < str1.length()) {
			return "NO";
		}
		else {
			for(int i=0; i < str.length(); i++) {
				
				if(count < str1.length() && (str.charAt(i) == str1.charAt(count))) {
					count++;
				}
			}
		}
		
		if(count == 10) {
			return "YES";
		}
		else {
			return "NO";
		}
		
	}

}
