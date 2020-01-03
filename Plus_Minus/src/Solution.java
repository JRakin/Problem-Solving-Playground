import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int [] arr = new int[n];
		
		String [] arrItem = scan.nextLine().split(" ");
		
		for(int k = 0; k < n; k++) {
			int item = Integer.parseInt(arrItem[k]);
			arr[k] = item;
		}
		
		plusMinus(arr);
		
		scan.close();

	}
	static void plusMinus(int [] arr) {
		int countPos = 0;
		int countNeg = 0;
		int countZero = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if( arr[i] == 0) {
				countZero++;
			}
			else if( arr[i] > 0) {
				countPos++;
			}
			else {
				countNeg++;
			}
		}
		
		System.out.println((double)countPos/arr.length);
		System.out.println((double)countNeg/arr.length);
		System.out.println((double)countZero/arr.length);
	}

}
