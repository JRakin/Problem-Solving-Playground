import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 18, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			int[] arr = new int[n];
			
			for(int m = 0; m < n; m++) {
				arr[m] = scan.nextInt();
			}
			
			System.out.println(angryProf(arr,k));
		}

	}
	static String angryProf(int[] arr, int k) {
		
		Arrays.sort(arr);
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] <= 0) {
				count++;
			}
		}
		
		if(count < k) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
