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
			System.out.println(leastMultiple(n));
		}

	}
	static long leastMultiple(long n) {
		
		long ans = 1;
		
		for(int i = 1; i <=n; i++) {
			ans = (ans * i) / gcd(ans, i);
		}
		
		return ans;
	}
	static long gcd(long a, long b) {
		if(a % b == 0) {
			return b;
		}
		
		return gcd(b, a % b);
	}

}
