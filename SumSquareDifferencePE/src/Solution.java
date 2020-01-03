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
			long n = scan.nextInt();
			System.out.println(squareSum(n));
		}

	}
	static long squareSum(long n) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= n; i++) {
			sum1 += i;
			
			sum2 += Math.pow(i, 2);
		}
		
		return (long)Math.pow(sum1, 2) - sum2;
	}

}
