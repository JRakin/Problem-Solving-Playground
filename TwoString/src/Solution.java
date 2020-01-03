import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * @author Rakin
 *
 * May 11, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			
			System.out.println(commonCharacters(s1,s2));
		}

	}
	static String commonCharacters(String s1, String s2) {
		
		Set<Character> letters = new HashSet<Character>();
		boolean isMatched = false;
		
		for(int i = 0; i < s1.length(); i++) {
			letters.add(s1.charAt(i));
		}
		
		for(int i = 0; i < s2.length(); i++) {
			if(letters.contains(s2.charAt(i))) {
				isMatched = true;
				break;
			}
		}
		
		if(isMatched) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
