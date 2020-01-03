import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		int[] result = sort(arr, 0, n-1);
		
		for(int k = 0; k < result.length; k++) {
			
			System.out.print(result[k]+ (k != result.length ? " ":""));
		}
		
		scan.close();

	}
	
	static int partition(int [] arr, int low, int high) {
		
		int pivot = arr[high];
		int index = low-1;
		
		for(int i = low; i < high; i++) {
			
			if(arr[i] <= pivot) {
				
				index++;
				
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		
		int temp = arr[index+1];
		arr[index+1] = arr[high];
		arr[high] = temp;
		
		return index+1;
	}
	
	static int [] sort(int[] arr, int low, int high) {
		
		if(low < high) {
			
			int part = partition(arr, low, high);
			
			sort(arr, low , part-1);
			sort(arr, part+1, high);
		}
		
		return arr;
	}

}
