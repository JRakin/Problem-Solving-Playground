import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 13, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		
		sequence(arr);
		

	}
	static void sequence(int[] arr) {
		
		int[] brr = Arrays.copyOf(arr, arr.length);
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int k = 0; k < brr.length; k++) {
				int p = 0;
				if(arr[i] == brr[k]) {
					p = k + 1;
					
					int q = 0;
					for(int j = 0; j < brr.length; j++) {
						
						if(brr[j] == p) {
							q = brr[j];
							//System.out.println(q);
							break;
						}
					}
					for(int j = 0; j < brr.length; j++) {
						if(brr[j] == q) {
							System.out.println(j+1);
						}
					}
				}
			}
		}
	}

}
