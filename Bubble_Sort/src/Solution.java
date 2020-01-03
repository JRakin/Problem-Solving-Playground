import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int m = 0; m  <t; m++) {
			
			int n = scan.nextInt();
			int index = scan.nextInt();
			
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			
			int [] sortedArray = bubbleSort(array);
			
			int minValue = 0;
			int maxValue = 0;

			for(int k = 0; k < sortedArray.length-index; k++) {
				minValue+=sortedArray[k];
			}
			
			for(int l = index; l < sortedArray.length; l++) {
				maxValue+=sortedArray[l];
			}
			System.out.println(maxValue-minValue);
		}
		
		
		scan.close();
	}
	static int[] bubbleSort(int[] ar) {
		
		for(int i = 0; i < ar.length-1; i++) {
			
			for(int k = 0; k < ar.length-i-1; k++) {
				
				if(ar[k] > ar[k+1]) {
					
					int temp = ar[k];
					ar[k] = ar[k+1];
					ar[k+1] = temp;
				}
			}
		}
		
		return ar;
	}

}
