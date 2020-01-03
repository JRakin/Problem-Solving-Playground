import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 15, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			String word = scan.next();
			System.out.println(lapindromes(word));
		}

	}
	static String lapindromes(String word) {
		
		boolean isLap = true;
		int mid = word.length() / 2;
		
		String s1 = word.substring(0, mid);
		String s2;
		if(word.length() % 2 != 0) {
			s2 = word.substring(mid+1);
		}
		else {
			s2 = word.substring(mid);
		}
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i = 0; i < mid; i++) {
			if(ch1[i] != ch2[i]) {
				isLap = false;
			}
		}
		
		if(isLap) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
