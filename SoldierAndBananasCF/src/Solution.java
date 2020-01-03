import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 21, 2019
 */
public class Solution {

	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int k = scan.nextInt();
		int n = scan.nextInt();
		int w = scan.nextInt();
		
		int cost = 0;
		
		for(int i = 1; i <= w; i++) {
			cost += i*k;
		}
		
		if(cost > n) {
			System.out.println(cost - n);
		}
		else {
			System.out.println(0);
		}

	}

}
