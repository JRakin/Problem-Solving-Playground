import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n ;i++) {
			arr[i] = scan.nextInt();
		}
		int result = intro(value, arr);
		System.out.println(result);
		
		scan.close();

	}
	static int intro(int v, int[] arr) {
		int k;
		for( k = 0; k < arr.length; k++) {
			if(arr[k] == v) {
				break;
			}
		}
		return k;
	}

}
