import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 21, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int min = 0;
		int p = 0;
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			p += b - a;
			
			if(p > min) {
				min = p;
			}
			
		}
		System.out.println(min);

	}

}
