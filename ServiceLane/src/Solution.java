import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 20, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int k = 0; k < m; k++) {
			int l = scan.nextInt();
			int r = scan.nextInt();
			
			System.out.println(minimumLane(arr,l,r));
		}

	}
	static int minimumLane(int[] arr, int l, int r) {
		
		int min = 4;
		
		for(int i = l; i <= r; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}

}
