import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int x = 0;
		
		while(n-- > 0) {
			String str = scan.next();
			
			if(str.equals("X++")) {
				x++;
			}
			else if(str.equals("++X")) {
				++x;
			}
			else if(str.equals("X--")) {
				x--;
			}
			else if(str.equals("--X")) {
				--x;
			}
		}
		System.out.println(x);

	}

}
