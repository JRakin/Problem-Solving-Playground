import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 9, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			
			int[] arr = new int[n];
			
			for(int k = 0; k < n; k++) {
				arr[k] = scan.nextInt();
			}
			
			System.out.println(inverse(arr));
		}

	}
	static String inverse(int[] arr) {
		
		int localinverse = 0;
		int inverse = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i-1] > arr[i]) {
				localinverse++;
			}
			
			for(int j = i; j < arr.length; j++) {
				if(arr[i-1] > arr[j]) {
					inverse++;
				}
			}
		}
		if(inverse == localinverse) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
