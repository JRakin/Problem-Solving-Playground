import java.util.Scanner;

/**
 * @author Rakin
 *11:42:01 AM
 * Apr 7, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int [][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			
			for(int k=0; k<n; k++) {
				
				arr[i][k] = scan.nextInt();
			}
		}
		
		System.out.println(difference(arr));
		
	}
	static int difference(int arr[][]) {
		
		int right = 0;
		int left = 0;

		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr.length; k++) {
				
				if(i == k) {
					left += arr[i][k];
				}
				if(i + k == arr.length-1) {
					right += arr[i][k];
				}
			}
		}
		
		int result = left - right;
		return Math.abs(result);
	}

}
