import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jun 4, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s = scan.next();
		//scan.nextLine();
		long n = scan.nextLong();

		
		System.out.println(repeatedString(s,n));

	}
	static long repeatedString(String s, long n) {
		
		int count = 0;
		int count_last = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				count++;
			}
		}

		int rem = (int) (n % s.length());
		
		for(int i = 0; i < rem; i++) {
			if(s.charAt(i) == 'a') {
				count_last++;
			}
		}
		
		if(s.length() == count) {
			return n;
		}
		else {
			return ((count * (n-rem))/s.length()) + count_last;
		}

	}

}
