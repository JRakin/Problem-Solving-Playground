import java.util.Scanner;

/**
 * @author Rakin
 *11:14:20 PM
 * Apr 15, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			String s = scan.next();
			
			int mid = s.length()/2;
			
			String str1 = s.substring(0, mid);
			String str2 = s.substring(mid);
			
			System.out.println();
			anagramCount(str1, str2);
			
		}

	}
	static void anagramCount(String s1, String s2) {
		
		StringBuilder sb = new StringBuilder(s2);
		
		if(s1.length() != s2.length()) {
			System.out.println(-1);
		}
		else {
			for(int i = 0; i < s1.length(); i++) {
				
				if(s2.contains(s1.charAt(i)+"")) {
					sb.deleteCharAt(i);
				}
			}
		}
		
		System.out.println(sb.length());
		
		
	}
}
