import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 9, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] ar = mergeSort(arr);
		
		for(int k = 0; k < ar.length; k++) {
			System.out.print(ar[k]+"  ");
		}

	}
	static int[] mergeSort(int[] arr) {
		
		if(arr.length < 2) {
			return arr;
		}
		
		int mid = arr.length / 2;
		//System.out.println(mid+" "+(arr.length-mid));
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
		
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for(int k = mid; k < arr.length; k++) {
			right[k-mid] = arr[k];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,arr);
		
		
		return arr;
		
	}
	static void merge(int[] left, int[] right, int[] arr) {
		
		int i = 0;
		int j = 0; 
		int k = 0;
		
		while(i < left.length && j < right.length) {
			
			if(left[i] < right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			}
			else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		
		while(i < left.length) {
			arr[k++] = left[i++];
		}
		while(j < right.length) {
			arr[k++] = right[j++];
		}
	}

}
