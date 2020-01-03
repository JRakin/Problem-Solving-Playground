import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 23, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(workBook(arr,n,k));

	}
	static int workBook(int[] arr, int n, int k) {
		
		int count = 0;
		int page = 1;
		
		//int extra = 0;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= arr[i]; j++) {
				if(page == j) {
					count++;
				}
				if(j % k == 0 || j == arr[i]) {
					page++;
				}
				/*if(j == arr[i]) {
					extra = arr[i];
				}*/
			}
			/*if(extra % k != 0) {
				page++;
			}*/
		}
		
		return count;
	}

}
