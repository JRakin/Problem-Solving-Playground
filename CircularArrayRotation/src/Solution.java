import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jun 6, 2018
 * reversing algorithm
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int r = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i < m; i++) {
			int p = scan.nextInt();
			System.out.println(arr[(n+p-r)%n]);
		}
		

	}
	/*static void rotation(int[] arr, int r) {
		reverse(arr,0,arr.length-1);
		reverse(arr,0,r-1);
		reverse(arr,r,arr.length-1);
	}
	static void reverse(int[] arr, int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}*/

}
