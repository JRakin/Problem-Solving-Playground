import java.util.Scanner;


/**
 * @author Rakin
 *5:16:31 PM
 * Apr 5, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			String str = scan.next();
			System.out.println(funnyString(str));
		}

	}
	static String funnyString(String str) {
		String str1 = new StringBuffer(str).reverse().toString();
		int count = 0;
		
		for(int i=1; i<str.length(); i++) {
			if(Math.abs(str.charAt(i)-str.charAt(i-1)) == Math.abs(str1.charAt(i)-str1.charAt(i-1))) {
				count++;
			}
		}
		if(count == (str.length()-1)) {
			return "FUNNY";
		}
		else {
			return "NOT FUNNY";
		}
	}

}
