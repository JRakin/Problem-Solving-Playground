import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 18, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println(sum/(double) n);

	}

}
