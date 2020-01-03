import java.util.Scanner;

/**
 * @author Rakin
 *6:19:25 PM
 * Apr 12, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int x = scan.nextInt();
		
		if(binarySearch(arr, x) == -1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Position: "+binarySearch(arr, x));
		}
	}
	static int binarySearch(int [] arr, int x) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			
			int mid = (left + right)/2;
			
			if(arr[mid] == x) {
				return mid + 1;
			}
			if(arr[mid] < x) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return -1;
	}

}
