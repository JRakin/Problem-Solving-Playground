import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *10:24:23 PM
 * Apr 12, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int l = 0;
		int r = arr.length - 1;
		
		int m = (l + r) / 2;
		
		System.out.println(arr[m]);

	}

}
