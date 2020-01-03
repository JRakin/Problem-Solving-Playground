import java.util.Scanner;

/**
 * @author Rakin
 * codechef
 * Jul 8, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			System.out.println(prettyNumber(n,m));
		}

	}
	static int prettyNumber(int n, int m) {
		
		int count = 0;
		
		for(int i = n; i <= m; i++) {
			
			if(i < 10) {
				if(i == 2 || i == 3 || i == 9) {
					count++;
				}
			}
			if(i > 10) {
				if(i % 10 == 2 || i % 10 == 3 || i % 10 == 9) {
					count++;
				}
			}
		}
		
		return count;
	}

}
