import java.util.HashSet;
import java.util.Scanner;



/**
 * @author Rakin
 *
 * Jul 18, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			int[] arr = new int[n];
			
			for(int k = 0; k < n; k++) {
				arr[i] = scan.nextInt();
			}
			
			System.out.println(findDuplicate(arr));
		}

	}
	static int findDuplicate(int[] arr) {
		
	}

}
