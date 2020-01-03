import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 24, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			String s = scan.next();
			
			System.out.println(largestProduct(s,n,k));
			
		}

	}
	static int largestProduct(String s, int n, int k) {
		
		int res = 0;
		int max = 0;
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < n - k; i++) {
			
			for(int j = i; j < n-k; j++) {
				int num = ch[j] - '0';
				res *= num;
			}
			
			if(res > max) {
				max = res;
			}
		}
		
		return max;
	}

}
