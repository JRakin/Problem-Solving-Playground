import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 14, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(equalize(arr));

	}
	static int equalize(int[] arr) {
		
		int[] count = new int[101];
		int max = 0;
		int res = 0;
		
		for(int i = 0; i < 101; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 0; i < 101; i++) {
			if(count[i] > max) {
				max = count[i];
			}
		}
		
		for(int i = 0; i < 101; i++) {
			if(count[i] != 0) {
				res += count[i];
			}
		}
		
		return res - max;
	}

}
