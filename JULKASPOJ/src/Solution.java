import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Dec 29, 2019
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = 10;
		while(t-- > 0) {
			BigInteger b1 = scan.nextBigInteger();
			BigInteger b2 = scan.nextBigInteger();
			
			BigInteger b4 = b1.subtract(b2);
			
			BigInteger b3 = BigInteger.valueOf(2);
			BigInteger half = b4.divide(b3);
			
			BigInteger k = half.add(b2);
			
			System.out.println(k);
			System.out.println(half);
		}

	}

}
