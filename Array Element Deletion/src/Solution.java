import java.util.Scanner;

/**
 * @author Rakin
 *10:09:25 PM
 * licensed to Rakin
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<n; i++) {
			if(arr[i] < 0) {
				for(int k=i-1; k<n; k++) {
					int temp = arr[i];
					arr[i] = arr[i+1];
				}
			}
		}
		
		for(int i=arr.length-1; i>0; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
