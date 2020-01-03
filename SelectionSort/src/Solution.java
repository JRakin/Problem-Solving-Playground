import java.util.Scanner;

/**
 * @author Rakin
 *
 * Dec 28, 2019
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
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}
	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//finding the index of minimum value
	static int findMinIndex(int[] arr, int start) {
		
		int min_index = start;
		++start;
		
		while(start < arr.length) {
			if(arr[start] < arr[min_index]) {
				min_index = start;
			}
			++start;
		}
		return min_index;
	}
	static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			int min_index = findMinIndex(arr, i);
			
			if(i != min_index) {
				swap(arr, i, min_index);
			}
		}
	}
	

}
