import java.util.Scanner;


/**
 * @author Rakin
 *
 * Dec 29, 2019
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
	}
	static void gifts(int[] arr) {
		
		boolean[] isVisited = new boolean[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				isVisited[arr[i]] = true;
			}
			else {
				isVisited[arr[i]] = false;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			
		}
	}

}
