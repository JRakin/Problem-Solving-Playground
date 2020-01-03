import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 14, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int d = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		System.out.println(triplets(arr,d));

	}
	static int triplets(int[] arr, int d) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int k = 1; k < arr.length; k++) {
				
				if(arr[k] - arr[i] == d) {
					
					for(int j = k+1; j < arr.length; j++) {
						if(arr[j] - arr[k] == d) {
							count++;
						}
					}
				}
			}
		}
		
		return count;
	}

}
