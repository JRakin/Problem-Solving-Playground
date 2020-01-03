import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 15, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(minimumDistance(arr));

	}
	static int minimumDistance(int[] arr) {
		
		int result = -1;
		int min = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					result = Math.abs(j-i);
					
					if(result < min) {
						min = result;
					}
				}
			}
			
		}
		
		return (min > result ? -1 : min);
	}

}
