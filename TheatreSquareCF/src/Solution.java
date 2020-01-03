import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 26, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		
		System.out.println((long)(Math.ceil(n/(double)a)*Math.ceil(m/(double)a)));

	}

}
