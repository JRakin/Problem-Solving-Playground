import java.util.Scanner;

/**
 * @author Rakin
 *12:24:05 AM
 * Apr 14, 2018
 */
public class Solution {

	private static final Scanner scan =  new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int d = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(chocolate(arr, d, m));

	}
	static int chocolate(int[] arr, int d, int m) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			
			for(int k = 0; k < m; k++) {
				if(i +k < arr.length) {
					sum +=arr[i+k];
				}
			}
			if(sum == d) {
				count++;
			}
			
		}
		return count;
	}

}
