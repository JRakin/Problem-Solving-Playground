import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 27, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		if(n % 2 == 0 && n > 2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
