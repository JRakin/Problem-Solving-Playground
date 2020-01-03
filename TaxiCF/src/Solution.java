import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 18, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(numberOfTaxi(arr));
	}
	static int numberOfTaxi(int[] arr) {
		
		int sum = 0;
		int c1 = 0,c2 = 0,c3 = 0,c4 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				c1++;
			}
			else if(arr[i] == 2) {
				c2++;
			}
			else if(arr[i] == 3) {
				c3++;
			}
			else {
				c4++;
			}
		}
		
		sum += c4;
		c4 = 0;
		
		sum += (c2/2);
		c2 = c2%2;
		
		if(c1 >= c3) {
			sum += c3;
			c1 -= c3;
			c3= 0;
			
			sum += c1/4;
			c1 = c1 % 4;
			
			if(c1+c2*2 <= 4 && c1+c2*2 >0) {
				sum += 1;
				c1 = 0;
				c2 = 0;
			}
			else if(c1 == 3 && c2 == 1) {
				sum += 2;
				c1 = 0;
				c2 = 0;
			}
		}
		else if(c1 < c3) {
			sum += c1;
			c3 -= c1;
			c1 = 0;
			
			sum += c3 + c2;
		}
		
		return sum;
		
	}

}
