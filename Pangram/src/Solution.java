import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Rakin
 *12:22:47 AM
 * 
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		String s = scan.next();
		
		System.out.println(pangram(s));

	}
	static String pangram(String s) {
		
		char[] ch = s.toLowerCase().toCharArray();
		
		Set<Character> set = new TreeSet<Character>();
		
		for(char c : ch) {
			if(c != ' ' && ((c >= 'a') && (c <= 'z'))) {
				set.add(c);
			}
		}

		if(set.size()==26) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
