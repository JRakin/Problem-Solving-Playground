import java.util.Scanner;

//juggling algorithm

public class Solution {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int rotate = scan.nextInt();

		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int[] br = leftRotation(arr,rotate, n);
		
		System.out.println();

		for(int k = 0; k < br.length; k++) {
			System.out.println(br[k]+" ");
		}

	}
	static int[] leftRotation(int[] ar, int r, int n) {

		int temp;
		int j;
		int k;
		int i;
		for(i = 0; i < gcd(r,n); i++) {

			temp = ar[i];
			j = i;

			while(true) {
				
				k = j + r;
				
				if(k >= n) {
					k = k - n;
				}
				if(k == i) {
					break;
				}
				
				ar[j] = ar[k];
				j = k;
			}
			ar[j] = temp;
		}

		return ar;
	}
	static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}

}
