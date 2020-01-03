import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 11, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(spaceStation(arr,n,m));

	}
	static int spaceStation(int[] arr, int n, int m) {
		if(n == m) {
			return 0;
		}
		
		Arrays.sort(arr);
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			int d = (arr[i] - arr[i-1]) / 2;
			
			if( d > max ) {
				max = d;
			}
		}
		
		int gap = (m-1) - arr[arr.length - 1];
		
		return (gap > max) ? gap:max;
		
	}

}
