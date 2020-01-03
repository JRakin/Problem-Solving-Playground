import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
		String [] arrItem=scan.nextLine().split(" ");
		
		for(int i = 0; i < 5; i++) {
			
			int item = Integer.parseInt(arrItem[i].trim());
			arr[i] = item;
		}
		
		minMaxSum(arr);
		
		scan.close();

	}
	static void minMaxSum(int [] sum) {
		
		
		//sorting
		for(int k = 0; k < sum.length-1; k++) {
			
			for(int m = 0; m < sum.length-k-1; m++) {
				
				if(sum[m] > sum[m+1]) {
					
					int temp = sum[m];
					sum[m] = sum[m+1];
					sum[m+1] = temp;
				}
			}
		}
		
		long maxSum = 0;
		long minSum = 0;
		
		//then easily find the sum
		for(int x = 1; x < sum.length; x++) {
			
			maxSum += sum[x];
		}
		
		for(int y = 0; y < sum.length-1; y++) {
			
			minSum += sum[y];
		}
		
		System.out.println(minSum+" "+maxSum);
	}

}
