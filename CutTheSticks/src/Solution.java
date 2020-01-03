import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jun 4, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		cuttingSticks(arr);

	}
	static void cuttingSticks(int arr[]) {
		
		Arrays.sort(arr);
		
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > 0 ) {
				
				min = arr[i];
				
				int count = 0;
				for(int k = 0; k < arr.length; k++) {
					if(arr[k] >= min) {
						arr[k] -= min;
						count++;
					}
				}
				System.out.println(count);
			}
			
		}
		
	}

}
