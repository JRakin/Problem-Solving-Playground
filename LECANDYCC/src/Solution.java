import java.io.IOException;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Dec 20, 2019
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int c = scan.nextInt();
			
			int[] candyArr = new int[n];
			
			for(int i = 0; i < n; i++) {
				candyArr[i] = scan.nextInt();
			}
			
			if(isHappy(n, c, candyArr) == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
	static boolean isHappy(int n, int c, int[] candyArr) {
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += candyArr[i];
		}
		
		if(sum > c) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
