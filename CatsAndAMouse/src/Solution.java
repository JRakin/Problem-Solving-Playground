import java.util.Scanner;

/**
 * @author Rakin
 *12:23:36 AM
 * Apr 13, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			
			System.out.println(catsAndMouse(x,y,z));
		}

	}
	static String catsAndMouse(int x, int y, int z) {
		
		int sum1 = Math.abs(x-z);
		int sum2 = Math.abs(y-z);
		
		int sum = sum1 -sum2;
		
		if(sum == 0) {
			return "Mouse C";
		}
		
		if(sum > 0) {
			return "Cat B";
		}
		else {
			return "Cat A";
		}
	}

}
