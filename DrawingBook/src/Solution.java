import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 10, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int p = scan.nextInt();
		
		System.out.println(pageTurn(n,p));

	}
	static int pageTurn(int n, int p) {
		
		int total = n/2;
		int page = p/2;
		
		int l = total - page;
		
		if(page < l) {
			return page;
		}
		else {
			return l;
		}
	}

}
