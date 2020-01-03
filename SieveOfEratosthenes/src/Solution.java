import java.util.Scanner;

/**
 * @author Rakin
 *
 * Aug 6, 2018
 */
class Solution {
	
	static boolean[] isPrime = new boolean[10000001];

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long n = scan.nextLong();
		sieve(n);
		
		

	}
	static void sieve(long n) {
		
		boolean[] isPrime = new boolean[(int) (n+1)];
	}

}
