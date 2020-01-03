import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 28, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(findToys(arr,k));

	}
	static int findToys(int[] arr, int k) {
		
		int[] ar = mergeSort(arr);
		
		
		int res = 0;
		int count = 0;
		
		for(int i = 0; i < ar.length; i++) {
			
			res += ar[i];
			
			count++;
			if(res > k) {
				count--;
				break;
			}
		}
		
		return count;
		
	}
	static int[] mergeSort(int[] arr) {
		
		if(arr.length < 2) {
			return arr;
		}
		
		int mid = arr.length / 2;
		
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
