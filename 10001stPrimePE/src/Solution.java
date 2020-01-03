import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 21, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			System.out.println(nthPrime(n));
		}

	}
	static int nthPrime(int n) {
		
		int prime;
		int count;
		
		for(prime = 2,count = 0; count < n && prime < 104730; ++prime) {
			if(isPrime(prime)) {
				count++;
			}
		}
		return prime - 1;
	}
	static boolean isPrime(int n) {
		
		for(int i = 2; i*i <= n; i++) {
			
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
