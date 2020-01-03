import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 31, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(minimumCoin(arr));

	}
	static int minimumCoin(int[] arr) {
		
		int total = 0;
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		int half = (int)total / 2;
		
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >=0; i--) {
			sum += arr[i];
			count++;
			
			if(sum > half) {
				break;
			}
		}
		
		return count;
	}

}
