import java.util.Scanner;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr1 = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}
		
		int[] arr2 = new int[m];
		
		for(int k = 0; k < m; k++) {
			arr2[k] = scan.nextInt();
		}
		
		System.out.println(twoSets(arr1,arr2));

	}
	static int twoSets(int[] arr1, int[] arr2) {
		
		int count = 0;
		
		int l = lcm(arr1);
		int g = gcd(arr2);

		
		//System.out.println(l+" "+g);
		
		for(int i = l, j = 2; i <= g; i = l*j,j++) {
			
			if(g % i == 0) {
				
				count++;
			}
		}
		
		return count;
	}
	static int gcd(int[] arr) {
		
		int result = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			result = gcd(result,arr[i]);
		}
		return result;
		
	}
	static int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		else {
			return gcd(b, a % b);
		}
	}
	
	static int lcm(int[] arr) {
		
		int res = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			res = lcm(res, arr[i]);
		}
		
		return res;
	}
    static int lcm(int a, int b) {
		return a * (b/gcd(a,b));
	}
	
}
