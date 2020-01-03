import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i< n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] result = countingSort(arr);
		
		for(int k = 0; k < result.length; k++) {
			System.out.print(result[k]+ (k != result.length-1 ? " ":""));
		}
		System.out.println();
		
		scan.close();

	}
	
	static int[] countingSort(int [] arr) {
		
		int[] count = new int[100];
		
		//initializing all count index as 0
		for(int i = 0; i< 100; i++) {
			count[i] = 0;
		}
		//counting values
		for(int k = 0; k < arr.length; k++) {
			count[arr[k]]++;
		}
		
		return count;
	}

}
