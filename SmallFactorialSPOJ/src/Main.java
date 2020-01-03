import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 14, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			BigInteger b = BigInteger.valueOf(n);
			System.out.println(factorial(b));
		}

	}
	static BigInteger factorial(BigInteger bigInteger) {
		BigInteger b1 = bigInteger;
		
		if(b1.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}
		else {
			return b1.multiply(factorial(b1.subtract(BigInteger.ONE)));
		}
	}

}
