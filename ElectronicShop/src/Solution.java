import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 18, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int b = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		int[] brr = new int[m];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			brr[i] = scan.nextInt();
		}
		
		System.out.println(getMoneySpent(arr,brr,b));

	}
	static int getMoneySpent(int[] key, int[] dr, int b) {
		
		int result = -1;
		
		for(int i = 0; i < key.length; i++) {
			
			for(int k = 0; k < dr.length; k++) {
				
				int total = key[i] + dr[k];
				
				if(total <= b && total > result) {
					result = total;
				}
			}
		}
		
		return result;
	}

}
