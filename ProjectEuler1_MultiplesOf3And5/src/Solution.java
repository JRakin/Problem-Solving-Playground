import java.util.Scanner;



/**
 * @author Rakin
 *
 * Jun 2, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			
			long sum = naturalNumber(n-1, 3) + naturalNumber(n-1, 5) - naturalNumber(n-1, 3*5);
			System.out.println(sum);
		}

	}
	
	static long naturalNumber(int n, int a) {
		
		long sum =(long) n/a;
		
		return (long) a*(sum*(sum+1)) / 2;
	}

}
