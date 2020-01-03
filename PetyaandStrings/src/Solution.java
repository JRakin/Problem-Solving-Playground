import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 25, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		
		if(str2.compareTo(str1) < 0) {
			System.out.println(1);
		}
		else if(str2.compareTo(str1) > 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(0);
		}

	}

}
