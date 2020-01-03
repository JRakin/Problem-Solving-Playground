import java.util.Scanner;


/**
 * @author Rakin
 *
 * May 20, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args ) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int num = scan.nextInt();
		
		int result = linearSearch(arr,num);
		
		if(result == -1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at position: " + result);
		}
	}
	static int linearSearch(int[] arr,int num) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == num) {
				return i+1;
			}
		}
		
		return -1;
	}

}
