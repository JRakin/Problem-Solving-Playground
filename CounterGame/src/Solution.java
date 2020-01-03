import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 16, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			long n = scan.nextLong();
			System.out.println(counterGame(n));
		}

	}
	static String counterGame(long n) {
		
		if(isPowerOfTwo(n)) {
			
		}
		
	}
	static boolean isPowerOfTwo(long n) {
		
		if(n ==0 ) {
			return false;
		}
		
		while(n != 1) {
			
			if(n%2 != 0) {
				return false;
			}
			else {
				n = n/2;
			}
		}
		
		return true;
	}

}
