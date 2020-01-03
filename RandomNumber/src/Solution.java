import java.util.Scanner;

/**
 * @author Rakin
 *11:17:27 AM
 * Apr 9, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int temp = (int) (Math.random()*101);
		int n = scan.nextInt();
		
		while(n-->0) {
			int number = scan.nextInt();
			
			if(temp == number) {
				System.out.println("Successful " +temp+ "  "+number);
				break;
			}
			
		}

	}

}
