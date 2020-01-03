import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int m = 0; m < t; m++) {
			int n = scan.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			
			System.out.println(runningTime(arr));
		}
		scan.close();
		
	}
	static long runningTime(int [] arr) {
		
		int temp;
		int hole;
		long count=0;
		
		for(int k = 1; k < arr.length; k++) {
			temp = arr[k];
			hole = k;
			
			while(hole > 0 && arr[hole-1] > temp) {
				arr[hole] = arr[hole-1];
				hole--;
				count++;
			}
			arr[hole] = temp;
		}
		
		return count;
	}

}
