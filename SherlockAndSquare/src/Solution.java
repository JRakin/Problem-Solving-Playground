import java.util.Scanner;

/**
 * @author Rakin
 *
 * Sep 22, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(squares(a,b));
		}

	}
	static int squares(int x, int y) {
		
		return (int)(Math.floor(Math.sqrt(y)) - Math.ceil(Math.sqrt(x)) + 1);
	}

}
