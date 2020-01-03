import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *10:35:10 PM
 * Apr 7, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int t = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		if( t < arr[n-1]) {
			System.out.println(arr[n-1] - t);
		}
		else {
			System.out.println("0");
		}
	}

}
