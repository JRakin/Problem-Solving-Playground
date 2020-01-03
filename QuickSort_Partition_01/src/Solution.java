import java.util.Scanner;

public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int [] result = quickSort(arr,0,n-1);
		
		for(int i:result) {
			System.out.print(i+" ");
		}

	}
	
    static int[] quickSort(int [] arr, int low, int high) {
		
		int pivot = arr[low];
		int index = high;
		
		for(int i = high; i > 0; i--) {
			
			if(arr[i] >= pivot) {
				
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index--;
			}
		}
		
		int temp = arr[index];
		arr[index] = arr[low];
		arr[low] = temp;
		
		return arr;
	}

}
