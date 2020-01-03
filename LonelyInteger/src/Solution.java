import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 13, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(lonelyInteger(arr));

	}
	static int lonelyInteger(int[] arr) {
		int unique = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			unique ^= arr[i];
		}
		
		return unique;
	}

}
