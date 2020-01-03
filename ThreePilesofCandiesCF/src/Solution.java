import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 28, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		while(t-- > 0) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			
			System.out.println((a+b+c)/2);
		}

	}

}
