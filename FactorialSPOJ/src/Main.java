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
			System.out.println(findTrailingZero(n));
		}

	}
	static int findTrailingZero(int n) {
		
		int count = 0;
		
		for(int i = 5; n/i >= 1; i*=5) {
			count += n / i;
		}
		
		return count;
	}

}
