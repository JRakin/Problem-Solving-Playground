import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rakin
 *
 * May 26, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] count = new int[101];
		
		for(int i = 0; i < 101; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 1; i <= n; i++) {
			if(count[i] == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
