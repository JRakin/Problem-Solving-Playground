import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jun 4, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			System.out.println(utopianTree(n));
		}

	}
	static int utopianTree(int n) {
		
		int tree = 1;
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0) {
				tree += 1;
			}
			else {
				tree *= 2;
			}
		}
		
		return tree;
	}

}
