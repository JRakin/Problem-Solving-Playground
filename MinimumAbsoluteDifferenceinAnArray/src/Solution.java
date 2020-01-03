import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 19, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(minimum(arr));

	}
	
	static long minimum(int[] arr) {
		
		long min = Integer.MAX_VALUE;
		long res = 0;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			
			res = Math.abs(arr[i] - arr[i-1]);
				
			if(res < min) {
				min = res;
			}
			
		}
		
		return min;
	}

}
