import java.util.Scanner;


/**
 * @author Rakin
 *
 * Jul 31, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long n = scan.nextLong();
		System.out.println(checkNumber(n));

	}
	static String checkNumber(long n) {
		
		long digit = 0;
		int count = 0;
		
		while(n > 0) {
			digit = n % 10;

			if(digit == 7 || digit == 4) {
				count++;
			}
			n = n / 10;
		}
		
		if(count == 4 || count == 7) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
