import java.util.Scanner;
/**
 * @author Rakin
 *
 * Dec 28, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			int temp = n/k;
			int mod = n%k;
			
			int ans = temp * k;
			
			System.out.println(ans+(Math.min(k/2, mod)));
		}

	}

}
