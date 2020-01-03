import java.util.Scanner;

/**
 * @author Rakin
 *
 * Dec 23, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			minimumBribes(arr);
		}

	}
	static void minimumBribes(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - (i+1) > 2) {
				System.out.println("Too chaotic");
				return;
			}
		}
		
		int numOfSwaps = 0;
		boolean isSwapped;
		
		for(int i = 0; i < arr.length; i++) {
			
			isSwapped = false;
			
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					numOfSwaps++;
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}
		}
		System.out.println(numOfSwaps);
	}

}
