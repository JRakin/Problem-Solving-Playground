import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jun 6, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			int m = scan.nextInt();
			int s = scan.nextInt();
			
			System.out.println(saveThePrisoner(n,m,s));
			
		}

	}
	static long saveThePrisoner(int n, int m, int s) {
		
		
		
		if((m + s -1) % n == 0) {
			return n;
		}
		else {
			return (m + s -1) % n;
		}
	}

}
