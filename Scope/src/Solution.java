import java.util.Scanner;

public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		Difference difference = new Difference(arr);
		
		difference.computeDifference();
		
		System.out.println(difference.maximumDifference);

	}

}
