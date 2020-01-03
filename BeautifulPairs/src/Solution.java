import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 30, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		int[] brr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			brr[i] = scan.nextInt();
		}
		System.out.println(beautifulPairs(arr,brr));

	}
	static int beautifulPairs(int[] arr, int[] brr) {
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == brr[i]) {
				count++;
			}
		}
		
		if(count < arr.length) {
			return count + 1;
		}
		else {
			return count - 1;
		}
	}

}
