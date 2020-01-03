import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		
		int result = divisiblePair(arr, k);
		
		System.out.println(result);
		
		scan.close();

	}
	
	static int divisiblePair(int [] arr, int t) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int k = 1; k < arr.length; k++) {
				
				if(i < k && (arr[i] + arr[k])%t == 0) {
					
					count++;
				}
			}
		}
		
		return count;
	}

}
