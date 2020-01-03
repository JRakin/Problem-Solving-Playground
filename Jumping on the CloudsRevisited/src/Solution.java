import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 24, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(jumpingClouds(arr,k));

	}
	static int jumpingClouds(int[] arr, int k) {
		int en = 100;
		
		for(int i=0; i < arr.length; i+=k) {
			
			if(arr[(i+k)%arr.length] == 0) {
				en = en - 1;
			}
			else {
				en = en - 3;
			}
		}
		
		return en;
	}

}
