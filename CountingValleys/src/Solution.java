import java.util.Scanner;

/**
 * @author Rakin
 *10:02:18 PM
 * Apr 13, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		String s = scan.next();
		
		System.out.println(countingValleys(n, s));

	}
	static int countingValleys(int n, String s) {
		int upHill = 0;
		int downHill = 0;
		
		int valley = 0;
		
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'U') {
				upHill++;
			}
			else {
				downHill++;
			}
			
			if(upHill == downHill && s.charAt(i)=='U') {
				valley++;
			}
		}
		
		return valley;
	}

}
