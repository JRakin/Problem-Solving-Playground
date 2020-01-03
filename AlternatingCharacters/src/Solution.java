import java.util.Scanner;

/**
 * @author Rakin
 *11:56:30 PM
 * Apr 6, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			String s = scan.next();
			System.out.println(alternating(s));
		}

	}
	static int alternating(String s) {
		char[] ch = s.toCharArray();
		int count = 0;
		
		for(int i=1; i<ch.length; i++) {
			if(ch[i] == ch[i-1]) {
				count++;
			}
		}
		
		return count;
	}

}
