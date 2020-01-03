import java.math.BigInteger;
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
		
		BigInteger sum = new BigInteger("0");
		
		for(int i = 0; i < t; i++) {
			
			BigInteger n = new BigInteger(scan.next());
			sum = sum.add(n);
		}
		System.out.println(sum.toString().substring(0, 10));

	}

}
