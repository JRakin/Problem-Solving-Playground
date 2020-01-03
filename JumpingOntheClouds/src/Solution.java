import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(jump(arr));

	}
	static int jump(int[] arr) {
		
		int count = 0;
		
		
		for(int i = 1; i < arr.length; i+=2) {
			
			int j = i+1;
			if(i == arr.length-2) {
				i = j;
			}
			if(arr[i] == 1) {
				i = j;
				count++;
			}
			else {
				count++;
			}
		}
		return count;
	}

}
