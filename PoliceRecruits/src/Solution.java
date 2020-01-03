import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 19, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(countCrime(arr));

	}
	static int countCrime(int[] arr) {
		int police = 0;
		int crime = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				police += arr[i];
			}
			else if(arr[i] < 0) {
				if(police != 0) {
					police -= 1;
				}
				else {
					crime++;
				}
			}
		}
		
		return crime;
	}

}
