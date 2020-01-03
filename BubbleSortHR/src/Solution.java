import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 29, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		sort(arr);

	}
	static void sort(int[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					count++;
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Array is sorted in "+count+" swaps.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[arr.length-1]);
	}

}
