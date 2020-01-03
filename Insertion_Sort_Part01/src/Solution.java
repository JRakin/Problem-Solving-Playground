import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		insertionSort(arr);
		
		scan.close();

	}
	
	static void insertionSort(int [] arr) {
		
		int temp;
		int hole;
		
		for(int k = 1; k < arr.length; k++) {
			temp = arr[k];
			hole=k;
			
			while(hole > 0 && arr[hole-1] > temp) {
				arr[hole] = arr[hole-1];
				hole--;
				
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			arr[hole]=temp;
		}
		
		for(int m = 0; m < arr.length; m++) {
			System.out.print(arr[m]+" ");
		}
		
	}
	
}
