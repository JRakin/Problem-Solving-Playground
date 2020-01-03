import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 16, 2019
 */
public class Main {

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		BigInteger b1, b2;
		
		while(t-- > 0) {
			b1 = scan.nextBigInteger();
			b2 = scan.nextBigInteger();
			
			System.out.println(b1.multiply(b2));
		}

	}
	
}
