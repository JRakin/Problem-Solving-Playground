import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2019
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String str = scan.nextLine();
		System.out.println(findDistinctLetter(str));
	}
	static int findDistinctLetter(String str) {
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 97 && ch <= 122) {
				set.add(ch);
			}
		}
		
		return set.size();
	}

}
