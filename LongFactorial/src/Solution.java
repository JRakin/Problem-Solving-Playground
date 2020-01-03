import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 25, 2018
 */
public class Solution {

	private static final Scanner scan  = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		BigInteger fact = BigInteger.valueOf(1);
		
		for(int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(fact);

	}

}
