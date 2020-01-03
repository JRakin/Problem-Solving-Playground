import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 29, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		rotate(arr,r);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	static void rotate(int[] arr, int r) {
		
		while(r-- > 0) {
			rotateByOne(arr);
		}
	}
	static void rotateByOne(int[] arr) {
		int i;
		int temp = arr[0];
		
		for(i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}

}
