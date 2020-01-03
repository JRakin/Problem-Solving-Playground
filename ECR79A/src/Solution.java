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
			int r = scan.nextInt();
			int g = scan.nextInt();
			int b = scan.nextInt();
			
			if(r > b) {
				int temp = r;
				r = b;
				b = temp;
			}
			if(r > g) {
				int temp = r;
				r = g;
				g = temp;
			}
			if(b > g) {
				int temp = b;
				b = g;
				g = temp;
			}
			
			if(r+b >= g - 1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
