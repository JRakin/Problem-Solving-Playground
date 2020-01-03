import java.util.Scanner;


/**
 * @author Rakin
 *
 * May 15, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(maximumXor(n,m));

	}
	static int maximumXor(int n, int m) {
		
		int max = 0;
		
		for(int i = n; i<=m; i++) {
			for(int k = n; k<=m; k++) {
				int result = i^k;
				
				if(result > max) {
					max = result;
				}
			}
		}
		
		return max;
	}

}
