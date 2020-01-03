import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *10:39:10 PM
 * Apr 13, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(pickingNumbers(arr));

	}
	static int pickingNumbers(int[] arr) {
		
		Arrays.sort(arr);
		int [] count = new int[100];
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int k = 1; k < count.length; k++) {
			if(count[k-1] + count[k] > max) {
				max = count[k-1] + count[k];
			}
		}
		
		return max;

	}

}
