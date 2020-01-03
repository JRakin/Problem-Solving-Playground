import java.util.Scanner;

public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		sorting(arr);

	}
	
	static void sorting(int [] arr) {
		
		int numberOfSwaps = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int k =0; k < arr.length-1; k++) {
				
				if(arr[k] > arr[k+1]) {
					
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
					
					numberOfSwaps++;
					
				}
				
			}
			
			if (numberOfSwaps == 0) {
		        break;
		    }
			
		}
		
		System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
		System.out.println("First Element: " +arr[0]);
		System.out.println("Last Element: " +arr[arr.length-1]);
		
	}

}
