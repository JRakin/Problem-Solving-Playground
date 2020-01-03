import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 20, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int num = scan.nextInt();
		
		int result = binarySearch(arr, 0, n-1, num);
		
		if(result == -1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at position: "+result);
		}

	}
	static int binarySearch(int[] arr, int l, int r, int num) {
		
		if(r >= l) {
			int mid = (l + r) / 2;
			
			if(arr[mid] == num) {
				return mid+1;
			}
			if(arr[mid] > num) {
				return binarySearch(arr, mid+1, r, num);
			}
			else {
				return binarySearch(arr, l, mid-1, num);
			}
		}
		
		return -1;
	}

}
