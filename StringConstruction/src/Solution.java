import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Rakin
 *12:11:33 AM
 * Apr 7, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			String s = scan.next();
			System.out.println(constructingString(s));
		}

	}
	static int constructingString(String s) {
		Set<Character> str = new HashSet<Character>();
		int count =0;
		
		for(int i = 0; i < s.length(); i++) {
			if(!str.contains(s.charAt(i))) {
				count++;
				str.add(s.charAt(i));
			}
			else {
				str.add(s.charAt(i));
			}
		}
		
		return count;
	}

}
