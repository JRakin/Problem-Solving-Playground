import java.util.Scanner;

/**
 * @author Rakin
 *10:53:18 PM
 * Apr 13, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		while(t-- > 0) {
			
			int m = scan.nextInt();
			
			int n = scan.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			
			System.out.println(iceCream(m,arr));
		}
		
	}
	static String iceCream(int m, int arr[]) {
		
		int index1 = 0;
		int index2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int k  = 1; k < arr.length; k++) {
				
				int sum = 0;
				
				if(i != k) {
					sum = arr[i] + arr[k];
				}
				if(sum == m) {
					if(i < k) {
						index1 = i+1;
						index2 = k+1;
					}
					else {
						index1 = k+1;
						index2 = i+1;
					}
					
				}
			}
		}
		
		return index1+" "+index2;
	}

}
