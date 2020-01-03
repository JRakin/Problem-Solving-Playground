import java.util.Scanner;

public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = Integer.parseInt(scan.next().trim());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		int [] result = countingSort(arr);
		
		for (int i = 0; i < result.length; i++) {
			
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
		
		scan.close();

	}
	static int [] countingSort(int [] arr) {
		
		int [] output = new int[arr.length];
		int [] count = new int[100];
		
		
		for(int i=0; i<100; i++) {
			
			count[i] = 0;
		}
		//counting element
		for(int k=0; k<arr.length; k++) {
			
			count[arr[k]]++;
		}
		
		//changing to actual position
		
		for(int m=1; m<=99; m++) {
			
			count[m] += count[m-1];
		}
		
		for(int i=0; i<arr.length; i++) {
			
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		
		/*for(int k=0; k<arr.length; k++) {
			
			arr[k] = output[k];
		}*/
		
		return output;
	}

}
