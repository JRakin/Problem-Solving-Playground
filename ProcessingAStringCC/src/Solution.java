import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 8, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			String str = scan.next();
			System.out.println(countingString(str));
		}

	}
	static int countingString(String str) {
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				int n = str.charAt(i) - '0';
				sum += n;
			}
		}
		
		return sum;
	}

}
